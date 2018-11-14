package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**文件读进来，
 * 文件写出去，（主体都是文件）
 * java.io.BufferedReader
 * 缓冲字符输入流，可以按行读取字符串
 * @author live
 *
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		

		FileInputStream fis = new FileInputStream("./src/io/BufferedReaderDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
			/*BufferedReader提供了直接读取一行字符串的方法，
			 * String ReadLine();
			 * 该方法会连续读取若干字符，当读取到换行符时，将之前读取的字符，以字符串形式返回、
			 * 若返回值为null时，表示流的末尾
			 * 
			 */
			
		}br.close();

	
	
	
	}
	

}
