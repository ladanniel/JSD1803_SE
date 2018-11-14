package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**利用反射机制调用某个类的实例方法
 * 
 * @author live
 *
 */
public class Demo3 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//实例化
		Person p = new Person();
		//调用该对象的方法
		p.sayHi("zhangsan");
		
		Class cls = Class.forName("reflect.Person");
		Object o = cls.newInstance();
		//获取Person类的sayHello
		/**获取Person类的sayHello（）方法
		 * Class提供了获取其表示的类相关信息的一组方法
		 * 其中：
		 * Method getDeclareMethod(String name,Class[]args)
		 * 是表示获取当前Class所表示的类定义的指定名字及参数列表的方法
		 * Method是反射API中一个重要的类
		 * 其每一个实例用于表示某个类的一个具体的方法，通过Method可以获取到表示的方法的相关信息
		 * 如方法名，返回值类型，参数类型，访问修饰符等，并且也可以通过Method动态调用其表示的方法
		 * 
		 */
		Method method = cls.getDeclaredMethod("sayHello", null);
		/**Method的invoke方法是用来调用当前Method所表示的方法：
		 * 参数1：由于成员方法所属对象，name调用Method所表示的方法是要传入该方法所属对象
		 * 参数2：实际参数，若该方法无参，则传入null即可；
		 * 即：
		 * 若method表示的是Person类的方法sayHellon；那么
		 * method,invoke（o,null）等同于o.sayHello();
		 * 
		 */
		method.invoke(o, null);
		
		
		
	}

}
