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
		//��һ�ν���u1����ӵ�map
		Object obj = map.put("u1", "Tom");
		//��һ�η���Ϊnull
		obj = map.put("u1", "Jerry");//��ѡ����գ�Ҳ��ѡ�񲻽���
		//���ر��滻��TOM
		System.out.println(obj);
		//��ʾMap�е����ݣ�
		System.out.println(map);//toString�Զ�����
		/**
		 * ���÷��Ͷ������Ͱ�ȫ��map����
		 */
		//java 8 �汾�﷨��
		Map<String,String> map2 = new HashMap<>();//��һ��String ��u1�ģ��ڶ���String ��Tom �ķ���
	    //java6 �汾��׼�﷨
		//Map<String,String> map3 = new HashMap<String,String>();
		 String str = map2.put("u1", "Tom");
		 System.out.println(str);
		 str = map2.put("u1", "jerry");
		 System.out.println(str);
		 System.out.println(map2);
	}

}
