package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**Collection�ṩ��ͳһ�Ļ�ȡԪ�صĲ���������
 * ����������ʹ�õ��ǵ�����ģʽ��
 * Iterator itrator�������÷�����ȡһ���������ڱ�����ǰ���ϵĵ�������
 * 
 * java.util.Iterator
 * Iterator ��һ���ӿڣ����ã�����������Ϊ���ںţ��������˵������������ϵ���ز�����������ͬ�ļ��϶��ṩ��һ��������ʵ���ࣻ
 * 
 * ����������������ѭ���ʣ�ȡ��ɾ�Ĳ��裬����ɾ��Ԫ�ز��Ǳ�Ҫ�Ĳ�����
 * 
 * @author live
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();//collection,�ǽӿڣ��ӿ�ָ������ʵ����Listʵ����collection����ArrayListʵ����List�ӿ�
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("fore");
		c.add("#");
		c.add("five");
		System.out.println("c:"+c);
		Iterator<String> it = c.iterator();
		/**
		 * boolean hasNext()
		 * �жϵ�ǰ�����Ƿ���Ԫ�ؿ��Ե���
		 * 
		 * E next();
		 * ��ȡ������һ��Ԫ�أ�
		 */
		while(it.hasNext()){  
			//��������������Ԫ�أ���һ����ͬ�����һ��
			String str = (String) it.next();
			if ("#".equals(str)) {
				                                                                   /** ������Ҫ���ڱ����Ĺ����в���ͨ�����ϵķ�����ɾԪ��
				                                                                    * ��������׳��쳣���������ṩ��remove������ɾ���ľ���ͨ��next����������Ԫ��
				                                                                     * 
			                                                                         */
				c.remove(str);    
				it.remove();
				
				
			}
			System.out.println(str);
		}System.out.println(c);
		
	}

}
