package date;

import java.util.Calendar;

/**Calendar提供了一个方法：int get(int field)该方法可以获取指定的时间分量所对应的值
 * 
 * 时间分量是一个int值，不同值表示不同的时间分量，无需记忆这些数量具体是多少，Calendar提供了对应的常量；
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

		/**获取日：
		 * 和“天”相关的常量有：
		 * DAY_OF_MONTH：月中的天，几号
		 * DAY_OF_WEEK：周中的天；星期几
		 * DAY_OF_YEAR：年中的天
		 * DATE 和DAY_OF_MONTH意义相同。
		 * 
		 */

		System.out.println(year+"-"+month+"-"+date+"/"+hour+"："+minute+"："+s);
		//根据当前Calendar表示的日期获取指定时间分量所允许的最大值，如：今年总共多少天？
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);


	}

}
