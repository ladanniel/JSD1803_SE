package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类：Arrays 提供了 一个静态方法asList 该方法可以将给定的数组转换为一个List
 * 语法结构
 * Arrays.asList(原数组对象)；(将集合转换为数组)
 * @author live
 *
 */

public class ArrauToListDemo {
	public static void main(String[] args) {
		String [] arr = {"one","two","three","four"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list.size());
		System.out.println(list);
		/**
		 * 对数组转换的集合进行操作，就是对元数组对应的操作
		 */
//		list.add("five");
		list.set(1, "2");
		/**增删元素时不支持的操作，因为会导致数组扩容或缩容，
		 * 那样就无法表示原数组了
		 */
		System.out.println("list"+list);
		System.out.println("array:"+Arrays.toString(arr));
		List<String>list2 = new ArrayList<String>(list);
		/**
		 * 可以自行创建一个集合，然后操作；
		 * 所以集合都支持一个参数为Collection的构造方法，所用是在创建当前集合的同时
		 * 包含给定集合中的所有元素；
		 */
		System.out.println("list2"+list2);
		list2.add("five");
		System.out.println("list2"+list2);
	}

}
