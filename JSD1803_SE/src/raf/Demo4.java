package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**homework
 * ��½��֤
 * ����������Ҫ���û������û���������
 * Ȼ��ƥ��user.dat�ļ��е��û������û���������������ȷ
 * ��ʾ��½�ɹ���������ʾ�û��������벻��ȷ
 * 
 * @author live
 *
 */
public class Demo4 {
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�޸�����");
		
		System.out.println("�������û�����");
		String name = scan.nextLine();
		
		System.out.println("�����������");
		String pword = scan.nextLine();
		
		System.out.println("������������");
		String newpword = scan.nextLine();
		
	 RandomAccessFile raf = new RandomAccessFile("user.dat","r");
	 
		    boolean flag = false;//��ʾ�Ƿ�ͨ����֤
			for (int i = 0; i < raf.length()/100; i++) {

				raf.seek(i*100);//��ָ���ƶ�����ǰλ��
				byte []data = new byte[32];
				raf.read(data);
				String username = new String(data,"GBK").trim();
				if ( username.equals(name)) {
					//�ҵ�����Ȼ��ƥ������
					raf.read(data); 
					String password = new String(data,"GBK").trim();
					if ( newpword.equals(pword)) {
						//��½�ɹ�
						raf.seek(i*100+32);
						byte[]arr= newpword.getBytes("GBK");
						Arrays.copyOf(arr, 32);
						raf.write(data);
						flag=true;
					}
					break;
			}

		}
			if (!flag) {
			System.out.println("�û��������벻��ȷ");
			
		}
		raf.close();
		} 

	}



