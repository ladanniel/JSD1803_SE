package collection;

import java.util.ArrayList;
import java.util.Collection;

import object.Point;

/**boolean contains(E e):判断当前集合是否包含给定元素
 * @author live
 *
 */
public class ContainsDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,10));
		System.out.println(c);
       Point p = new Point(1,2);
		/**集合是用给定元素与集合现有元素进行equals比较，若有比较结果为true的，则认为集合包含该元素
		 * 所以元素的equals方法直接影响集合的contains方法的结果；
		 */
		boolean contains = c.contains(c);
		System.out.println("contains:"+contains);
	}

}
