package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
byte[]getBytes(String csn)
 * ����ǰ�ַ�������ָ���ַ���ת��Ϊһ���ֽڡ�
 * �Ƽ�ʹ�����ַ�ʽת�����ַ�������Ϊ����ϵͳĬ���ַ���ת��
 * �ᵼ�¿�ƽ̨������������
 * д���ַ�������
 * @author live
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * �����·���С�./�����Բ�д����дĬ��Ҳ���ڵ�ǰĿ¼��
		 * ��д�������Ƚ��ַ���Stringת����byte
		 * GBK������룬����ռ2���ֽ�
		 * UTF-8��������룬��Unicode���б��룬�䳤���뼯��Ӣ��1���ֽڣ�����3���ֽ�
		 * ISO8859-1��ŷ�ޱ��뼯����֧������
		 */
//		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
//		String str = "�����ٿ���һ�飬���ϵ�����";
//		byte [] data = str.getBytes();
//		raf.write(data);
//		raf.write("���Ǳ��廷·����ס��˫��".getBytes());
//		System.out.println("д�����");
//		raf.close();
//		//ISO8829-1��ŷ�ޱ��뼯����֧������
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		String str = "xxxxxxx;";
		byte [] data = str.getBytes("UTF-8");
		raf.write(data.length);
		raf.write("yyyyyyyy;".getBytes("UTF-8"));
		System.out.println("д�����");
		raf.close();
		
	}

}
