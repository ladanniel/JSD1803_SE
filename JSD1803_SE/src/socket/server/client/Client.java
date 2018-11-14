package socket.server.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

/**�����ҿͻ���
 * @author live
 *
 */	
//	����һ�����ԣ����Ƴ�������ã�
	/**java.net.Socket�׽��ַ�װ��TCPЭ��ͨѶ��ʹ�������Ժܷ������TCPЭ��ΪͨѶ��ʽ�������ݴ��䣻
	 * 
	 */
	private Socket socket;
//	���췽����������ʼ���ͻ���
	public Client(){
/*ʵ����Socketʱ����Ҫ��������������
 * 1�������IP��ַ��
 * 2������˶˿ںţ�
 * ͨ��Ip��ַ�����ҵ�����˼������ͨ���˿ںſ����ҵ������ڷ���˼�����ϵķ����
 * Ӧ�ó���ʵ�����Ĺ��̾������ӵĹ��̣�������ʧ�ܣ���ô������׳��쳣��
 * 		
*/	try{	
	               System.out.println("�������ӷ�����..........");  
	               socket = new Socket("172.195.105.212",8080);
	               System.out.println("�����������ӣ�");
	
           }catch(UnknownHostException e){
        	   e.printStackTrace();
        	   
           }catch(IOException e){
        	   e.printStackTrace();
        	   
           }
	}
//  �ͻ��˿�ʼ�����ķ���
	public void Start(){
		System.out.println("������ ��Ϣ��");
		
			try {
				//��������ȡ�������Ϣ���߳�
				ServerHandler handler = new ServerHandler();
				Thread t = new Thread(handler);
				t.start();
				
				BufferedReader br = new BufferedReader(
						new InputStreamReader(System.in));
			
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"GBK");
				BufferedWriter bw = new BufferedWriter(osw);
				PrintWriter pw = new PrintWriter(bw,true);
				//������������ȡ�������Ϣ
				
				
				
				
				
//				Scanner scan = new Scanner(System.in);	
//				String mes;
//				mes=scan.nextLine();
				String message =null;
				while(true){
					message= br.readLine();                                 //��������
					pw.println(message);
					
						
				}
			} catch (IOException e) {
		
				e.printStackTrace();
			}
		
	
		
	}
	public static void main(String[] args) {
		Client client = new Client();
		client.Start();
		
		
	}
	 private class ServerHandler implements Runnable{
		  public void run(){
			  //������������ȡ�������Ϣ
			 
			  try {
				PrintWriter pw = new PrintWriter(new BufferedWriter(
				          new OutputStreamWriter(
				          socket.getOutputStream(),"GBK")),true);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			  
		  }
}
}
