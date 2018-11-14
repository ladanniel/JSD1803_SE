package score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket service;
	public Server(){
		
		try {
			System.out.println("启动服务端.......");
			service = new ServerSocket(8088);
			System.out.println("服务端启动完成.......");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void start(){
		
	
		try {
			System.out.println("等待客户端连接.......");
			Socket socket = service.accept();
			System.out.println("一个客户端已经连接.......");
			
			InputStream is= socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("客户端发来消息:"+str);
			br.close();
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

}
