package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**�ص�****
 * java.io.RandomAccessFile
 * �����������ר�Ŷ�д�ļ����ݣ������ָ����ж�д��
 * ����������ָ�뵱ǰλ�ö���д�ֽ�
 * RAF�����ֳ��ô���ģʽ
 *  ��r����ֻ��ģʽ
 *  ��rw������дģʽ
 *  ֻ��ģʽ�����쳣,����Ϊint ����
 * @author live
 *
 */

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * RAF���õĹ��췽����
		 * RandomAccessFile��String path ��String mode��;
		 * RandomAccessFile��File file ��String mode��;
		 * mode:����ģʽ��ֻ�����д;
		 */
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
		System.out.println("ִ����ϣ�");
		raf.write(98);
		System.out.println("д����ϣ�");
		raf.close();
		
		
		
	//	File file = new File("./raf.dat");
		//��д��random.....
//		RandomAccessFile raf=new RandomAccessFile("./raf.dat","rw");
//		System.out.println("ִ�����");
//		raf.write(97);
//		System.out.println("д����ϣ�");
//		raf.close();//д��������ͷ�
//		
	}
	/*void write��int d��
	 * д��һ���ֽڣ���������intֵ��Ӧ��2���Ƶġ��Ͱ�λ��д���ļ�
	 */
	

}
