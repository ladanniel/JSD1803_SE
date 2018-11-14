package collection;


import java.util.ArrayList;
import java.util.List;

/**java.util.List�ӿ�
 * List �ǿ��ظ����������ṩ��һ�����ͨ���±����Ԫ�صķ���
 * ����ʵ���ࣺ
 * java.util.ArrayList
 * �ڲ�������ʵ�֣���ѯЧ�ʸ���
 * java.util.LinkedList
 * �ڲ�������ʵ�֣���ɾЧ�ʸ��ã���λ ĩλ��ɾԪ��Ч�����
 * E get(int index)
 * ��ȡָ��λ�ö�Ӧ��Ԫ��
 * 
 * E set(int index,E e);
 * ��ָ��Ԫ�����õ�ָ��λ�ã�����ֵΪԭλ�ö�Ӧ��Ԫ�أ�set������ʵ��������"�滻"Ԫ�ز�����
 * 
 * @author live
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("list:"+list);
		/**
		 * E get(int index)
		 * ��ȡָ��λ�ö�Ӧ��Ԫ��
		 *///��ȡ�ڶ���Ԫ��
		String str = list.get(1);
		System.out.println("str:"+str);
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			System.out.println("stri:"+str);
		}
		/**E set(int index,E e);
		 * ��ָ��Ԫ�����õ�ָ��λ�ã�����ֵΪԭλ�ö�Ӧ��Ԫ�أ�set������ʵ������
		 * ���滻Ԫ�ز�����
		 * 
		 */
		// one 2 three four
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println("old:"+old);
	}

}
