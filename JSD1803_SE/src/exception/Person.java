package exception;
/**
 * ʹ�õ�ǰ������쳣�׳�
 * @author live
 *�����﷨��������ҵ��������ԭ������throws Exception()�ٴ������׳�
 */

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws IllegalAgeException {
		if (age<0||age>100) {
			/**��������ҵ���߼�Ҫ��ʱ�����������׳��쳣����һ��������ʹ��throws�������쳣���׳�
			 * ֪ͨ�������ڵ���ǰ����ʱ��Ҫ�����쳣��RuntimeException��������벻ͨ��
			 * 
			 */
			throw new IllegalAgeException("���䲻���Ϸ�");
		}
		this.age = age;
		
	}
	

	
	

}
