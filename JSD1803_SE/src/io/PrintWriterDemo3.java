package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**ʹ��PrintWriter,����������ʽ����
 * ��ɼ��±��������ܣ�������̨�����ÿһ���ַ���д���ļ�note.txt��
 * 
 * @author live
 *
 */
public class PrintWriterDemo3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����룺");
//		FileOutputStream fis = new FileOutputStream("note11.txt");
//		OutputStreamWriter isw = new OutputStreamWriter(fis);
//		BufferedWriter bw = new BufferedWriter(isw);
//		PrintWriter pw = new PrintWriter((bw),true);
		
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(new OutputStreamWriter(
			        new FileOutputStream("note11.txt"))),true);
	/**
	 * 
	 * PrintWriter�Ĺ��취����һ��������һ������name��֧�ֵڶ����������ò���Ϊboolean�ͣ���ֵΪtrue
	 * ʱ����ôpw�;������Զ�ˢ�¹��ܣ�����
	 * ÿ��ʹ��println,����д��һ���ַ�������Զ�flash,
	 * ע�⣺����Print�����ǲ����Զ�ˢ��
	 */
		String str;
		
		while(true){
			str = scan.next().toUpperCase();
			if ("EXIT".equals(str)) {
				break;
			}	
			pw.write(str);
			
			
			
			
		}
		
		System.out.println("д����ϣ�");
		pw.close();
		pw.append(str).toString();
		
		
	}

}
