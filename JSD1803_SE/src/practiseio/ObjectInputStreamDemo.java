package practiseio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("object.dat");
		BufferedInputStream bis= new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Person p = (Person) ois.readObject();
		System.out.println("¶ÁÐ´Íê±Ï£¡");
		ois.close();
		
	}

}
