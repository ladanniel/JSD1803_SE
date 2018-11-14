package Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author live
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		//第一次将“u1”添加到map
		Object obj = map.put("u1", "Tom");
		//第一次返回为null
		obj = map.put("u1", "Jerry");//可选择接收，也可选择不接收
		//返回被替换的TOM
		System.out.println(obj);
		//显示Map中的内容？
		System.out.println(map);//toString自动调用
		/**
		 * 利用泛型定义类型安全的map集合
		 */
		//java 8 版本语法：
		Map<String,String> map2 = new HashMap<>();//第一个String 是u1的，第二个String 是Tom 的泛型
	    //java6 版本标准语法
		//Map<String,String> map3 = new HashMap<String,String>();
		 String str = map2.put("u1", "Tom");
		 System.out.println(str);
		 str = map2.put("u1", "jerry");
		 System.out.println(str);
		 System.out.println(map2);
	}

}
