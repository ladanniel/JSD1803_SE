package Map;

import java.util.HashMap;
import java.util.Map;

/**演示Map的方法
 * size()；集合中元素的数量
 * isEmpty();检测集合是否为空；
 * remove()；删除集合中的元素
 * get();在map中
 * @author live
 *
 */

public class MapRemoveDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.put("u1", "tom");
		map.put("u2", "jerry");
		map.put("u3", "david");
		map.put("u4", "andy");
		map.put("u5", "john");
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		//从map中删除u1元素，返回被删除的value
		
	    String val = map.remove("u1");
	    System.out.println(val);
	    System.out.println(map.size());
	    System.out.println(map.isEmpty());
	    
	    map.clear();
	    System.out.println(map.size());
	    System.out.println(map.values());
		
	}

}
