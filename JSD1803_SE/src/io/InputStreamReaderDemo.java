package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**ת����������������
 * InputStreamReader,���Զ�д�ַ�
 * 
 * @author live
 *
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		
		char[]data = new char[100];
		int len = -1;
		while ((len =isr.read(data))!=-1) {
			String str = new String(data,0,len);//�������±��Ӧ�Ķ���������ת�����ַ���
			System.out.println(str);
			
			
		}isr.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		FileInputStream fis = new FileInputStream("osw.txt");
//		InputStreamReader isr = new InputStreamReader(fis);
//		char[]data = new char[1024];
//		int len=-1;
//		while((len=isr.read(data))!=-1){
//			String str = new String(data,0,len);//����ȡ����������ת�����ַ���
//			System.out.println(len);
//			
//			
//		}
//		isr.close();
//		
		

//		FileInputStream fis = new FileInputStream("osw.txt");
//		InputStreamReader isr = new InputStreamReader(fis);
////	   int d = -1;
////	   while((d=isr.read())!=-1){
////		   System.out.print((char)d);
////		   
////	   }isr.close();
//	   
//	  
	}

}
