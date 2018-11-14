package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
byte[]getBytes(String csn)
 * 将当前字符串赞找指定字符集转换为一组字节。
 * 推荐使用这种方式转换成字符串，因为按照系统默认字符集转换
 * 会导致跨平台出现乱码问题
 * 写出字符串操作
 * @author live
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 在相对路径中“./”可以不写，不写默认也是在当前目录中
		 * 读写操作，先将字符串String转换成byte
		 * GBK国标编码，中文占2个字节
		 * UTF-8：万国编码，对Unicode进行编码，变长编码集，英文1个字节，中文3个字节
		 * ISO8859-1：欧洲编码集，不支持中文
		 */
//		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
//		String str = "让我再看你一遍，从南到北；";
//		byte [] data = str.getBytes();
//		raf.write(data);
//		raf.write("像是北五环路，蒙住了双眼".getBytes());
//		System.out.println("写出完毕");
//		raf.close();
//		//ISO8829-1：欧洲编码集，不支持中文
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		String str = "xxxxxxx;";
		byte [] data = str.getBytes("UTF-8");
		raf.write(data.length);
		raf.write("yyyyyyyy;".getBytes("UTF-8"));
		System.out.println("写出完毕");
		raf.close();
		
	}

}
