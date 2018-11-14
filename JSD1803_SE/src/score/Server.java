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
			System.out.println("���������.......");
			service = new ServerSocket(8088);
			System.out.println("������������.......");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void start(){
		
	
		try {
			System.out.println("�ȴ��ͻ�������.......");
			Socket socket = service.accept();
			System.out.println("һ���ͻ����Ѿ�����.......");
			
			InputStream is= socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("�ͻ��˷�����Ϣ:"+str);
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
