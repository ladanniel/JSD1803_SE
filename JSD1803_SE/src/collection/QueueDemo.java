package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue 队列
 * 队列：
 * 队列可以存放一组元素，但是存取必须按照先进先出原则（规则）；
 * Queue是一个接口，其继承自Collection，所以队列也具有集合特性。add，size等方法依然可用，
 * Queue也提供了一组进出队的方法，常用实现类为：
 * java.util.LinkedList;
 * 专属添加操作：offer/poll：专属添加对象（入队的方法）
 * 
 * @author live
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		for (String ca:queue) {
			System.out.println(ca);
		}
		
		
		
		
		
		
		
//		Queue<String>queue = new LinkedList<String>();
//		queue.offer("one");
//		queue.offer("two");
//		queue.offer("three");
//		queue.offer("four");
//		System.out.println(queue);
//	    queue.offer("Ready--Go！");
//	    System.out.println(queue);
//	    //出队操作：
//	    String str = queue.poll();
//	    System.out.println(str);
//	    System.out.println(queue);
//	    
//	    //引用队首元素：
//	    str = queue.peek();
//	    System.out.println(str);
//	    System.out.println(queue);
//	    //对队列的遍历通常采用迭代器遍历
//	    for (String c:queue) {
//			System.out.println(c);
//		}
//	    System.out.println(queue);
//		
	}

}
