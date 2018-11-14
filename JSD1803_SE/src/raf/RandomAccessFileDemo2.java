package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写基本类型数据，以及RAF指针的操作
 * @author live
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		/**void seek(long pos);
		 * 移动指针到指定位置
		 */
		raf.seek(0);
		System.out.println("pos"+raf.getFilePointer());
		int d = raf.readInt();
		System.out.println(d);
//	//	raf.seek(raf.length());将之指针移动到文件末尾
//		//向文件中写最大值
//		int max = Integer.MAX_VALUE;
//		//二进制移位>>>
////		raf.write(max>>>24);
////		System.out.println("pos:"+raf.getFilePointer());
////		raf.write(max>>>16);
////		System.out.println("pos:"+raf.getFilePointer());
////		raf.write(max>>>8);
////		System.out.println("pos"+raf.getFilePointer());
		
//		raf.write(max);
		System.out.println("pos"+raf.getFilePointer());
		/*
		 * RAF提供了方便我们写出基本类型的相关方法
		 * 
		 * 一次性将给定的int值4字节全部写出
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
		System.out.println("写出完毕！");
		raf.close();
	}

}
