package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormat_parse1 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������������գ�");
		String str = scan.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date st = sdf.parse(str);
		Date now = new Date();
		long time = now.getTime()-st.getTime();
		time=time/1000/60/60/24;    //ss/mm/hh/dd
		System.out.println(time);
		
		//���������
		time = st.getTime()+1000*60*60*24*10000;
		Date date = new Date(time);
		String s = sdf.format(date);
		System.out.println("������10000��ļ�����Ϊ"+s);
		
		
		
	}
}
