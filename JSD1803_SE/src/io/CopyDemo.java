package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�������ļ��ĸ��Ʋ���
 * @author live
 *
 */

public class CopyDemo {
	/**
	 * 1.ʹ���ļ���������ȡԴ�ļ���
	 * 2.ʹ���ļ�������������ļ���д��
	 * 3.ʹ�ÿ��д��ʽ��Դ�ļ�����д�뵽���ļ���ɸ��Ʋ���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream fos = new FileOutputStream("fos_j.txt");
		byte [] buf = new byte[1024*10];
		int len = -1;
		while ((len=fis.read(buf))!=-1) {
			
			fos.write(buf);
			
			
			
		}System.out.println("��д���");
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
//		System.out.println("��д���");
//		fis.close();
//		fos.close();
		
		
	}

}
