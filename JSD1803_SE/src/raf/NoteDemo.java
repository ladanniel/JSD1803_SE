package raf;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/**PRACTISE:
 * 
 * ���һ�����׵ļ��±�����
 * �����������û��ڿ���̨�����ÿһ���ַ�����д�뵽
 * �ļ�note.txt�У����û�����"exit"ʱ��
 * �����˳�
 * @author live
 *
 */

public class NoteDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile ra= new RandomAccessFile("./user.dat","rw");
		Scanner scan = new Scanner(System.in);
		System.out.println("������");
		String str;
		while (true) {
			str= scan.nextLine().toUpperCase();
			if ("EXIT".equals(str)) {
				break;
			}
			byte [] data = str.getBytes("GBK");
			ra.write(data);
			
			
		}
		System.out.println("ִ�����");
		ra.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		RandomAccessFile raf = new RandomAccessFile("./note.txt","rw");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�����룺");
//		String str;
//		while(true) {
//			str= scan.next().toUpperCase();
//			if ("EXIT".equals(str)) {
//				                                             /*
//				                                              * ���str.equals(exit)����.equals���Ա�������
//				                                              * ���׳��ֲ���Ҫ�Ŀ�ָ���쳣��
//			                                                  * �������Ա���.equals(����)
//				                                               */
//				break;
//			}
//			byte [] data = str.getBytes("GBK");
//			raf.write(data);
//			
//		}
//		raf.close();
//		System.out.println("ִ�����");
//		
	
		
	}

}
