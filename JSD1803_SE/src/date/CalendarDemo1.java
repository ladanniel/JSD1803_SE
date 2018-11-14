package date;

import java.util.Calendar;
import java.util.Date;

/**java.util.Calendar类用于封装日历信息，其主要作用在于其方法可以对时间分量进行运算，Calendar是抽象类，
 * 其具体子类针对不同国家的日历系统，世界上绝大多数国家使用的标准日历系统
 * 由于不同的日期历法对日期计算不同，需要靠不同的子类去实现这些方法
 * 常用的实现类：java.util.GregorianCalendar;即：阳历；
 * Calendar提供了一个静态方法：getInstance（）可以获取一个当前系统所在地区适用的实现类，大部分获取都是阳历实现类；
 * @author live
 *
 */

public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/**
		 * Calendar提供了一个可以转换为date的方法Date getTime();
		 * 将当前Calendar表示的时间以Date形式返回，也提供了一个可以让Calendar表示指定日期的方法
		 * void setTime（Date date）是当前Calendar表示给定的Date所表示的日期
		 */
		
		Date date = calendar.getTime();
		System.out.println(date);
		
		
	}

	
	

}
