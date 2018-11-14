package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**计算商品促销日
 * 促销日计算规则：该商品过期日前两周的周三
 * 程序启动后，要求用户输入商品的生产日期，格式为yyyy-MM-dd,然后再输入保质期的天数
 * 
 * 然后经过计算，输出该商品促销日期，输出的格式也是:yyyy-MM-dd
 * 
 * @author live
 *
 */
public class test2 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入商品生产日期：");
		String str = scan.nextLine();
		System.out.println("请输入商品保质期：");
		int days = Integer.parseInt(scan.nextLine());
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		 Date date = sdf.parse(str);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, days-14);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		date = calendar.getTime();
		String strs = sdf.format(date);
		System.out.println(str);
		System.out.println(date);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入商品生产日期：");
//		String times = scan.next();
//		System.out.println("保质期天数为");
//		int time = Integer.parseInt(scan.next());
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date date =  sdf.parse(times);
//		Calendar calendar = Calendar.getInstance();
//          calendar.setTime(date);
//          calendar.add(Calendar.DAY_OF_YEAR, time-14);
//          calendar.set(Calendar.DAY_OF_WEEK,calendar.WEDNESDAY);
//          date = calendar.getTime(); 
//          String str = sdf.format(date);
//          System.out.println(str);
//          System.out.println(date);
		
          
	}

}
