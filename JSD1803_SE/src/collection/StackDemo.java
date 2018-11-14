package collection;

import java.util.Deque;
import java.util.LinkedList;

/**ջ�ṹ
 * ջ�����Ա���һ��Ԫ�أ���ȡԪ�ر�����ѭ�Ƚ������ԭ��ԭ�����ӵ������ƣ�
 * java.util.Deque֧��ջ�������ṩ�˶�Ӧ�ķ�����
 * �����ǣ�push����offer������ͬ�� �� pop����poll������ͬ��
 * @author live
 *
 */

public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		for (String t:stack) {
			System.out.println(t);
			
		}
	}

}
