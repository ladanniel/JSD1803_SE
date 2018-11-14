package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**集合转换为数组
 * Collection提供了方法：toArray,该方法可以将当前集合转换为一个数组
 * 
 * @author live
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		String[]arr = c.toArray(new String[c.size()]);
		System.out.println("len"+arr.length);
		System.out.println(Arrays.toString(arr));
		
	}
	
	

}
