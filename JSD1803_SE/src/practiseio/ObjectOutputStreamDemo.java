package practiseio;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String name = "����ʦ";
		int age = 18;
		String gender = "Ů";
		String []otherInfo = {"��һ����Ա"+","+"����дë����"};
		Person d = new Person(name,age,gender,otherInfo);
		
		FileOutputStream fos = new FileOutputStream("object.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(d);
		System.out.println("д�����");
		oos.close();
		
		
		
	}

}
