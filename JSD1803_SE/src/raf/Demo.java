package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ַ���
 * @author live
 *
 */

public class Demo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		byte[] data = new byte[(int)raf.length()];
		raf.read(data);
		/*String�ṩ��һ�����صĹ��췽�����Խ��������ֽ����鰴��
		 * ָ���ַ�����GBK��UTF-8�ȣ���ԭΪ�ַ���
		 */
		String str = new String(data,"GBK");
		System.out.println(str);
		raf.close();
	}

}
