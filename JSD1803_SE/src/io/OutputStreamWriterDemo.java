package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**java�������ն�д��λ���֣���Ϊ�ֽ������ַ���
 * �ַ�������д��λ�����ַ�Ϊ��λ�������ַ�����д������һ���ľ����ԣ�ֻ����
 * ��д�ı����ݡ�
 * ���ı�����������ʹ���ַ�����ȡ���磺ͼƬ�������������ͣ�MP3�����ݣ�
 * java.io.Reader,java.io.Writer;
 * Reader�������ַ��������ĸ��ࣻ
 * Writer�������ַ�������ĸ��ࣻ
 * 
 * ת������
 * java.io.InputStreamReader;
 * java.io.OutputStreamWriter;
 * ������һ�Ը߼�����ͬʱҲ�ǳ��õ��ַ���ʵ���ࣻ
 * �ڶ�д�ı�����ʱ��ʹ�ø߼����������������Ƿǳ���Ҫ��һ����
 * �𵽳������µ����ã���Ϊ�������е��ַ�����ֻ�������������ַ����ϣ��������ϵͼ���
 * �����ֽ���������ת�������������ֽ����������������������ַ����������𵽽��ַ������ֽ���
 * ���Խӡ������á�
 * 
 *�ַ�����ֻ�ܶ�д�ı����ݣ���ͨ��
 * @author live
 *
 */

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
		osw.write("Ħ��Ħ������ħ��Ĳ�����");
		osw.write("�ڹ⻬����·�����ϴ�������");
		System.out.println("��д���");
		osw.close();
		
		
		
	}

}
