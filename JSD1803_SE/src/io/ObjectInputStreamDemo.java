package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ���������������ڽ��ж������л�������
 * ��Ҫע����ǣ���������ȡ���ֽڱ������ɶ����������һ���������л�����ֽڣ�����
 * ���з����л�ʱ���׳��쳣
 * @author live
 *transient�������л���Щ����ֵ����Ҫ��ʱ����Լ����������
 *���л�������������ת�����ֽ����ݣ�
 *�����л������ֽ����ݻ�ԭ�ɶ������ݣ�
 *ʹ��ʱ��:�����������������紫���־û������̣�
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
