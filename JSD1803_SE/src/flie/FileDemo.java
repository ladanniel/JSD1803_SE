package flie;

import java.io.File;

/**
 * java.io.File
 * File��ÿһ��ʵ���������ڱ�ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * ʹ��File���ԣ�
 * 1�������ļ���Ŀ¼�����ԣ����֡���С���޸�ʱ��ȣ�
 * 2�������ļ���Ŀ¼����������ɾ����
 * 3������һ��Ŀ¼�����
 * ���ǲ��ܶ�д�ļ����ݣ�
 * File�������вι����
 * @author danniel
 *
 */

public class FileDemo {
	public static void main(String[] args) {
		
		/**
		 * ·������ѡ�����·������ͬϵͳ��·������ʽ��ͬ��
		 * 
		 * ���·������������ƽ̨
		 * D:/tts9/����/JSD1803SE_API/demo.txt====./demo.txt
		 * eclipse�е�ǰĿ¼��./���ǵ�ǰ����������Ŀ ��Ŀ¼
		 * ���磺Windows��D:/tts9/����/JSD1803SE_API/demo.txt
		 *         Linux��home/soft01/eclipse_workspace/jsd1803/demo.txt
		 */
		File file= new File("./demo.txt");
		
	//��ȡ����
		String name = file.getName();
		System.out.println("����"+name);
	//��ȡ��С���ֽ�����
		long len = file.length();
		System.out.println("��С"+len);
	//�ɶ���д
		boolean cr = file.canRead();
		System.out.println("�ɶ�"+cr);
		boolean cw = file.canWrite();
		System.out.println("��д"+cw);
	//�Ƿ�����
		boolean in = file.isHidden();
		System.out.println("�Ƿ�����"+in);
			
		
	}

}
