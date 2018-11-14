package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**���÷�����Ƶ���ĳ�����ʵ������
 * 
 * @author live
 *
 */
public class Demo3 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//ʵ����
		Person p = new Person();
		//���øö���ķ���
		p.sayHi("zhangsan");
		
		Class cls = Class.forName("reflect.Person");
		Object o = cls.newInstance();
		//��ȡPerson���sayHello
		/**��ȡPerson���sayHello��������
		 * Class�ṩ�˻�ȡ���ʾ���������Ϣ��һ�鷽��
		 * ���У�
		 * Method getDeclareMethod(String name,Class[]args)
		 * �Ǳ�ʾ��ȡ��ǰClass����ʾ���ඨ���ָ�����ּ������б�ķ���
		 * Method�Ƿ���API��һ����Ҫ����
		 * ��ÿһ��ʵ�����ڱ�ʾĳ�����һ������ķ�����ͨ��Method���Ի�ȡ����ʾ�ķ����������Ϣ
		 * �緽����������ֵ���ͣ��������ͣ��������η��ȣ�����Ҳ����ͨ��Method��̬�������ʾ�ķ���
		 * 
		 */
		Method method = cls.getDeclaredMethod("sayHello", null);
		/**Method��invoke�������������õ�ǰMethod����ʾ�ķ�����
		 * ����1�����ڳ�Ա������������name����Method����ʾ�ķ�����Ҫ����÷�����������
		 * ����2��ʵ�ʲ��������÷����޲Σ�����null���ɣ�
		 * ����
		 * ��method��ʾ����Person��ķ���sayHellon����ô
		 * method,invoke��o,null����ͬ��o.sayHello();
		 * 
		 */
		method.invoke(o, null);
		
		
		
	}

}
