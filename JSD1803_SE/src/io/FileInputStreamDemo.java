package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ļ������������ڶ�ȡ�ļ�����
 * @author live
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		
		byte [] data = new byte[200];
		//��ȡ����ֵ���õ�ʵ�ʶ�ȡ���ֽ���
		int len = fis.read(data);
		String str = new String(data,0,len,"GBK");
		System.out.println(str);
		fis.close();
		
	}

}
