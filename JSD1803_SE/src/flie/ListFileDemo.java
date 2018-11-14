package flie;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author live
 *
 */

public class ListFileDemo {
	public static void main(String[] args) {
		/**
		 * 获取当前目录（项目目录）中的子项
		 * .就是当前目录
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
