package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ�
 * @author live
 *
 */

public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * ���Ƶ�ǰĿ¼��img.png
		 */
	
		RandomAccessFile src = new RandomAccessFile("./penguins.jpg","r");
		RandomAccessFile dess = new RandomAccessFile("./penguins_nh.jpg","rw");
		int d=-1;
		long start = System.currentTimeMillis();
		while ((d = src.read())!=-1) {
			dess.write(d);
			
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
		src.close();
		dess.close();
		
		
		
		
		
		
		
		
		
//		RandomAccessFile src = new RandomAccessFile("./Penguins.jpg","r");
//		RandomAccessFile dess =  new RandomAccessFile("./Penguins_h.jpg","rw");
//		int d = -1;
//		long start = System.currentTimeMillis();
//		while ((d = src.read())!=-1) {
//			dess.write(d);
//			
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("�������!��ʱ��"+(end-start)+"ms");
//		src.close();
//		dess.close();
//		
	}

}
