package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**�����ַ���
 * java.io.BufferedWriter;
 * java.io.BufferedReader;
 * �ڲ��л����������Կ��д�ַ������ҿ��԰��ж�д�ַ���
 * java.io.PrintWriter;
 * �����Զ�ˢ�µĻ����ַ���������ڲ����ǻ�����
 * BufferedWriter��Ϊ���������
 * 
 * @author live
 *
 */

public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/**
		 * printWriter�ṩ��ֱ�Ӷ��ļ�д�������취
		 * printWriter��String path��
		 * printWriter(File file)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","GBK");
		pw.println("��������.��.����");
		pw.println("����ʱ����׷ף�·���������ϻꣻ");
		pw.print("���ʾƼҺδ��У���ͯңָ�ӻ��塣");
		System.out.println("��д���");
		pw.close();
		
		
	}

}
