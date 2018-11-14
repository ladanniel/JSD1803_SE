package collection;

import java.util.ArrayList;
import java.util.Collection;

import object.Point;

/**
 * 删除元素集合,只删除第一个相同元素
 * @author live
 *
 */
public class RemoveDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,10));
		c.add(new Point(1,2));
		System.out.println(c);
       Point p = new Point(1,2);
       /**
        * 删除也是依靠equals比较的结果
        */
       c.remove(p);
       System.out.println(c);
	}

}
