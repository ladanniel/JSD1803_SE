package Map;
/**
 * Map是接口，

 一、在java.util包中（例如手机后台显示的多个窗口功能就是映射方法）
 二、:java中提供的面向“查询”的API；
 1:查询中输入的被“检索”信息，称为“Key（关键词、信息）”
 2:查询结果返回的信息称为：“Value”，value（值）
 3：Map：提供了根据Key查询Value的功能；根据Key查询value
 三、Map：接口由两个常用的实现类：
   |—最重要的实现类 HashMap，hash（散列） HashMap：散列表（哈希表）
   |—HashMap：是查询“最快”的API；
   |—TreeMap：采用二叉树算法。相当于2分查找，速度很快。
四、map的特点：Key不允许重复，Value可以重复；
   
   使用Map/
   创建对象（刚创建的是空集）
   Map map = new HashMap（）；
   /将查询的Key-Value成对的储存到map
   boolean b = map.put(key,value);
   》如果第一次put，return null；如果第二次put同样的key，return 被replace的对
   /查询的时候，根据key查询到value
   value = map.get(key);
   如果没有找到返回null;
   
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.text.StyledEditorKit.ForegroundAction;
/**
 * 尽量将软件中的查找功能用Map进行优化！提高软件性能。
 * @author live
 *size();用来检测map中有多少个元素
 */

public class Test {
	
	public static void test(int n){
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Map<Integer,String> m = new HashMap<>(n+n/2);  //n+n/2:见优化性能HashMap
		String val;
		for(int i = 0;i<=n;i++){
			 val = "n"+i;
			 m.put(i, val);
		}
		long t1 = System.nanoTime();
		String v = m.get(n-1);
		long t2 = System.nanoTime();
		 System.out.print(v+" ");
		 System.out.println(t2-t1);
		
	}
	/**
	 * 测试LinkList的查找性能
	 * @param args
	 */
	public static void testLinkedList(int n){
		
		LinkedList <String> list = new LinkedList<String>();
		
		for (int i = 0;i<=n;i++) {
			String s = "x"+i;
			list.add("n"+i);
		}
		long t = System.nanoTime();
		String v = list.get(n/2);
		long t1 = System.nanoTime();
		System.out.println("v:"+v);
		System.out.println(t1-t);
	
	}	
	public static void main(String[] args) {
		/**
		 * 纵向比较map 的查询性能
		 */
		test(1000000);
		testLinkedList(1000000);
	}
	

}
