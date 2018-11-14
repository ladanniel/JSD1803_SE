package flie;

import java.io.File;

/**
 * 创建一个多级目录
 * @author live
 *
 */

public class MkDirDemo2 {
	public static void main(String[] args) {
		/**
		 * 在当前目录下创建a/b/c/d/e/f/目录
		 */
		File dir = new File("./a/b/c/d/e/f");
		
		if (!dir.exists()) {
			
			dir.mkdirs();
			System.out.println("目录创建完毕！");
			
		}else {
			System.out.println("目录已经存在");
		}
		
	}

}
