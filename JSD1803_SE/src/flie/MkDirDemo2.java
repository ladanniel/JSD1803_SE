package flie;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * @author live
 *
 */

public class MkDirDemo2 {
	public static void main(String[] args) {
		/**
		 * �ڵ�ǰĿ¼�´���a/b/c/d/e/f/Ŀ¼
		 */
		File dir = new File("./a/b/c/d/e/f");
		
		if (!dir.exists()) {
			
			dir.mkdirs();
			System.out.println("Ŀ¼������ϣ�");
			
		}else {
			System.out.println("Ŀ¼�Ѿ�����");
		}
		
	}

}
