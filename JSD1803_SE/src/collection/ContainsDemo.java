package collection;

import java.util.ArrayList;
import java.util.Collection;

import object.Point;

/**boolean contains(E e):�жϵ�ǰ�����Ƿ��������Ԫ��
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
		/**�������ø���Ԫ���뼯������Ԫ�ؽ���equals�Ƚϣ����бȽϽ��Ϊtrue�ģ�����Ϊ���ϰ�����Ԫ��
		 * ����Ԫ�ص�equals����ֱ��Ӱ�켯�ϵ�contains�����Ľ����
		 */
		boolean contains = c.contains(c);
		System.out.println("contains:"+contains);
	}

}
