package collection;

import java.util.ArrayList;
import java.util.Collection;

/**java.util.Collection
 * Collection �����м��ϵġ��������ӿڣ��涨�����м��϶�Ӧ���߱��ķ���
 * �������������õ������ӿڣ�
 * 1��java.util.List:���ظ����ϣ��������򣨲�Ҫ����ڼ������Ԫ�أ��ظ����������ϣ�
 * 2��java.util.Set�������ظ����ϣ�����������ڼ������Ԫ�أ��ظ��������ϣ�
 * �ظ�ָ����Ԫ���Ƿ�����ظ������ظ��ı�׼��Ԫ������equals�Ƚ�
 * �Ľ���Ƿ�Ϊtrue��
 * @author live
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/**
		 * boolean add(E e);E-Ŀǰ�ȵ���Object����
		 * ��ǰ���������һ��Ԫ�أ��ɹ�����򷵻�true
		 * xxxx.size;���ص�ǰ���ϵ�Ԫ�ظ�����xxxxx.length,ֻ��ע���鳤�ȣ�����ע�����Ԫ�ظ���,����ֻ�����鳤�ȣ������᷵������Ԫ�ظ���
		 * xxxx.isEmpty:�жϵ�ǰ�����Ƿ�Ϊ�ռ�����Ϊ�գ�����ֵΪtrue��boolean�ͣ�
		 * c==null��.isEmpty,�����ں���ͬ������ձ�����ûˮ��ǰ�߱�ʾû�б� �ӣ����߱�ʾ������ûˮ
		 * xxx.clear����ռ���  
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("for");
		c.add("five");
		c.addAll(c);
		System.out.println(c);
		//������Ԫ�صĸ���
		int size = c.size();
		System.out.println("size"+size);
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		//��ռ���
		c.clear();
		System.out.println(c);
		System.out.println("size"+c.size());
		System.out.println("isEmpty"+isEmpty);
	}

}
