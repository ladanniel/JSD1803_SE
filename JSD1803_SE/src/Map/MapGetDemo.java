package Map;

import java.util.HashMap;
import java.util.Map;

public class MapGetDemo {
	public static void main(String[] args) {
		/**
		 * ����Map�Ĳ�ѯ������
		 * 1:����ҵ��˾ͷ���key��Ӧ��ֵ
		 * 2�����û�ҵ��򷵻�null;
		 * ����key����value
		 * key��value�������κ����ͣ�
		 */
		Map<String,String>map = new HashMap<String,String>();
		map.put("u1", "Tom");
		map.put("u2", "jarry");
		//��map�м���
		
		String v1 = map.get("u1");
		String v2 = map.get("u3");
		System.out.println(v1);
		System.out.println(v2);
		
		
	}
	}	


