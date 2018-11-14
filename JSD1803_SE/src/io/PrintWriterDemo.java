package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**缓冲字符流
 * java.io.BufferedWriter;
 * java.io.BufferedReader;
 * 内部有缓冲区，可以块读写字符，并且可以按行读写字符串
 * java.io.PrintWriter;
 * 具有自动刷新的缓冲字符输出流，内部总是会连接
 * BufferedWriter作为缓冲操作；
 * 
 * @author live
 *
 */

public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/**
		 * printWriter提供了直接对文件写操作构造法
		 * printWriter（String path）
		 * printWriter(File file)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","GBK");
		pw.println("《清明》.唐.杜牧");
		pw.println("清明时节雨纷纷，路上行人欲断魂；");
		pw.print("借问酒家何处有，牧童遥指杏花村。");
		System.out.println("读写完毕");
		pw.close();
		
		
	}

}
