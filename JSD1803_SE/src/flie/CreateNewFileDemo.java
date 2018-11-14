package flie;

import java.io.File;
import java.io.IOException;

/**
 * 使用Flie创建一个文件
 * @author live
 *
 */

public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * 在当前目录下创建test.txt文件
		 * boolean exists（布尔型）
		 * 判断当前File表示的文件或目录是否已经存在
		 */
		
		File file = new File("./demo.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("创建完毕");
		}else{
			System.out.println("文件不存在或已创建该文件");
		}
		
		
		
		

		
		
		
		

	}

}
