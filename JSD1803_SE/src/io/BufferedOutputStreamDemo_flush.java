package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���������д����ʱ�Ļ���������,����������8kb
 * @author live
 *
 */

public class BufferedOutputStreamDemo_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "��ǰ����ɽ��ɽ�������������Ϻ��ж�С����˵����ǰ����ɽ��������";
		byte [] lin = str.getBytes("GBK");
		bos.write(lin);
		//ǿ�ƽ��������������һ����ȫ��д�������ӿ��дЧ�ʣ�
	//  bos.flush();
		System.out.println("д�����");
		bos.close();
	}

}
