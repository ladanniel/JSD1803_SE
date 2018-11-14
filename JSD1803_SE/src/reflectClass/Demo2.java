package reflectClass;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

//测试，变换不同的类名，依靠反射机制实例化该类实例
public class Demo2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要实例化的名字：");
		String className = scan.nextLine();
		/**Class.forName(String className)
		 * 可以传入的类只要在类路径下的类都可以的
		 * 例如，在当前项目中src里任意包中的类以及API中java提供的类
		 * Java.util.HashMap;
		 * java.util.ArrayList
		 * reflect.Emp
		 * reflect.Person
		 * 
		 */
		Class cls = Class.forName(className);
		Object obj = cls.newInstance();
		System.out.println(obj);
	
			
	
	
	
	}
	
	

}
