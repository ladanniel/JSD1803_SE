package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**JDK1.5֮���Ƴ���һ�������ԣ�����(����Լ��Ԫ������)
 * 
 * ���ͣ��ֳ�Ϊ���������ͣ�����������ڵ���ĳ����Ĺ���ʱ������һ����������������
 * ��������ԣ������Ĳ����Լ�����ֵ�����ͣ���������˴�������ȣ�
 * 
 * ����Ӧ����㷺�ĵط����Ǽ��ϣ�����ָ�������е�Ԫ�����͡�
 * �����ʵ�����⣺
 * �����ϵ����
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
			String str = it.next();                         //��ȡԪ��ʱ���������ͣ����������Զ�������ʹ���      //��ȡԪ��ʱ���������ͻ�ǿ��ת��
			System.out.println("str:"+str);
			if ("*".equals(str)) {
				              
				it.remove();
				
			}
			System.out.println(c);
			
		}
		for (String str:c) {                                     //�����for�൱��Iterator <String> it = c.iterator();while (it.hasNext()) { String str = it.next(); }��������
			System.out.print(str+" ");
		}
		
	}

}
