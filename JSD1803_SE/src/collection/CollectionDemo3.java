package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
/**
 * ArrayList()��HashSet();�����𣬺��������������ǲ����ظ��Ĳ��ң���������ݽ���������򣨱���ȫ����ĸ�������26����ĸ���Ⱥ�˳�����������������ǰ�棩��ǰ��û�й涨
 * @author live
 **boolean addAll();�����������е�����Ԫ�أ���ӵ���ǰָ��������
 *
 *boolean Contains();�жϵ�ǰ�����Ƿ���������и�����Ԫ��
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
		/**boolean addAll();�����������е�����Ԫ�أ���ӵ���ǰָ��������
		 * 
		 * boolean Contains();�жϵ�ǰ�����Ƿ���������и�����Ԫ��
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
		System.out.println("ȫ������"+containsAll);
		
		c.removeAll(c3);
		System.out.println("c:"+c);
		c3.removeAll(c);
		System.out.println("c3"+c3);
		
		c.remove(c3);
		System.out.println("c::"+c);
	}

}
