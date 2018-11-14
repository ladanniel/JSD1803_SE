package date;

import java.util.Calendar;

/**Calendar提供了计算时间的方法：
 * void add （int field，int amount）对给定的时间分量加上指定的值，若给定的值为负数，则是减去。
 * 
 * @author live
 *
 */

public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/**
		 * 查看3年2个月零25天以后是哪天
		 */
		//加3年
		calendar.add(Calendar.YEAR , 3);
		//加2个月
		calendar.add(Calendar.MONTH, 2);
		//加25天
		calendar.add(Calendar.DAY_OF_YEAR, 25);
//		calendar.add(Calendar.DAY_OF_YEAR, -25);                                  25号以前的天数
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(calendar.getTime());
		
	}

}
