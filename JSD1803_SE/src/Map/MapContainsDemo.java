package Map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
/**
 * //��鼯�����Ƿ����ָ����key �ķ��� x.containsKey("xx");
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
		//map���������һ��keyΪnull������
		map.put(null, "wang");
		System.out.println(map);
		//��鼯�����Ƿ����ָ����key
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
		map.putAll(s);                                             //�﷨Ϊ����s���Ϻϲ���map������
		System.out.println(map);
		
	
		
	}

}
