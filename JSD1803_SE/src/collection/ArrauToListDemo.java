package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * ����Ĺ����ࣺArrays �ṩ�� һ����̬����asList �÷������Խ�����������ת��Ϊһ��List
 * �﷨�ṹ
 * Arrays.asList(ԭ�������)��(������ת��Ϊ����)
 * @author live
 *
 */

public class ArrauToListDemo {
	public static void main(String[] args) {
		String [] arr = {"one","two","three","four"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list.size());
		System.out.println(list);
		/**
		 * ������ת���ļ��Ͻ��в��������Ƕ�Ԫ�����Ӧ�Ĳ���
		 */
//		list.add("five");
		list.set(1, "2");
		/**��ɾԪ��ʱ��֧�ֵĲ�������Ϊ�ᵼ���������ݻ����ݣ�
		 * �������޷���ʾԭ������
		 */
		System.out.println("list"+list);
		System.out.println("array:"+Arrays.toString(arr));
		List<String>list2 = new ArrayList<String>(list);
		/**
		 * �������д���һ�����ϣ�Ȼ�������
		 * ���Լ��϶�֧��һ������ΪCollection�Ĺ��췽�����������ڴ�����ǰ���ϵ�ͬʱ
		 * �������������е�����Ԫ�أ�
		 */
		System.out.println("list2"+list2);
		list2.add("five");
		System.out.println("list2"+list2);
	}

}
