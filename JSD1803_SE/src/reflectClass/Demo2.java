package reflectClass;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

//���ԣ��任��ͬ�������������������ʵ��������ʵ��
public class Demo2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫʵ���������֣�");
		String className = scan.nextLine();
		/**Class.forName(String className)
		 * ���Դ������ֻҪ����·���µ��඼���Ե�
		 * ���磬�ڵ�ǰ��Ŀ��src��������е����Լ�API��java�ṩ����
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
