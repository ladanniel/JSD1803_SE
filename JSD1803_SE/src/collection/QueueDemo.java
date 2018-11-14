package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue ����
 * ���У�
 * ���п��Դ��һ��Ԫ�أ����Ǵ�ȡ���밴���Ƚ��ȳ�ԭ�򣨹��򣩣�
 * Queue��һ���ӿڣ���̳���Collection�����Զ���Ҳ���м������ԡ�add��size�ȷ�����Ȼ���ã�
 * QueueҲ�ṩ��һ������ӵķ���������ʵ����Ϊ��
 * java.util.LinkedList;
 * ר����Ӳ�����offer/poll��ר����Ӷ�����ӵķ�����
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
//	    queue.offer("Ready--Go��");
//	    System.out.println(queue);
//	    //���Ӳ�����
//	    String str = queue.poll();
//	    System.out.println(str);
//	    System.out.println(queue);
//	    
//	    //���ö���Ԫ�أ�
//	    str = queue.peek();
//	    System.out.println(str);
//	    System.out.println(queue);
//	    //�Զ��еı���ͨ�����õ���������
//	    for (String c:queue) {
//			System.out.println(c);
//		}
//	    System.out.println(queue);
//		
	}

}
