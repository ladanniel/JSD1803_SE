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


/**聊天室服务端
 * @author live
 *
 */
public class Server {
	private ServerSocket server;
//	private PrintWriter[] allOut={};
	private List<PrintWriter> allOut = new ArrayList<PrintWriter>();
  
	//	用来初始化服务端,向服务端申请端口
	public Server(){
		try{
			System.out.println("启动服务端......");
		    server = new ServerSocket(8080);
		    System.out.println("服务端启动完毕......");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
                                                                     //服务端开始工作的方法，
	public void start(){
                                                                     
		try{

			while(true){
		    System.out.println("等待客户端连接......");
		    Socket socket = server.accept();
		    System.out.println("一个客户端已经连接了......");
		 
		                                                                //启动一个线程，处理该客户端交互工作
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
				System.out.println("一个线程启动了、、、、、");
			  PrintWriter pw = null;
				try {
					InputStream is = socket.getInputStream();                                 //接收通讯
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);
					 pw = new PrintWriter(new BufferedWriter(
							                         new OutputStreamWriter(
							                         socket.getOutputStream(),"GBK")),true);
					 synchronized(allOut){                                                      //为防止并发安全问题，在数组上添加synchronized
					allOut.add(pw);
				}
					String message =null;                                                    //接收缓冲区内容
					while ((message=br.readLine())!=null) {
						message = br.readLine();
						System.out.println("客户端说----:"+message);
						//将此消息发送给客户端
						pw.println("客户端说"+message);
						
						synchronized(allOut){
					for (PrintWriter o : allOut) {
						o.println("客户端说："+message);
					}
						}
					}
				} catch (IOException e) {
					
					
				}finally{
					//处理客户端断开连接的操作
					
					//将该客户端的输出流从共享数组中删除
					
					synchronized(allOut){
					//将pw从allout中删除
					allOut.remove(pw);
						}
						System.out.println("当前在线人数"+allOut.size());
					}
					//关闭socket，释放资源
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

 
