package date;

import java.util.Calendar;

/**Calendar�ṩ��һ��������int get(int field)�÷������Ի�ȡָ����ʱ���������Ӧ��ֵ
 * 
 * ʱ�������һ��intֵ����ֵͬ��ʾ��ͬ��ʱ����������������Щ���������Ƕ��٣�Calendar�ṩ�˶�Ӧ�ĳ�����
 * 
 * 
 * @author live
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);

		/**��ȡ�գ�
		 * �͡��족��صĳ����У�
		 * DAY_OF_MONTH�����е��죬����
		 * DAY_OF_WEEK�����е��죻���ڼ�
		 * DAY_OF_YEAR�����е���
		 * DATE ��DAY_OF_MONTH������ͬ��
		 * 
		 */

		System.out.println(year+"-"+month+"-"+date+"/"+hour+"��"+minute+"��"+s);
		//���ݵ�ǰCalendar��ʾ�����ڻ�ȡָ��ʱ���������������ֵ���磺�����ܹ������죿
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);


	}

}
