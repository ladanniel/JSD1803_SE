package flie;

import java.io.File;
/**
 * 使用File创建一个目录
 * @author live
 *
 */
public class MkDirDemo {
	public static void main(String[] args) {
		File dir = new File("./demo");
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("告诉我目录已创建完毕");
			
		}else {
			System.out.println("目录已存在");
		}
	}

}
