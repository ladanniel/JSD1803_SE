package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**������Ʒ������
 * �����ռ�����򣺸���Ʒ������ǰ���ܵ�����
 * ����������Ҫ���û�������Ʒ���������ڣ���ʽΪyyyy-MM-dd,Ȼ�������뱣���ڵ�����
 * 
 * Ȼ�󾭹����㣬�������Ʒ�������ڣ�����ĸ�ʽҲ��:yyyy-MM-dd
 * 
 * @author live
 *
 */
public class test2 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ʒ�������ڣ�");
		String str = scan.nextLine();
		System.out.println("��������Ʒ�����ڣ�");
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
//		System.out.println("��������Ʒ�������ڣ�");
//		String times = scan.next();
//		System.out.println("����������Ϊ");
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
