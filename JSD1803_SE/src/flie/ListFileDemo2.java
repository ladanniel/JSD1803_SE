package flie;

import java.io.File;
import java.io.FileFilter;

/**
 * File�ṩ��һ�����ص�ListFile����������ָ��һ���ļ���������(��ȡ��ͬ���͵��ļ�)
 * Ȼ��һ��Ŀ¼�����������Ҫ�������أ�����������ԣ�
 * @author live
 *
 */
public class ListFileDemo2 {
      public static void main(String[] args) {
    	 
    	 
    	  
    	  
//ԭ��д��
//   	  File dir = new File(".");
//   	  MyFilter filter = new MyFilter();
//		File[] subs = dir.listFiles(new MyFilter());
//		System.out.println("len:"+subs.length);
//		for (int i = 0; i < subs.length; i++) {
//			System.out.println(subs[i].getName());
//		}	
//	}
	
//ʹ�������ڲ�����ʽ����
//	File dir = new File(".");
//	FileFilter filter = new FileFilter(){
//		public boolean accept(File file){
//			return file.getName().endsWith(".txt");
//		}
//	};
//�����ڲ����д��Ϊ��filter=filter
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
////		System.out.println("���ڹ��ˣ�"+name);
////		return name.endsWith(".txt");
//		return file.isFile();
//		
//	}
// }

