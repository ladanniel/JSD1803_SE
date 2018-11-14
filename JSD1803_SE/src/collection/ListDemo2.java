package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

/**
 * List�ṩ��һ�����ص�add��remove����
 * @author live
 * 1: void add(int index,E e);
 * ������Ԫ�ز��뵽ָ��λ��
 * 2: E remove(int index);
 *ɾ����ǰ������ָ��λ����Ӧ��Ԫ�ز����䷵��
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/**
		 * void add(int index,E e);
		 * ������Ԫ�ز��뵽ָ��λ��
		 */
		//example [one,two,2,three,four]
		list.add(2,"2");
	    System.out.println(list);
	    
	    /**
	     * E remove(int index);
         *ɾ����ǰ������ָ��λ����Ӧ��Ԫ�ز����䷵��
	     */
	    String old =list.remove(1);                                           //old�ɽ��գ��ɲ�����
	    System.out.println(list);
	    System.out.println("old"+old);
	}

}
