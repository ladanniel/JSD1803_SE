package flie;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��Flie����һ���ļ�
 * @author live
 *
 */

public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * �ڵ�ǰĿ¼�´���test.txt�ļ�
		 * boolean exists�������ͣ�
		 * �жϵ�ǰFile��ʾ���ļ���Ŀ¼�Ƿ��Ѿ�����
		 */
		
		File file = new File("./demo.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("�������");
		}else{
			System.out.println("�ļ������ڻ��Ѵ������ļ�");
		}
		
		
		
		

		
		
		
		

	}

}
