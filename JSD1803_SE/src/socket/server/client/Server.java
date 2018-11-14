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


/**聊天室服务端
 * @author live
 *
 */
public class Server {
	                                                                  /**
	                                                                   * 运行在服务端的Java.net.ServerSocket
	                                                                   * 主要有两个作用：
	                                                                   * 1：向系统申请服务端口，客户就是通过这个端口与服务器简历连接的
	                                                                   * 2：监听服务端口，等待客户端连接。一旦一个客户端通过服务端口语服务端简历连接，那么Serversocket会主动
                                                                   	   * 创建一个Socket与客户端进行通讯。
	                                                                   */
	private ServerSocket server;
	private PrintWriter[] allOut={};
    /**
     * 由于ClientHUandler是Server的内部类，那么，在server上定义的属性可以被ClientHandler的实例访问，从而
     * 可以用于让所有ClientHandler共享数据使用；                                                                 
     */
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
                                                                      //		accept 阻塞,等待客户端连接上
		                                                                /**
		                                                                * ServerSocket提供的方法：
		                                                                 * Socket accept（）该方法是一个阻塞方法，调用后进入阻塞，知道一个客户端连接上为止，这时该方法会返回
		                                                                 * 一个Socket，通过这个Socket可以与刚建立连接的客户端进行通讯
		                                                                 */
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
					                                                                           /**
					                                                                            * 通过Socket获取输出流，用于给客户端发送消息
					                                                                            * 当客户端与服务端断开连接时，不同系统的客户端在服务端这边体现不太一样，Windows的客户端断开时，服务端这里
					                                                                            * br.readLine方法通常会直接抛出异常，
					                                                                            * Linux的客户端断开时，服务端br.readLine方法会返回null（null:表示已经到流的末尾了）；
					                                                                            */
					 pw = new PrintWriter(new BufferedWriter(
							                         new OutputStreamWriter(
							                         socket.getOutputStream(),"GBK")),true);
				                                                                                /**
					                                                                             * 将该输出流存入allout，以便其他的ClientHandler可以将消息发送给当前客户端
					                                                                             */
					 synchronized(allOut){                                                      //为防止并发安全问题，在数组上添加synchronized
					 //1.先扩容allout
					
					allOut = Arrays.copyOf(allOut, allOut.length+1);
					System.out.println("allOut.length"+allOut.length);  //打桩
					
					//2.将当前客户端输出流存入数组最后；
					allOut[allOut.length-1] = pw;
					System.out.println("当前在线人数："+allOut.length);
				}
					String message =null;                                                    //接收缓冲区内容
					while ((message=br.readLine())!=null) {
						message = br.readLine();
						System.out.println("客户端说----:"+message);
						//将此消息发送给客户端
						pw.println("客户端说"+message);
						
						synchronized(allOut){
						//遍历allOut,转发消息，防止线程并发安全，同时防止在处理消息的时候，另一个锁，扩容或者缩容，所以锁对象为统一个，变成互斥关系
						for (int i = 0; i < allOut.length; i++) {
							allOut[i].println("客户端说："+message);
						}
						}
					}
				} catch (IOException e) {
					
					
				}finally{
					//处理客户端断开连接的操作
					
					//将该客户端的输出流从共享数组中删除
					
					synchronized(allOut){
					//将pw从allout中删除
					
					for (int i = 0; i < allOut.length; i++) {
						if (allOut[i]==pw) {
							allOut[i]= allOut[allOut.length-1];
							allOut= Arrays.copyOf(allOut, allOut.length-1);               //假设要删除的是最后一个位置上的内容，则自身覆盖自身并缩容
							break;
						}
						System.out.println("当前在线人数"+allOut.length);
					}
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
}
 
