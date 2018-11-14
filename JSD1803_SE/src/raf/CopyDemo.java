package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author live
 *
 */

public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * 复制当前目录的img.png
		 */
	
		RandomAccessFile src = new RandomAccessFile("./penguins.jpg","r");
		RandomAccessFile dess = new RandomAccessFile("./penguins_nh.jpg","rw");
		int d=-1;
		long start = System.currentTimeMillis();
		while ((d = src.read())!=-1) {
			dess.write(d);
			
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end-start)+"ms");
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
//		System.out.println("复制完毕!耗时："+(end-start)+"ms");
//		src.close();
//		dess.close();
//		
	}

}
