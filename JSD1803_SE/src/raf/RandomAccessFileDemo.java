package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**重点****
 * java.io.RandomAccessFile
 * 该类设计用来专门读写文件数据，其基于指针进行读写，
 * 即：总是在指针当前位置读或写字节
 * RAF有两种常用创建模式
 *  “r”：只读模式
 *  “rw”：读写模式
 *  只读模式会抛异常,返回为int 类型
 * @author live
 *
 */

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * RAF常用的构造方法：
		 * RandomAccessFile（String path ，String mode）;
		 * RandomAccessFile（File file ，String mode）;
		 * mode:操作模式，只读或读写;
		 */
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
		System.out.println("执行完毕！");
		raf.write(98);
		System.out.println("写出完毕！");
		raf.close();
		
		
		
	//	File file = new File("./raf.dat");
		//简写：random.....
//		RandomAccessFile raf=new RandomAccessFile("./raf.dat","rw");
//		System.out.println("执行完毕");
//		raf.write(97);
//		System.out.println("写出完毕！");
//		raf.close();//写完后立即释放
//		
	}
	/*void write（int d）
	 * 写出一个字节，将给定的int值对应的2进制的“低八位”写入文件
	 */
	

}
