package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**集合排序：
 * 集合排序的工具类：java.util.Collections
 * 提供了很多的"静态"方法，便于操作集合
 * 区别：Collection与collections的区别？？
 * @author live
 *局限：只能对List集合排序；
 */
public class Collections_sort {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(rand.nextInt(100));
			
		}
		System.out.println(list);
		//排序
		Collections.sort(list);
		System.out.println(list);
		//乱序
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
