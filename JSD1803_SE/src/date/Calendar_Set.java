package date;

import java.util.Calendar;

/**Calendar�ṩ��һ��set���������Զ�ָ����ʱ��������ö�Ӧ��ֵ
 * void set��int field��int value��
 * 
 * @author live
 *
 */

public class Calendar_Set {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		/**
		 * ����CalendarΪ2008-8-8 08:08:08
		 */
		calendar.set(Calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		calendar.set(Calendar.HOUR_OF_DAY, 8);
		calendar.set(Calendar.SECOND, 8);
		calendar.set(Calendar.MINUTE, 8);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		
		System.out.println(calendar.getTime());
		
		
	}

}
