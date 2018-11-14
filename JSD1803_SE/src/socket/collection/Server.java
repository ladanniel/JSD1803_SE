package socket.collection;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**�����ҷ����
 * @author live
 *
 */
public class Server {
	private ServerSocket server;
//	private PrintWriter[] allOut={};
	private List<PrintWriter> allOut = new ArrayList<PrintWriter>();
  
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
					 pw = new PrintWriter(new BufferedWriter(
							                         new OutputStreamWriter(
							                         socket.getOutputStream(),"GBK")),true);
					 synchronized(allOut){                                                      //Ϊ��ֹ������ȫ���⣬�����������synchronized
					allOut.add(pw);
				}
					String message =null;                                                    //���ջ���������
					while ((message=br.readLine())!=null) {
						message = br.readLine();
						System.out.println("�ͻ���˵----:"+message);
						//������Ϣ���͸��ͻ���
						pw.println("�ͻ���˵"+message);
						
						synchronized(allOut){
					for (PrintWriter o : allOut) {
						o.println("�ͻ���˵��"+message);
					}
						}
					}
				} catch (IOException e) {
					
					
				}finally{
					//����ͻ��˶Ͽ����ӵĲ���
					
					//���ÿͻ��˵�������ӹ���������ɾ��
					
					synchronized(allOut){
					//��pw��allout��ɾ��
					allOut.remove(pw);
						}
						System.out.println("��ǰ��������"+allOut.size());
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

 
