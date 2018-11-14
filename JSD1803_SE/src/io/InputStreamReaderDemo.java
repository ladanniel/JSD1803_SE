package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**转换流（输入流）：
 * InputStreamReader,可以读写字符
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
			String str = new String(data,0,len);//将所有下标对应的二进制内容转换成字符串
			System.out.println(str);
			
			
		}isr.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		FileInputStream fis = new FileInputStream("osw.txt");
//		InputStreamReader isr = new InputStreamReader(fis);
//		char[]data = new char[1024];
//		int len=-1;
//		while((len=isr.read(data))!=-1){
//			String str = new String(data,0,len);//将读取的所有内容转换成字符串
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
