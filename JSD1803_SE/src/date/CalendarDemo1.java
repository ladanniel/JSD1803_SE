package date;

import java.util.Calendar;
import java.util.Date;

/**java.util.Calendar�����ڷ�װ������Ϣ������Ҫ���������䷽�����Զ�ʱ������������㣬Calendar�ǳ����࣬
 * �����������Բ�ͬ���ҵ�����ϵͳ�������Ͼ����������ʹ�õı�׼����ϵͳ
 * ���ڲ�ͬ���������������ڼ��㲻ͬ����Ҫ����ͬ������ȥʵ����Щ����
 * ���õ�ʵ���ࣺjava.util.GregorianCalendar;����������
 * Calendar�ṩ��һ����̬������getInstance�������Ի�ȡһ����ǰϵͳ���ڵ������õ�ʵ���࣬�󲿷ֻ�ȡ��������ʵ���ࣻ
 * @author live
 *
 */

public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/**
		 * Calendar�ṩ��һ������ת��Ϊdate�ķ���Date getTime();
		 * ����ǰCalendar��ʾ��ʱ����Date��ʽ���أ�Ҳ�ṩ��һ��������Calendar��ʾָ�����ڵķ���
		 * void setTime��Date date���ǵ�ǰCalendar��ʾ������Date����ʾ������
		 */
		
		Date date = calendar.getTime();
		System.out.println(date);
		
		
	}

	
	

}
