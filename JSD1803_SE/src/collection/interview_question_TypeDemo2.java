package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���ͳ��������⣺
 * @author live
 *
 */
public class interview_question_TypeDemo2 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		//���������add�Ĳ����Ƿ�ΪInteger
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
	//	c1.add("one");  ���벻ͨ����ʵ����c1�ķ��Ͳ�ƥ��
	//��ȡ����Ԫ��ʱ���������Ჹȫ���뽫Ԫ������ΪInteger
		for (int i:c1) {
			System.out.println(i);
		}
		System.out.println("c1:"+c1);
		
		
		Collection c2 = c1;                                            //����һ������c2��ָ��c1�ļ���new ArrayList
	    c2.add("four");
	    System.out.println("c2:"+c2);
	    System.out.println("c1:"+c1);
	    //����c1ʱ����������쳣�������ci 
	    for (double i:c1) {
			System.out.println(i);
		}
	}
	

}
