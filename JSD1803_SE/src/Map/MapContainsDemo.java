package Map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
/**
 * //检查集合中是否包含指定的key 的方法 x.containsKey("xx");
 * @author live
 *
 */
public class MapContainsDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("u1", "Tom");
		map.put("u2", "Jerry");
		map.put("u3", "Andy");
		map.put("u4", "Mac");
		//map中允许添加一个key为null的数据
		map.put(null, "wang");
		System.out.println(map);
		//检查集合中是否包含指定的key
		boolean b1 = map.containsKey("u1");
		boolean b2 = map.containsKey("u5");
		boolean b3 = map.containsKey(null);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		Map<String,String> s = new HashMap<>();
		s.put("u1", "jimi");
		s.put("a2", "kary");
		s.put("a3", "jack");
		s.put("a4", "stiven");
		map.putAll(s);                                             //语法为：把s集合合并到map集合中
		System.out.println(map);
		
	
		
	}

}
