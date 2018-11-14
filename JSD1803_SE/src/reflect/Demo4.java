package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 调用含有实例参数的方法
 * @author live
 *
 */
public class Demo4 {
	public static void main(String []args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		Person p = new Person();
		p.sayHello();
//1.加载Person
		Class cls = Class.forName("reflect.Person");
//2.实例化
		Object o = cls.newInstance();
//3.获取sayHello（String name , int age）
		Method method = cls.getDeclaredMethod("sayHello",new Class[]{String.class,int.class});
		method.invoke(o, new Object[]{"传奇",20});
		
		

		
		
	}

}
