package flie;

import java.io.File;

public class MkDirDemo3 {
	public static void main(String[] args) {
		File dir = new File("./d");
		if (dir.exists()) {
			dir.delete();
			System.out.println("ɾ�����");
			
		}else {
			System.out.println("Ŀ¼������");
		}
	}

}
