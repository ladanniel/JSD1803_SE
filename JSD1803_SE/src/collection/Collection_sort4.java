package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**Collections提供了一个重载的sort方法：
 * static void sort（List list，Comparable c）
 * 该方法要求传入一个比较器，然后根据比较器比较的结果对集合元素进行自然排序
 * 由于该方法要求传入一个额外的比较规则（比较器），所以该方法不再要求元素必须实现Comparable接口
 * 从而对元素没有入侵性。并且由于使用该比较规则排序集合
 * 所以也就不再需要元素自身的的比较规则，那么元素自身比较规则不满足排序需求的问题也得以解决；
 * 
 * 建议：如果在实际开发中，自身泛化的比较方法可用优先，不可用，可采取此种模式
 * 
 * @author live
 *
 */
public class Collection_sort4 {
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("苍老师");
		list.add("小泽老师");
		list.add("传奇");
		System.out.println(list);
		//例如按照字数多少排序
//		Comparator<String> c = new Comparator<String>(){
//			public int compare(String o1, String o2) {
//				
//				return o1.length()-o2.length();
//			}
//			
//		};在实际开发中按照以下简写模式
	
		Collections.sort(list,new Comparator<String>(){
			public int compare(String o1,String o2){
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);
	}

	//额外定义比较器
}

