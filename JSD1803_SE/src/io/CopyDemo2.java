package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流:缓冲流是一对高级流
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream;
 * 缓冲字节输入输出流是用来加快读写效率的
 * 使用缓冲流完成复制操作
 * @author live
 *
 */

public class CopyDemo2 {
	/**
	 * 使用文件流读取源文件，使用文件输出流往新文件里写，使用块读写形式
	 * 
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Koala.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("Koala_1.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d = -1;
		/**使用了缓冲流读写时，我们就不再需要关注必须使用块读写加快效率了，
		 * 因为缓冲流内部维护了一个字节数组，最终会将我们的读写操作转换为
		 * 块读写加快读写效率的。
		 * 
		 */
		long start = System.currentTimeMillis();
		while ((d=bis.read())!=-1) {
			bos.write(d);
			
			
		}
		long end = System.currentTimeMillis();
		System.out.println("读写完毕！耗时："+(end-start)+"ms");
		bis.close();
		bos.close();
		
		
	}

}
