package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**��һ��List���������10��100���ڵ��������Ȼ���մ�С��˳�����򼯺�
 * 
 * @author live
 *
 */

public class TestSort {
	public static void main(String[] args) {
		List<Integer> it = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			it.add(rand.nextInt(100));
		}
		System.out.println("it:"+it);
	   Collections.sort(it,new Comparator<Integer>(){

		
		public int compare(Integer o1, Integer o2) {
			
			return o1-o2;
		}
		   
	   });
	   System.out.println("it-->"+it);

		
		
		
		
		
		
		
		
		


//		List<Integer> it = new ArrayList<Integer>();
//		Random rand = new Random();
//		for (int i = 0; i <10; i++) {
//			it.add(rand.nextInt(100));
//			
//			
//		}System.out.println("it:"+it);
//		
//		
//		Comparator<Integer> c = new Comparator<Integer>(){
//			public int compare(Integer o1, Integer o2) {
//				
//				return o1-o2;
//			}
//		};
//		Collections.sort(it,c);
//		System.out.println("it-->"+it);


//		Collections.sort(it,new Comparator<Integer>(){
//			public int compare(Integer o1, Integer o2) {
//				return o1-o2;
//			}
//		});
//		System.out.println("it-->"+it);
	}
}

