package practiseio;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String name = "苍老师";
		int age = 18;
		String gender = "女";
		String []otherInfo = {"是一名演员"+","+"爱好写毛笔字"};
		Person d = new Person(name,age,gender,otherInfo);
		
		FileOutputStream fos = new FileOutputStream("object.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(d);
		System.out.println("写入完毕");
		oos.close();
		
		
		
	}

}
