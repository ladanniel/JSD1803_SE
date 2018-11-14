package collection;

import java.util.ArrayList;
import java.util.Collection;

/**java.util.Collection
 * Collection 是所有集合的——顶级接口，规定了所有集合都应当具备的方法
 * 其下有两个常用的派生接口：
 * 1；java.util.List:可重复集合，并且有序（不要求放在集合里的元素，重复有两次以上）
 * 2；java.util.Set：不可重复集合；（不允许放在集合里的元素，重复两次以上）
 * 重复指的是元素是否可以重复，而重复的标准是元素自身equals比较
 * 的结果是否为true。
 * @author live
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/**
		 * boolean add(E e);E-目前先当做Object看待
		 * 向当前集合中添加一个元素，成功添加则返回true
		 * xxxx.size;返回当前集合的元素个数，xxxxx.length,只关注数组长度，不关注数组的元素个数,返回只是数组长度，而不会返回数组元素个数
		 * xxxx.isEmpty:判断当前集合是否为空集，若为空，返回值为true（boolean型）
		 * c==null与.isEmpty,概念内含不同，例如空杯子里没水，前者表示没有杯 子，后者表示杯子里没水
		 * xxx.clear：清空集合  
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("for");
		c.add("five");
		c.addAll(c);
		System.out.println(c);
		//集合内元素的个数
		int size = c.size();
		System.out.println("size"+size);
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		//清空集合
		c.clear();
		System.out.println(c);
		System.out.println("size"+c.size());
		System.out.println("isEmpty"+isEmpty);
	}

}
