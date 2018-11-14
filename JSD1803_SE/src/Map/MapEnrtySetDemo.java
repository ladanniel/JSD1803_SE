package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;;

public class MapEnrtySetDemo {
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("host", "doc.tedu.cn");
		map.put("Connection","Keep-alive");
		map.put("Cache-Control", "max-age=0");
		
		Set<Entry<String,String>> set = map.entrySet();
		for(Entry<String,String> s:set){
			System.out.println(s.getKey()+":"+s.getValue());
			
			
		}
		
		
		
		
		
		
		
		
		
//		/**
//		 * 利用MapEntrySet对map集合进行遍历
//		 */
//		Map<String,String> map = new HashMap<String,String>();
//	  //如下数据相当于从浏览器收到的请求头
//		map.put("host", "doc.tedu.cn");
//		map.put("Connection", "Keep-alive");
//		map.put("Cache-Control", "max-age=0");
//		//遍历全部的请求头
//		//map 没有提供直接遍历的方法；可以利用entry和keySet 间接实现遍历
//		//Entry 对象就代表map中的key-value对，一个entry对象中包含两个属性，一个是key，一个是value，entry的实现类时HashMap内部类
//		//entry<String,String>是entry和value的属性，set中包含map中全部的key-value对（set=map.entryset()），
//		//只要遍历set就相当于遍历了map
//		Set<Entry<String,String>> set = map.entrySet();
//		for (Entry<String,String>e:set) {
//			System.out.println(e.getKey()+":"+e.getValue());
//			
//		}
		
	}

}
