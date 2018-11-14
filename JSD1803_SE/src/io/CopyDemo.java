package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * @author live
 *
 */

public class CopyDemo {
	/**
	 * 1.使用文件输入流读取源文件，
	 * 2.使用文件输出流完往新文件里写，
	 * 3.使用块读写形式将源文件数据写入到新文件完成复制操作
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream fos = new FileOutputStream("fos_j.txt");
		byte [] buf = new byte[1024*10];
		int len = -1;
		while ((len=fis.read(buf))!=-1) {
			
			fos.write(buf);
			
			
			
		}System.out.println("读写完毕");
		fis.close();
		fos.close();
		
		
		
		
		
//		FileInputStream fis = new FileInputStream("fos.txt");
//		FileOutputStream fos = new FileOutputStream("fos_d.txt");
//		byte[] bus = new byte[1024*10];
//		int len = -1;
//		while ((len=fis.read(bus))!=-1) {
//			fos.write(bus,0,len);
//		
//			
//		}
//		System.out.println("读写完毕");
//		fis.close();
//		fos.close();
		
		
	}

}
