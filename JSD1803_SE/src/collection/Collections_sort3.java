package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**ʹ��collections.sort(List)����ʱ�����һЩ����֮����
 * 1���÷���Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿڣ�����ʵ�ʿ������ǲ�̫��ȡ�ģ���Ϊ�ù��ܻ������д��
 * �����������ԣ�
 * ��ν�����ԣ�ָ�������ǵ���ĳ������ʱ���ù���Ҫ������Ϊ���޸Ĵ��룬�޸ĵĵط�Խ�࣬������Խ��
 * �����ڳ������չ�ͺ���ά��
 *  
 *  2����Ԫ���Ѿ�ʵ����Comparable�ӿڲ������˱ȽϹ��򣬵��ù�������������������ʱ���÷������޷�ʹ�á�
 *  ���������ַ�����ֻ�ܰ����ַ�Unicode����������������ʱ��û��ʲô����
 * 
 * @author live
 *
 */

public class Collections_sort3 {
	   public static void main(String[] args) {
	      List<String> list = new ArrayList<String>();
	      
	      list.add("marry");
	      list.add("jons");
	      list.add("david");
	      list.add("rose");
	      list.add("jack");
	      list.add("danniel");
	      Collections.sort(list);
	      System.out.println(list);
	      list.add("��");
	      list.add("��");
	      list.add("��");
	      list.add("��");
	      Collections.sort(list);
	      System.out.println(list);
	      
	    	  
		
	}

}
