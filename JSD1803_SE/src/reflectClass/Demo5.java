package reflectClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射可以调用一个类的私有成员
 * @author live
 *
 */

public class Demo5 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class cls = Class.forName("reflect.Person");
		Object o = cls.newInstance();
		Method method = cls.getDeclaredMethod("dosome", null);
		System.out.println("已获取私有方法dosome");
		//若需要调用私有方法，需要设置访问权限
		method.setAccessible(true);
		method.invoke(o, null);
		
	}

}
