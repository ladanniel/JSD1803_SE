package flie;

import java.io.File;
/**
 * ʹ��File����һ��Ŀ¼
 * @author live
 *
 */
public class MkDirDemo {
	public static void main(String[] args) {
		File dir = new File("./demo");
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("������Ŀ¼�Ѵ������");
			
		}else {
			System.out.println("Ŀ¼�Ѵ���");
		}
	}

}
