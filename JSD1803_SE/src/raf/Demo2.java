package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**����û�ע��ҵ�����:
 * �û�����Ϣ������
 * �û��������룻�ǳƣ�����(int)����������Ϊ�ַ�����String��
 * 
 * ÿ���û�����Ϣ��Ҫд��user.dat�б���
 * ÿ����¼�ĳ��ȹ̶�Ϊ100�ֽڡ������û��������롢�ǳ������ռ32�ֽ�
 * ����intֵ�̶�Ϊ4���ֽ�
 * 
 * �ַ��������ס����������޸����ݡ�����Ӱ�������ļ��ĸ�ʽ
 * 
 * @author live
 *�����д������һ�㲻��xxx.nextInt();���ͣ�������Integer.parseInt(xxx.nextInt) ���������ȡ��ȫ����
 */

public class Demo2 {
	public static void main(String[] args) throws IOException {
	    RandomAccessFile raf = new RandomAccessFile("hello.txt","rw");
		System.out.println("��ӭע��");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������û���");
		String username=scan.nextLine();
		
		System.out.println("����������");
		String password = scan.nextLine();
		
		System.out.println("�������ǳ�");
		String nickname = scan.nextLine();
				
	    System.out.println("����������");
	    int age = Integer.parseInt(scan.nextLine());
	    
//	                                                            System.out.println("uesername"+username);
//	                                                            System.out.println("password"+password);
//	                                                            System.out.println("nickname"+nickname);
//	                                                            System.out.println("age"+age);��׮������������ִ�еĹ��̣��Լ�������Ĵ���
//		
//
	
	    
	    
	    
	    
	    
	    
	 raf.seek(raf.length());	 
//	 //д�û���
	 byte[] data = username.getBytes("GBK");
	  data=Arrays.copyOf(data, 32);  
	   raf.write(data);

//	 //д����
	   data =password.getBytes("GBK");
	  data =Arrays.copyOf(data, 32);
	 raf.write(data);

//	 //д�ǳ�
	 data= nickname.getBytes("GBK");
	 data = Arrays.copyOf(data, 32);
	 raf.write(data);
//	 //д����
	 raf.writeInt(age);

	 System.out.println("ע�����");
     raf.close();
	 


	 

	}

}
