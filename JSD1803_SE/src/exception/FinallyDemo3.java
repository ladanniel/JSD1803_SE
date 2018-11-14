package exception;

import java.io.FileInputStream;

/**
 * JDK1.7以后推出了一个新特性，自动关闭功能
 * @author live
 *
 */

public class FinallyDemo3 {
	public static void main(String[] args) {
		/**实现了AutoCloseable接口的可以定义在这里，该特性是编译器认可，最终编译器还是会将代码改为
		 * 在finally中关闭该流
		 */
		try(FileInputStream fis = new FileInputStream("fos.txt");) {
			int d = fis.read();
			System.out.println(d);
			fis.close();
			return;
		} catch (Exception e) {
			e.printStackTrace();

		}
		
	}

}
