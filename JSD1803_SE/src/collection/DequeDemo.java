package collection;

import java.util.Deque;
import java.util.LinkedList;

/**java.util.Deque ˫�˶���
 * Deque�ӿڼ̳���Queue��˫�˶��������˶����������������Ķ���,
 * ���õ�ʵ���ࣺ
 * java.util.LinkedList
 * ʵ�֣����ڣ�ǰ�����˹���
 * ջ������������push��pop
 * @author live
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String>deque = new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		System.out.println(deque);
		deque.offerFirst("three");
		System.out.println(deque);
		
		deque.offerLast("four");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		      str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
		str = deque.peekFirst();
		
		System.out.println("str:"+str);
		
		str = deque.getFirst();

		System.out.println("str-->"+str);
		System.out.println(deque);
		
		
		str = deque.pollFirst();
		
		System.out.println(str);
		System.out.println(deque);
		
		
	}

}
