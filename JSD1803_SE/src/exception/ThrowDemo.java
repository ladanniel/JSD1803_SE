package exception;
/**
 * �����쳣���׳�
 * @author live
 *
 */

public class ThrowDemo {
	//ԭ�����������׳�public static void main(String[] args) throws Exception{ main�����ϸ�Ҫ����Ҳ����throws��ԭ�����⣬Ҳ����throws�׳�ȥ
	public static void main(String[] args)  {
		System.out.println("����ʼ��");
		Person ps = new Person();
	try{
		/**������һ������throws�����쳣�׳��ķ���ʱ��������Ҫ����봦������쳣��������ʽ
		 * �����֣�
		 * 1��ʹ��try-catch������쳣��
		 * 2���ڵ�ǰ�����ϼ�������throws�����쳣�׳���
		 * ������δ������ʵ��ҵ��������������������е��쳣���ⶼtry-catch
		 * 
		 */
			ps.setAge(100);
	}catch(Exception e){
		
	}
		
		System.out.println("��������Ϊ��"+ps.getAge());
		System.out.println("���������");
		
	}

}
