package Map;
/**
 * Map�ǽӿڣ�

 һ����java.util���У������ֻ���̨��ʾ�Ķ�����ڹ��ܾ���ӳ�䷽����
 ����:java���ṩ�����򡰲�ѯ����API��
 1:��ѯ������ı�����������Ϣ����Ϊ��Key���ؼ��ʡ���Ϣ����
 2:��ѯ������ص���Ϣ��Ϊ����Value����value��ֵ��
 3��Map���ṩ�˸���Key��ѯValue�Ĺ��ܣ�����Key��ѯvalue
 ����Map���ӿ����������õ�ʵ���ࣺ
   |������Ҫ��ʵ���� HashMap��hash��ɢ�У� HashMap��ɢ�б���ϣ��
   |��HashMap���ǲ�ѯ����족��API��
   |��TreeMap�����ö������㷨���൱��2�ֲ��ң��ٶȺܿ졣
�ġ�map���ص㣺Key�������ظ���Value�����ظ���
   
   ʹ��Map/
   �������󣨸մ������ǿռ���
   Map map = new HashMap������
   /����ѯ��Key-Value�ɶԵĴ��浽map
   boolean b = map.put(key,value);
   �������һ��put��return null������ڶ���putͬ����key��return ��replace�Ķ�
   /��ѯ��ʱ�򣬸���key��ѯ��value
   value = map.get(key);
   ���û���ҵ�����null;
   
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.text.StyledEditorKit.ForegroundAction;
/**
 * ����������еĲ��ҹ�����Map�����Ż������������ܡ�
 * @author live
 *size();�������map���ж��ٸ�Ԫ��
 */

public class Test {
	
	public static void test(int n){
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Map<Integer,String> m = new HashMap<>(n+n/2);  //n+n/2:���Ż�����HashMap
		String val;
		for(int i = 0;i<=n;i++){
			 val = "n"+i;
			 m.put(i, val);
		}
		long t1 = System.nanoTime();
		String v = m.get(n-1);
		long t2 = System.nanoTime();
		 System.out.print(v+" ");
		 System.out.println(t2-t1);
		
	}
	/**
	 * ����LinkList�Ĳ�������
	 * @param args
	 */
	public static void testLinkedList(int n){
		
		LinkedList <String> list = new LinkedList<String>();
		
		for (int i = 0;i<=n;i++) {
			String s = "x"+i;
			list.add("n"+i);
		}
		long t = System.nanoTime();
		String v = list.get(n/2);
		long t1 = System.nanoTime();
		System.out.println("v:"+v);
		System.out.println(t1-t);
	
	}	
	public static void main(String[] args) {
		/**
		 * ����Ƚ�map �Ĳ�ѯ����
		 */
		test(1000000);
		testLinkedList(1000000);
	}
	

}
