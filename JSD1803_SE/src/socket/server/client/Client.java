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

/**聊天室客户端
 * @author live
 *
 */	
//	定义一个属性（类似超类的作用）
	/**java.net.Socket套接字封装了TCP协议通讯，使用它可以很方便的以TCP协议为通讯方式进行数据传输；
	 * 
	 */
	private Socket socket;
//	构造方法，用来初始化客户端
	public Client(){
/*实例化Socket时，需要传入两个参数，
 * 1：服务端IP地址；
 * 2：服务端端口号；
 * 通过Ip地址可以找到服务端计算机，通过端口号可以找到运行在服务端计算机上的服务端
 * 应用程序，实例化的过程就是连接的过程，若连接失败，那么这里会抛出异常；
 * 		
*/	try{	
	               System.out.println("正在连接服务器..........");  
	               socket = new Socket("172.195.105.212",8080);
	               System.out.println("服务器已连接！");
	
           }catch(UnknownHostException e){
        	   e.printStackTrace();
        	   
           }catch(IOException e){
        	   e.printStackTrace();
        	   
           }
	}
//  客户端开始工作的方法
	public void Start(){
		System.out.println("请输入 消息：");
		
			try {
				//先启动读取服务端消息的线程
				ServerHandler handler = new ServerHandler();
				Thread t = new Thread(handler);
				t.start();
				
				BufferedReader br = new BufferedReader(
						new InputStreamReader(System.in));
			
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"GBK");
				BufferedWriter bw = new BufferedWriter(osw);
				PrintWriter pw = new PrintWriter(bw,true);
				//创建输入流读取服务端消息
				
				
				
				
				
//				Scanner scan = new Scanner(System.in);	
//				String mes;
//				mes=scan.nextLine();
				String message =null;
				while(true){
					message= br.readLine();                                 //键盘输入
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
			  //创建输入流读取服务端信息
			 
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
