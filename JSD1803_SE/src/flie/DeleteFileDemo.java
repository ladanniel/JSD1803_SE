package flie;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author live
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
		/*
		 * ����ǰĿ¼�е�test.txt�ļ�ɾ��
		 */
			File file = new File("./test.txt ");
			if (file.exists()) {
				file.delete();
				System.out.println("ɾ�����");
				
			}else {
				System.out.println("���ļ�������");
			}
	}

	
	
}
