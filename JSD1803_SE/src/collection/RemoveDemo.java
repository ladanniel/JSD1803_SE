package collection;

import java.util.ArrayList;
import java.util.Collection;

import object.Point;

/**
 * ɾ��Ԫ�ؼ���,ֻɾ����һ����ͬԪ��
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
        * ɾ��Ҳ������equals�ȽϵĽ��
        */
       c.remove(p);
       System.out.println(c);
	}

}
