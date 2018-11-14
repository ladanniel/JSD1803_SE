package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
/**
 * ArrayList()与HashSet();的区别，后者所包含内容是不能重复的并且，会根据内容进行相关排序（比如全是字母，会根据26个字母的先后顺序进行排序，数字排在前面），前者没有规定
 * @author live
 **boolean addAll();将给定集合中的所有元素，添加到当前指定集合中
 *
 *boolean Contains();判断当前集合是否包含集合中给定的元素
 */
public class CollectionDemo3 {
	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add("java");
		c.add("c");
		c.add(".net");
		c.add("java");
		System.out.println("c:"+c);
		 
		Collection c2 = new HashSet();
		c2.add("php");
		c2.add("android");
		c2.add("php");
		System.out.println("c2:"+c2);
		/**boolean addAll();将给定集合中的所有元素，添加到当前指定集合中
		 * 
		 * boolean Contains();判断当前集合是否包含集合中给定的元素
		 * 
		 */
		c.addAll(c2);
		System.out.println("c:"+c);
		
		c2.addAll(c);
		System.out.println("c2:"+c2);
		
		Collection c3 = new ArrayList();
		c3.add("c");
		c3.add("java");
		c3.add("c++");
		System.out.println("c3:"+c3);
		
		boolean containsAll = c.containsAll(c3);
		System.out.println("全包含："+containsAll);
		
		c.removeAll(c3);
		System.out.println("c:"+c);
		c3.removeAll(c);
		System.out.println("c3"+c3);
		
		c.remove(c3);
		System.out.println("c::"+c);
	}

}
