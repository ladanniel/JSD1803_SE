package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**�ļ���������
 * �ļ�д��ȥ�������嶼���ļ���
 * java.io.BufferedReader
 * �����ַ������������԰��ж�ȡ�ַ���
 * @author live
 *
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		

		FileInputStream fis = new FileInputStream("./src/io/BufferedReaderDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
			/*BufferedReader�ṩ��ֱ�Ӷ�ȡһ���ַ����ķ�����
			 * String ReadLine();
			 * �÷�����������ȡ�����ַ�������ȡ�����з�ʱ����֮ǰ��ȡ���ַ������ַ�����ʽ���ء�
			 * ������ֵΪnullʱ����ʾ����ĩβ
			 * 
			 */
			
		}br.close();

	
	
	
	}
	

}
