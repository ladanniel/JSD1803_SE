package flie;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重载的ListFile方法，可以指定一个文件过滤器；(获取相同类型的文件)
 * 然后将一个目录中满足过滤器要求的子项返回，不满足则忽略；
 * @author live
 *
 */
public class ListFileDemo2 {
      public static void main(String[] args) {
    	 
    	 
    	  
    	  
//原本写法
//   	  File dir = new File(".");
//   	  MyFilter filter = new MyFilter();
//		File[] subs = dir.listFiles(new MyFilter());
//		System.out.println("len:"+subs.length);
//		for (int i = 0; i < subs.length; i++) {
//			System.out.println(subs[i].getName());
//		}	
//	}
	
//使用匿名内部类形式创建
//	File dir = new File(".");
//	FileFilter filter = new FileFilter(){
//		public boolean accept(File file){
//			return file.getName().endsWith(".txt");
//		}
//	};
//匿名内部类简写因为：filter=filter
//	File[] subs = dir.listFiles(new FileFilter(){
//		public boolean accept(File file){
//			return file.getName().endsWith(".txt");
//		}
//	});
//      
//	System.out.println("len"+subs.length);
//	for (int i = 0; i < subs.length; i++) {
//		System.out.println(subs[i].getName());
//	}
	
	
	
	
	
	
	File dir = new File(".");
	File[] subs = dir.listFiles(new FileFilter(){
	public boolean accept(File file){
		return file.getName().endsWith(".txt");
	}
});
	System.out.println("len"+subs.length);
	for (int i = 0; i < subs.length; i++) {
		System.out.println(subs[i].getName());
	}
}
}
// class MyFilter implements FileFilter{
//	public boolean accept(File file){
////		String name = file.getName();
////		System.out.println("正在过滤："+name);
////		return name.endsWith(".txt");
//		return file.isFile();
//		
//	}
// }

