package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ���ú���ʵ�������ķ���
 * @author live
 *
 */
public class Demo4 {
	public static void main(String []args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		Person p = new Person();
		p.sayHello();
//1.����Person
		Class cls = Class.forName("reflect.Person");
//2.ʵ����
		Object o = cls.newInstance();
//3.��ȡsayHello��String name , int age��
		Method method = cls.getDeclaredMethod("sayHello",new Class[]{String.class,int.class});
		method.invoke(o, new Object[]{"����",20});
		
		

		
		
	}

}
