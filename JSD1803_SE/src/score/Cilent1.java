package score;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cilent1 {
	private Socket socket;
	Cilent1(){
		
		try {
			System.out.println("�������ӷ�����.......");
			socket = new Socket("localhost",8088);
			System.out.println("������������");
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
	public void start(){
		System.out.println("���������ݣ���");
		try {
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os,"GBK");
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(os,true);
			Scanner scan = new Scanner(System.in);
			String data = scan.nextLine();
			pw.println(data);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	

}      
	public static void main(String[] args) {
		Cilent1 cilent = new Cilent1();
		cilent.start();
}
}