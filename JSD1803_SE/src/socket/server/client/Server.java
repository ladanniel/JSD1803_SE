package socket.server.client;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;


/**�����ҷ����
 * @author live
 *
 */
public class Server {
	                                                                  /**
	                                                                   * �����ڷ���˵�Java.net.ServerSocket
	                                                                   * ��Ҫ���������ã�
	                                                                   * 1����ϵͳ�������˿ڣ��ͻ�����ͨ������˿���������������ӵ�
	                                                                   * 2����������˿ڣ��ȴ��ͻ������ӡ�һ��һ���ͻ���ͨ������˿������˼������ӣ���ôServersocket������
                                                                   	   * ����һ��Socket��ͻ��˽���ͨѶ��
	                                                                   */
	private ServerSocket server;
	private PrintWriter[] allOut={};
    /**
     * ����ClientHUandler��Server���ڲ��࣬��ô����server�϶�������Կ��Ա�ClientHandler��ʵ�����ʣ��Ӷ�
     * ��������������ClientHandler��������ʹ�ã�                                                                 
     */
	//	������ʼ�������,����������˿�
	public Server(){
		try{
			System.out.println("���������......");
		    server = new ServerSocket(8080);
		    System.out.println("������������......");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
                                                                     //����˿�ʼ�����ķ�����
	public void start(){
                                                                      //		accept ����,�ȴ��ͻ���������
		                                                                /**
		                                                                * ServerSocket�ṩ�ķ�����
		                                                                 * Socket accept�����÷�����һ���������������ú����������֪��һ���ͻ���������Ϊֹ����ʱ�÷����᷵��
		                                                                 * һ��Socket��ͨ�����Socket������ս������ӵĿͻ��˽���ͨѶ
		                                                                 */
		try{

			while(true){
		    System.out.println("�ȴ��ͻ�������......");
		    Socket socket = server.accept();
		    System.out.println("һ���ͻ����Ѿ�������......");
		 
		                                                                //����һ���̣߳�����ÿͻ��˽�������
		    ClientHandler handler = new ClientHandler(socket);
		    Thread t = new Thread(handler);
		    t.start();
		    
			}	
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
   	      Server server = new Server();
       	server.start();
	}
	
	
	 private class ClientHandler implements Runnable{
		 private Socket socket;
		 public ClientHandler(Socket socket){
			 this.socket = socket;
			 
		 }
			public void run(){
				System.out.println("һ���߳������ˡ���������");
			  PrintWriter pw = null;
				try {
					InputStream is = socket.getInputStream();                                 //����ͨѶ
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);
					                                                                           /**
					                                                                            * ͨ��Socket��ȡ����������ڸ��ͻ��˷�����Ϣ
					                                                                            * ���ͻ��������˶Ͽ�����ʱ����ͬϵͳ�Ŀͻ����ڷ����������ֲ�̫һ����Windows�Ŀͻ��˶Ͽ�ʱ�����������
					                                                                            * br.readLine����ͨ����ֱ���׳��쳣��
					                                                                            * Linux�Ŀͻ��˶Ͽ�ʱ�������br.readLine�����᷵��null��null:��ʾ�Ѿ�������ĩβ�ˣ���
					                                                                            */
					 pw = new PrintWriter(new BufferedWriter(
							                         new OutputStreamWriter(
							                         socket.getOutputStream(),"GBK")),true);
				                                                                                /**
					                                                                             * �������������allout���Ա�������ClientHandler���Խ���Ϣ���͸���ǰ�ͻ���
					                                                                             */
					 synchronized(allOut){                                                      //Ϊ��ֹ������ȫ���⣬�����������synchronized
					 //1.������allout
					
					allOut = Arrays.copyOf(allOut, allOut.length+1);
					System.out.println("allOut.length"+allOut.length);  //��׮
					
					//2.����ǰ�ͻ�������������������
					allOut[allOut.length-1] = pw;
					System.out.println("��ǰ����������"+allOut.length);
				}
					String message =null;                                                    //���ջ���������
					while ((message=br.readLine())!=null) {
						message = br.readLine();
						System.out.println("�ͻ���˵----:"+message);
						//������Ϣ���͸��ͻ���
						pw.println("�ͻ���˵"+message);
						
						synchronized(allOut){
						//����allOut,ת����Ϣ����ֹ�̲߳�����ȫ��ͬʱ��ֹ�ڴ�����Ϣ��ʱ����һ���������ݻ������ݣ�����������Ϊͳһ������ɻ����ϵ
						for (int i = 0; i < allOut.length; i++) {
							allOut[i].println("�ͻ���˵��"+message);
						}
						}
					}
				} catch (IOException e) {
					
					
				}finally{
					//����ͻ��˶Ͽ����ӵĲ���
					
					//���ÿͻ��˵�������ӹ���������ɾ��
					
					synchronized(allOut){
					//��pw��allout��ɾ��
					
					for (int i = 0; i < allOut.length; i++) {
						if (allOut[i]==pw) {
							allOut[i]= allOut[allOut.length-1];
							allOut= Arrays.copyOf(allOut, allOut.length-1);               //����Ҫɾ���������һ��λ���ϵ����ݣ�����������������
							break;
						}
						System.out.println("��ǰ��������"+allOut.length);
					}
					}
					
					//�ر�socket���ͷ���Դ
					if (socket!=null) {
						try {
							socket.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						
					}
				}
				
			
				
			}
			

	
	  }
}
 
