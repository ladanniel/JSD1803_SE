package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**��������
 * ��������Ĺ����ࣺjava.util.Collections
 * �ṩ�˺ܶ��"��̬"���������ڲ�������
 * ����Collection��collections�����𣿣�
 * @author live
 *���ޣ�ֻ�ܶ�List��������
 */
public class Collections_sort {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(rand.nextInt(100));
			
		}
		System.out.println(list);
		//����
		Collections.sort(list);
		System.out.println(list);
		//����
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
