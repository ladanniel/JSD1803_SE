package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ��ȡ�Ӽ�(List subList(index , index))
 * ���򣺺�ͷ����β
 * @author live
 *
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		//��ȡ3-7
		List<Integer>subList = list.subList(3, 8);
		System.out.println(subList);
		

		 for (int i = 0; i < subList.size(); i++) {
			int d = subList.get(i);
			 d = d*10;
			 subList.set(i, d);
			 
			
			 
		}
		System.out.println(subList);
		System.out.println(list);
	}

}
