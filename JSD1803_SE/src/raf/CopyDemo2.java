package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ÿ�ζ�д��������������ʵ�ʶ�д�Ĵ�����������߶�дЧ��
 * ����Ӳ�̶��ԣ������дЧ�ʲ���ȱ�㣬����Ӳ�̿��дЧ�ʻ��ǿ��Ա�֤��
 * �����д�����ֽڶ�д
 * ���д��һ��һ���ֽڶ�д
 * @author live
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		
	RandomAccessFile src = new RandomAccessFile("./music.zip","r");
	RandomAccessFile desc = new RandomAccessFile("./music_nm.zip","rw");
	/*int read(byte[]data)
	 * һ���Զ�ȡ�������ֽ����鳤�ȵ��ֽ��������뵽�������У�����ֵΪʵ�ʶ�ȡ�����ֽ�������
	 * ����ֵΪ-1�������ļ�ĩβ
	 * void write��byte[]data��
	 * һ���Խ��������ֽ������������ֽ�д��
	 * void write��byte[] data,int index , int len��
	 * ���������ֽ������±�index����ʼ������len ���ֽ�һ����д����
	 * 
	 */
	byte[]buf = new byte[1024*10];
	int len = -1;
	long start= System.currentTimeMillis();
	while ((len = src.read(buf))!=-1) {
		desc.write(buf,0,len);
		
	}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
		src.close();
		desc.close();
	
	
	}
//	
//	byte[]buf = new byte[1024*10];
//	int len = -1;
//	long start = System.currentTimeMillis();
//	if ((len=src.read(buf))!=-1) {
//		desc.write(buf,0,len);
//		
//	}
//	long end = System.currentTimeMillis();
//	System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
//	src.close();
//	desc.close();
//		
//	}
//	byte [] buf = new byte[1024*10];
//	int len = -1;
//	long start = System.currentTimeMillis();
//	do {
//		desc.write(buf,0,len);
//	} while ((len=src.read(buf))!=-1);
//	long end = System.currentTimeMillis();
//	System.out.println("������ϣ���ʱ"+(end-start)+"ms");

}
