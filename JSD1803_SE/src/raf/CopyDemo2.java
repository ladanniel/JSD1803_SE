package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次读写的数据量，减少实际读写的次数，可以提高读写效率
 * 对于硬盘而言，随机读写效率差是缺点，但是硬盘块读写效率还是可以保证的
 * 随机读写：单字节读写
 * 块读写：一组一组字节读写
 * @author live
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		
	RandomAccessFile src = new RandomAccessFile("./music.zip","r");
	RandomAccessFile desc = new RandomAccessFile("./music_nm.zip","rw");
	/*int read(byte[]data)
	 * 一次性读取给定的字节数组长度的字节两并存入到该数组中，返回值为实际读取到的字节量，若
	 * 返回值为-1，则是文件末尾
	 * void write（byte[]data）
	 * 一次性将给定的字节数组中所有字节写出
	 * void write（byte[] data,int index , int len）
	 * 将给定的字节数从下标index处开始的连续len 个字节一次性写出；
	 * 
	 */
	byte[]buf = new byte[1024*10];
	int len = -1;
	long start= System.currentTimeMillis();
	while ((len = src.read(buf))!=-1) {
		desc.write(buf,0,len);
		
	}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end-start)+"ms");
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
//	System.out.println("复制完毕！耗时："+(end-start)+"ms");
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
//	System.out.println("复制完毕！耗时"+(end-start)+"ms");

}
