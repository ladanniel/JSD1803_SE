package Map;

import java.util.HashMap;
import java.util.Map;

public class MapGetDemo {
	public static void main(String[] args) {
		/**
		 * 测试Map的查询方法；
		 * 1:如果找到了就返回key对应的值
		 * 2：如果没找到则返回null;
		 * 基于key查找value
		 * key和value可以是任何类型，
		 */
		Map<String,String>map = new HashMap<String,String>();
		map.put("u1", "Tom");
		map.put("u2", "jarry");
		//从map中检索
		
		String v1 = map.get("u1");
		String v2 = map.get("u3");
		System.out.println(v1);
		System.out.println(v2);
		
		
	}
	}	


