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
		 * ��������Date���յ�ǰSDFָ�������ڸ�ʽת��Ϊ��Ӧ���ݵ��ַ���
		 * 
		 */
//		String str = sdf.format(date);
		System.out.println(sdf.format(date));
		
		
		
		
	}
	

}
