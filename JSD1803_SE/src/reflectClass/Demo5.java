package reflectClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ������Ե���һ�����˽�г�Ա
 * @author live
 *
 */

public class Demo5 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class cls = Class.forName("reflect.Person");
		Object o = cls.newInstance();
		Method method = cls.getDeclaredMethod("dosome", null);
		System.out.println("�ѻ�ȡ˽�з���dosome");
		//����Ҫ����˽�з�������Ҫ���÷���Ȩ��
		method.setAccessible(true);
		method.invoke(o, null);
		
	}

}
