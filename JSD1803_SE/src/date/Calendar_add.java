package date;

import java.util.Calendar;

/**Calendar�ṩ�˼���ʱ��ķ�����
 * void add ��int field��int amount���Ը�����ʱ���������ָ����ֵ����������ֵΪ���������Ǽ�ȥ��
 * 
 * @author live
 *
 */

public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/**
		 * �鿴3��2������25���Ժ�������
		 */
		//��3��
		calendar.add(Calendar.YEAR , 3);
		//��2����
		calendar.add(Calendar.MONTH, 2);
		//��25��
		calendar.add(Calendar.DAY_OF_YEAR, 25);
//		calendar.add(Calendar.DAY_OF_YEAR, -25);                                  25����ǰ������
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(calendar.getTime());
		
	}

}
