package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**Collections�ṩ��һ�����ص�sort������
 * static void sort��List list��Comparable c��
 * �÷���Ҫ����һ���Ƚ�����Ȼ����ݱȽ����ȽϵĽ���Լ���Ԫ�ؽ�����Ȼ����
 * ���ڸ÷���Ҫ����һ������ıȽϹ��򣨱Ƚ����������Ը÷�������Ҫ��Ԫ�ر���ʵ��Comparable�ӿ�
 * �Ӷ���Ԫ��û�������ԡ���������ʹ�øñȽϹ������򼯺�
 * ����Ҳ�Ͳ�����ҪԪ������ĵıȽϹ�����ôԪ������ȽϹ��������������������Ҳ���Խ����
 * 
 * ���飺�����ʵ�ʿ����У��������ıȽϷ����������ȣ������ã��ɲ�ȡ����ģʽ
 * 
 * @author live
 *
 */
public class Collection_sort4 {
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("����ʦ");
		list.add("С����ʦ");
		list.add("����");
		System.out.println(list);
		//���簴��������������
//		Comparator<String> c = new Comparator<String>(){
//			public int compare(String o1, String o2) {
//				
//				return o1.length()-o2.length();
//			}
//			
//		};��ʵ�ʿ����а������¼�дģʽ
	
		Collections.sort(list,new Comparator<String>(){
			public int compare(String o1,String o2){
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);
	}

	//���ⶨ��Ƚ���
}

