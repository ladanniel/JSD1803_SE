package raf;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/**PRACTISE:
 * 
 * 完成一个简易的记事本工具
 * 程序启动后，用户在控制台输入的每一行字符串都写入到
 * 文件note.txt中，当用户输入"exit"时；
 * 程序退出
 * @author live
 *
 */

public class NoteDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile ra= new RandomAccessFile("./user.dat","rw");
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入");
		String str;
		while (true) {
			str= scan.nextLine().toUpperCase();
			if ("EXIT".equals(str)) {
				break;
			}
			byte [] data = str.getBytes("GBK");
			ra.write(data);
			
			
		}
		System.out.println("执行完毕");
		ra.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		RandomAccessFile raf = new RandomAccessFile("./note.txt","rw");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入：");
//		String str;
//		while(true) {
//			str= scan.next().toUpperCase();
//			if ("EXIT".equals(str)) {
//				                                             /*
//				                                              * 如果str.equals(exit)变量.equals（自变量）；
//				                                              * 容易出现不必要的空指针异常，
//			                                                  * 所以用自变量.equals(变量)
//				                                               */
//				break;
//			}
//			byte [] data = str.getBytes("GBK");
//			raf.write(data);
//			
//		}
//		raf.close();
//		System.out.println("执行完毕");
//		
	
		
	}

}
