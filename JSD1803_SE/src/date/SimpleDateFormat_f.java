package date;


import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormat_f {
	public static void main(String[] args) {
		Date date = new Date();
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"
				+ "");
		/**String format(Date date)
		 * 
		 * 将给定的Date按照当前SDF指定的日期格式转换为对应内容的字符串
		 * 
		 */
//		String str = sdf.format(date);
		System.out.println(sdf.format(date));
		
		
		
		
	}
	

}
