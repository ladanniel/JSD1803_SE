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
//		 * ����MapEntrySet��map���Ͻ��б���
//		 */
//		Map<String,String> map = new HashMap<String,String>();
//	  //���������൱�ڴ�������յ�������ͷ
//		map.put("host", "doc.tedu.cn");
//		map.put("Connection", "Keep-alive");
//		map.put("Cache-Control", "max-age=0");
//		//����ȫ��������ͷ
//		//map û���ṩֱ�ӱ����ķ�������������entry��keySet ���ʵ�ֱ���
//		//Entry ����ʹ���map�е�key-value�ԣ�һ��entry�����а����������ԣ�һ����key��һ����value��entry��ʵ����ʱHashMap�ڲ���
//		//entry<String,String>��entry��value�����ԣ�set�а���map��ȫ����key-value�ԣ�set=map.entryset()����
//		//ֻҪ����set���൱�ڱ�����map
//		Set<Entry<String,String>> set = map.entrySet();
//		for (Entry<String,String>e:set) {
//			System.out.println(e.getKey()+":"+e.getValue());
//			
//		}
		
	}

}
