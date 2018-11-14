package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**使用PrintWriter,用流链接形式创建
 * 完成记事本基本功能，将控制台输入的每一行字符串写入文件note.txt中
 * 
 * @author live
 *
 */
public class PrintWriterDemo3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入：");
//		FileOutputStream fis = new FileOutputStream("note11.txt");
//		OutputStreamWriter isw = new OutputStreamWriter(fis);
//		BufferedWriter bw = new BufferedWriter(isw);
//		PrintWriter pw = new PrintWriter((bw),true);
		
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(new OutputStreamWriter(
			        new FileOutputStream("note11.txt"))),true);
	/**
	 * 
	 * PrintWriter的构造法若第一个参数是一个流，name就支持第二个参数，该参数为boolean型，若值为true
	 * 时，那么pw就具有了自动刷新功能，即：
	 * 每当使用println,方法写出一行字符串后会自动flash,
	 * 注意：调用Print方法是不会自动刷新
	 */
		String str;
		
		while(true){
			str = scan.next().toUpperCase();
			if ("EXIT".equals(str)) {
				break;
			}	
			pw.write(str);
			
			
			
			
		}
		
		System.out.println("写出完毕！");
		pw.close();
		pw.append(str).toString();
		
		
	}

}
