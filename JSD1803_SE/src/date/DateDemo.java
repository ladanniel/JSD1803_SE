package date;

import java.util.Date;

/**java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ȷ�е�ʱ�䣬�ڲ�ά��һ��longֵ����ֵΪ1970��00��:00:00����ǰDate����ʾ��ʱ��֮���������ĺ���
 * ����Date���ʱ����ʱ�����⣬���Դ󲿷ֲ���ʱ��ķ�����������Ϊ��ʱ�ģ����ٽ���ʹ�ã� 
 * @author live
 */
public class DateDemo {
	public static void main(String[] args) {
		//Ĭ��ʵ������ʾ��ǰϵͳʱ��
		Date date = new Date();
		System.out.println(date);
		//��ȡdate�ڲ�ά����longֵ
		long time = date.getTime();
		time+= 1000*60*60*24;
		//��������һ��longָʾdate��ʾ������
		date.setTime(time);
		
		date.setTime(time );
	}

}
