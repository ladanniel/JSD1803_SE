package Integ;
/**
 * ���ڻ������Ͳ���ֱ�Ӳ����������Ŀ���������java�ṩ��8�л�����������Ӧ�İ�װ�࣬
 * �Ӷ����Խ���������ת��Ϊ���������Ϳ��Բ�����������ģʽ���п�����
 * 6���������͵İ�װ����̳�����java.lang.Number��
 * Number��һ�������࣬�����˿�������������֮����л�ת�ķ���
 * @author danniel
 *
 */

public class IntegerDemo1 {
	public static void main(String[] args) {
		int d = 1;
//	    Integer i1 = new Integer(d);
//		Integer i2 = new Integer(d);
		//java�Ƽ�ʹ��valueOf��������������ת��Ϊ��װ��
		Integer i1 = Integer.valueOf(d);
		Integer i2 = Integer.valueOf(d);
	
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		//��װ��ת��Ϊ��������
		int in = i1.intValue();
		double dou = i1.doubleValue();
		System.out.println(in);
		System.out.println(dou);
		
		byte b = i1.byteValue();
		System.out.println(b);
	}
	

}
