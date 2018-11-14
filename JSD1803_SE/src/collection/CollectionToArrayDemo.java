package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**����ת��Ϊ����
 * Collection�ṩ�˷�����toArray,�÷������Խ���ǰ����ת��Ϊһ������
 * 
 * @author live
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		String[]arr = c.toArray(new String[c.size()]);
		System.out.println("len"+arr.length);
		System.out.println(Arrays.toString(arr));
		
	}
	
	

}
