package flie;

import java.io.File;

public class MkDirDemo3 {
	public static void main(String[] args) {
		File dir = new File("./d");
		if (dir.exists()) {
			dir.delete();
			System.out.println("删除完毕");
			
		}else {
			System.out.println("目录不存在");
		}
	}

}
