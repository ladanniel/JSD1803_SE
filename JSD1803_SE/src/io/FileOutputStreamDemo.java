package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * java��׼��IO����Input,Output�����������
 * ���չ��ܷ�Ϊ��д��
 * ���շ����Ϊ���룬�����������Ĳ�����Ϊ����д�ĳ���
 * ������������ȡ����(����ˮ��)
 * ���������д�����ݣ����÷�ˮ��
 * 
 * java.io.InputStream�������ֽ��������ĸ��࣬
 * �涨��������������Ӧ���߱��Ķ�ȡ�ֽ����ݵ���ط���
 * java.io.OutputStream�������ֽ�������ĸ���
 * java������Ϊ�����ࣺ�ڵ����봦����
 * 
 * �ڵ������ֳ�Ϊ�ͼ�������ʵ�����ӳ�������һ�˵ġ��ܵ���
 * ����ʵ�ʰ������ݣ���дһ���ǽ����ڵͼ����Ļ���֮�Ͻ��еģ�
 * 
 * ���������ֳ�Ϊ�߼��������ܶ������ڣ�û�����壩���߼���һ����������������
 * �ϣ��ǵ����ݡ�����������ʱ������мӹ����������Ƕ����ݶ�дʱ��ĳЩ������
 * 
 * �ļ�����
 * �ļ�����һ�Եͼ��������ڶ�д�ļ����ݡ�������RAFһ�������ǵײ�Ķ�д��ʽ��ͬ
 * ������˳���д����RAF�ǻ���ָ�������д��
 * @author live
 *FOS������׷�ӣ���������������λ�����RAF��������
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		//FileOutputStream fos = new FileOutputStream("fos.txt");
		/**���ļ�fos.txt��д���ַ���
		 * �������ֳ����Ĵ�����ʽ��
		 * FileOutputStream��String path��
		 * FileOutputStream��String file��
		 * 
		 * �������ִ���ʱ����ģʽ������Ҫ�����ļ��Ѿ����ڣ����Ƚ����ļ����������Ȼ��ͨ��
		 * ����д����������Ϊ���ļ�����
		 * 
		 * FileOutputStream��String path��boolean append��
		 * FileOutputStream��String file,boolean append��
		 * ���ڶ�������Ϊtrueʱ������Ϊ׷��ģʽ�������ļ�ԭ������ȫ��������ͨ����д�������ݡ�
		 * �ᱻ׷�ӵ��ļ��������д
		 * 
		 */
	  FileOutputStream fos = new FileOutputStream("fos.txt",true);
		String str  = ",�����˷��ȥ���ֿ���¥����ߴ���ʤ��������Ū��Ӱ���������˼䣬ת��󣬵�粻�~";
		fos.write(str.getBytes("GBK"));
		System.out.println("д�����");
		fos.close();
		
		
	}

}
