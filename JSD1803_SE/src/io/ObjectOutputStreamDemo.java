package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流是一对高级流，可以方便我们读写java中的任何对象
 * 对象输出流：可以将指定的对象转换为一组字节后写出
 * 对象输入流：可以将一组字节还原为对应的对象，前提是
 * 这组字节应当是对象输出流将一个对象转换的字节
 * @author live
 ******:流链接
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String name="苍老师";
		int age = 18;
		String gender = "女";
		String [] otherInfo = {"是一名演员"+"，"+"爱好是写毛笔字"};
		Person p = new Person(name,age,gender,otherInfo);
		
		
		
		FileOutputStream fos = new FileOutputStream("person.obj");  //文件字节流，
		BufferedOutputStream bos = new BufferedOutputStream(fos);   //缓冲流
		ObjectOutputStream oos = new ObjectOutputStream(bos);       //对象流
		/**
		 *将person对象写入到文件person.obj中 
		 *void writeObject(Object o)
		 *可以将给定的对象转换为一组字节后写出
		 */
		
		/*下面代码实际上做了两件事：
		 * 1：p对象先流经对象输出流，而对象输出流将该对象转换成为了一组字节，
		 * 这个过程称为对象序列化；
		 * 2：转换的这组字节再流经文件输出流，然后写入了文件保存（写入磁盘），
		 * 将数据写入磁盘做长久保存的过程称为数据持久化；
		 * 
		 */
		
		
		
		oos.writeObject(p);
	
		
		System.out.println("写出完毕");
		oos.close();
	}

	

	

	

}
