package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ����������ʹ��PrintWriter 
 * @author live
 *
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws FileNotFoundException {
//		FileOutputStream fis = new FileOutputStream("pw2.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fis);
//		BufferedWriter bw = new BufferedWriter(osw);
//		PrintWriter pw = new PrintWriter(bw);
//		pw.println("����ҹϲ�꡷.��.�Ÿ�");
//		pw.println("����֪ʱ�ڣ������˷��������Ǳ��ҹ������ϸ������");
//		pw.println("Ұ���ƾ�ڣ������������������ʪ�������ؽ��ٳǡ�");
//		System.out.println("д����ϣ�");
//		pw.close();
		
		
		FileOutputStream fis = new FileOutputStream("pw2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fis);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("����ҹϲ�꡷.��.�Ÿ�");
		pw.println("����֪ʱ�ڣ������˷��������Ǳ��ҹ������ϸ������");
		pw.println("Ұ���ƾ�ڣ������������������ʪ�������ؽ��ٳǡ�");
		System.out.println("д����ϣ�");
		pw.close();
		
	}

}
