package collection;

import java.util.ArrayList;
import java.util.Collection;

/**ʹ����ѭ����������
 * 
 * @author live
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println("c:"+c);
		/**��ѭ���������Ͼ��ǵ������������ϡ������ڱ���������
		 * ����ͨ�����ϵķ�����ɾԪ�أ�
		 * 
		 */
		for (Object o:c) {
		   String str = (String)o;
		   System.out.print(str+" ");
		}
	}
	
}
