package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流，用于进行对象反序列化操作，
 * 需要注意的是，对象流读取的字节必须是由对象输出流将一个对象序列化后的字节，否则
 * 进行反序列化时会抛出异常
 * @author live
 *transient：在序列化有些部分值不需要的时候可以加上这个修饰
 *序列化：将对象数据转换成字节数据；
 *反序列化：将字节数据还原成对象数据；
 *使用时机:将对象数据用于网络传输或持久化到磁盘；
 */

public class ObjectInputStreamDemo {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("person.obj");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Person p= (Person) ois.readObject();
		System.out.println(p);
		ois.close();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
//		FileInputStream fis = new FileInputStream("person.obj");
//		BufferedInputStream bis = new BufferedInputStream(fis);
//		ObjectInputStream ois = new ObjectInputStream(bis);
//		
//		Person p = (Person)ois.readObject();
//		
//		System.out.println(p);
//		ois.close();
	}

}
