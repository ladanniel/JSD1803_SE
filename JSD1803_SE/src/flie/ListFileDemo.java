package flie;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е���������
 * @author live
 *
 */

public class ListFileDemo {
	public static void main(String[] args) {
		/**
		 * ��ȡ��ǰĿ¼����ĿĿ¼���е�����
		 * .���ǵ�ǰĿ¼
		 */
		File dir = new File(".");
		if (dir.isDirectory()) {
			File[]subs = dir.listFiles();
			for (int i = 0; i < subs.length; i++) {
				System.out.println(subs[i].getName());
			}
			
		}
	}

}
