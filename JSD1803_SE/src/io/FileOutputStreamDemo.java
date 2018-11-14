package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * java标准的IO操作Input,Output输入域输出，
 * 按照功能分为读写，
 * 按照方向分为输入，输出，而方向的参照物为我们写的程序
 * 输入流用来读取数据(家用水管)
 * 输出流用来写出数据（家用废水）
 * 
 * java.io.InputStream是所有字节输入流的父类，
 * 规定了所有输入流都应当具备的读取字节数据的相关方法
 * java.io.OutputStream是所有字节输出流的父类
 * java将流分为两大类：节点流与处理流
 * 
 * 节点流：又称为低级流，是实际连接程序与另一端的“管道”
 * 负责实际搬运数据，读写一定是建立在低级流的基础之上进行的；
 * 
 * 处理流：又称为高级流，不能独立存在（没有意义），高级流一定会连接在其他流
 * 上，是的数据“流经”该流时对其进行加工处理，简化我们对数据读写时的某些操作。
 * 
 * 文件流：
 * 文件流是一对低级流，用于读写文件数据。功能与RAF一样，但是底层的读写方式不同
 * ，流是顺序读写，而RAF是基于指针随机读写的
 * @author live
 *FOS流可以追加，但不可以在任意位置添加RAF可以做到
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		//FileOutputStream fos = new FileOutputStream("fos.txt");
		/**向文件fos.txt中写出字符串
		 * 流有两种常见的创建方式：
		 * FileOutputStream（String path）
		 * FileOutputStream（String file）
		 * 
		 * 以上两种创建时覆盖模式，即若要操作文件已经存在，会先将该文件数据清除。然后通过
		 * 该流写出的数据作为该文件数据
		 * 
		 * FileOutputStream（String path，boolean append）
		 * FileOutputStream（String file,boolean append）
		 * 当第二个参数为true时，该流为追加模式，即该文件原有数据全部保留，通过流写出的数据、
		 * 会被追加到文件后面继续写
		 * 
		 */
	  FileOutputStream fos = new FileOutputStream("fos.txt",true);
		String str  = ",我欲乘风归去，又恐琼楼玉宇，高处不胜寒，起舞弄清影，何似在人间，转朱阁，低绮户~";
		fos.write(str.getBytes("GBK"));
		System.out.println("写出完毕");
		fos.close();
		
		
	}

}
