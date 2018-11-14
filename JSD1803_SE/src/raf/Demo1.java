package raf;


import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("hello.txt","r");
		
		for (int i = 0; i < raf.length()/100; i++) {
				
			byte [] data = new byte[32];
			raf.read(data);
			String username = new String(data,"GBK");
			System.out.print("\t");
			
			 raf.read(data);
			 String password = new String(data,"GBK");
			 System.out.print("\t");
			 
			 raf.read(data);
			 String nickname= new String(data,"GBK");
			 System.out.println("\t");
			 
			 int age = raf.readInt();
			 System.out.println("\t");
			 
			 System.out.println(username+","+password+","+nickname+","+age);
			 
		}
	}

}
