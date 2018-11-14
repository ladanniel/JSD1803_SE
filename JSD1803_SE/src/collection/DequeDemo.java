package collection;

import java.util.Deque;
import java.util.LinkedList;

/**java.util.Deque 双端队列
 * Deque接口继承自Queue，双端队列是两端都可以做进出操作的队列,
 * 常用的实现类：
 * java.util.LinkedList
 * 实现（窗口）前进后退功能
 * 栈的两个方法：push和pop
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
