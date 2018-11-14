package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��д�����������ݣ��Լ�RAFָ��Ĳ���
 * @author live
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		/**void seek(long pos);
		 * �ƶ�ָ�뵽ָ��λ��
		 */
		raf.seek(0);
		System.out.println("pos"+raf.getFilePointer());
		int d = raf.readInt();
		System.out.println(d);
//	//	raf.seek(raf.length());��ָ֮���ƶ����ļ�ĩβ
//		//���ļ���д���ֵ
//		int max = Integer.MAX_VALUE;
//		//��������λ>>>
////		raf.write(max>>>24);
////		System.out.println("pos:"+raf.getFilePointer());
////		raf.write(max>>>16);
////		System.out.println("pos:"+raf.getFilePointer());
////		raf.write(max>>>8);
////		System.out.println("pos"+raf.getFilePointer());
		
//		raf.write(max);
		System.out.println("pos"+raf.getFilePointer());
		/*
		 * RAF�ṩ�˷�������д���������͵���ط���
		 * 
		 * һ���Խ�������intֵ4�ֽ�ȫ��д��
		 */
		raf.writeInt(d);
		raf.seek(8);
		long L=raf.readLong();
		System.out.println("Long"+L);
		
		System.out.println("pos"+raf.getFilePointer());
		
		raf.writeLong(d);
		raf.seek(16);
		long D = raf.readLong(); 
		System.out.println("long"+D);
		
		System.out.println("pos"+raf.getFilePointer());
		
		raf.writeDouble(d);
		raf.seek(24);
		long F = raf.readLong();
		System.out.println("long"+F);
		
		System.out.println("pos"+raf.getFilePointer());
		System.out.println("д����ϣ�");
		raf.close();
	}

}
