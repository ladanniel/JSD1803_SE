package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * ��������һ�Ը߼��������Է������Ƕ�дjava�е��κζ���
 * ��������������Խ�ָ���Ķ���ת��Ϊһ���ֽں�д��
 * ���������������Խ�һ���ֽڻ�ԭΪ��Ӧ�Ķ���ǰ����
 * �����ֽ�Ӧ���Ƕ����������һ������ת�����ֽ�
 * @author live
 ******:������
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String name="����ʦ";
		int age = 18;
		String gender = "Ů";
		String [] otherInfo = {"��һ����Ա"+"��"+"������дë����"};
		Person p = new Person(name,age,gender,otherInfo);
		
		
		
		FileOutputStream fos = new FileOutputStream("person.obj");  //�ļ��ֽ�����
		BufferedOutputStream bos = new BufferedOutputStream(fos);   //������
		ObjectOutputStream oos = new ObjectOutputStream(bos);       //������
		/**
		 *��person����д�뵽�ļ�person.obj�� 
		 *void writeObject(Object o)
		 *���Խ������Ķ���ת��Ϊһ���ֽں�д��
		 */
		
		/*�������ʵ�������������£�
		 * 1��p�����������������������������������ö���ת����Ϊ��һ���ֽڣ�
		 * ������̳�Ϊ�������л���
		 * 2��ת���������ֽ��������ļ��������Ȼ��д�����ļ����棨д����̣���
		 * ������д����������ñ���Ĺ��̳�Ϊ���ݳ־û���
		 * 
		 */
		
		
		
		oos.writeObject(p);
	
		
		System.out.println("д�����");
		oos.close();
	}

	

	

	

}
