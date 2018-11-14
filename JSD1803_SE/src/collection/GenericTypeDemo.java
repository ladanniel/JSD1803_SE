package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**JDK1.5之后推出了一个新特性：泛型(用来约束元素类型)
 * 
 * 泛型：又称为参数化类型，允许调用者在调用某个类的功能时，传入一个或多个类型来定义
 * 该类的属性，方法的参数以及返回值的类型，这大大提高了代码的灵活度，
 * 
 * 泛型应用最广泛的地方就是集合，用来指定集合中的元素类型。
 * 解决的实际问题：
 * 供需关系问题
 * 
 * @author live
 */

public class GenericTypeDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("*");
		c.add("two");
		c.add("*");
		c.add("three");
		c.add("*");
		c.add("four");
		c.add("*");
		c.add("five");
		Iterator <String> it = c.iterator();
		while (it.hasNext()) {
			String str = it.next();                         //获取元素时无需再造型，编译器会自动添加造型代码      //获取元素时无需再造型或强制转换
			System.out.println("str:"+str);
			if ("*".equals(str)) {
				              
				it.remove();
				
			}
			System.out.println(c);
			
		}
		for (String str:c) {                                     //这里的for相当于Iterator <String> it = c.iterator();while (it.hasNext()) { String str = it.next(); }三步操作
			System.out.print(str+" ");
		}
		
	}

}
