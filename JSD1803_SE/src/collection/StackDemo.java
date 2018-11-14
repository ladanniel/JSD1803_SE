package collection;

import java.util.Deque;
import java.util.LinkedList;

/**栈结构
 * 栈：可以保存一组元素，存取元素必须遵循先进后出的原则（原理与子弹夹相似）
 * java.util.Deque支持栈操作，提供了对应的方法；
 * 方法是：push（与offer基本相同） 和 pop（与poll基本相同）
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
