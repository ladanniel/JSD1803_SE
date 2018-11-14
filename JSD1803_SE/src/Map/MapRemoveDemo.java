package Map;

import java.util.HashMap;
import java.util.Map;

/**��ʾMap�ķ���
 * size()��������Ԫ�ص�����
 * isEmpty();��⼯���Ƿ�Ϊ�գ�
 * remove()��ɾ�������е�Ԫ��
 * get();��map��
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
		
		//��map��ɾ��u1Ԫ�أ����ر�ɾ����value
		
	    String val = map.remove("u1");
	    System.out.println(val);
	    System.out.println(map.size());
	    System.out.println(map.isEmpty());
	    
	    map.clear();
	    System.out.println(map.size());
	    System.out.println(map.values());
		
	}

}
