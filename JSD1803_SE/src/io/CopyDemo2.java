package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������:��������һ�Ը߼���
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream;
 * �����ֽ�����������������ӿ��дЧ�ʵ�
 * ʹ�û�������ɸ��Ʋ���
 * @author live
 *
 */

public class CopyDemo2 {
	/**
	 * ʹ���ļ�����ȡԴ�ļ���ʹ���ļ�����������ļ���д��ʹ�ÿ��д��ʽ
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
		/**ʹ���˻�������дʱ�����ǾͲ�����Ҫ��ע����ʹ�ÿ��д�ӿ�Ч���ˣ�
		 * ��Ϊ�������ڲ�ά����һ���ֽ����飬���ջὫ���ǵĶ�д����ת��Ϊ
		 * ���д�ӿ��дЧ�ʵġ�
		 * 
		 */
		long start = System.currentTimeMillis();
		while ((d=bis.read())!=-1) {
			bos.write(d);
			
			
		}
		long end = System.currentTimeMillis();
		System.out.println("��д��ϣ���ʱ��"+(end-start)+"ms");
		bis.close();
		bos.close();
		
		
	}

}
