package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ���Ԫ�صļ���
 * @author live
 *
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(5,6));
		list.add(new Point(2,7));
		list.add(new Point(8,9));
		list.add(new Point(1,3));
		list.add(new Point(4,2));
		System.out.println("list:"+list);
		/**Collections��sort���������򼯺�ʱҪ�󼯺�Ԫ�ر���ʵ��Comparable�ӿ�
		 * ���ʺ������Զ���Ԫ�أ�ʵ�ʿ����в���
		 */
		Collections.sort(list);
		System.out.println("list-->"+list);
		
	}

}
