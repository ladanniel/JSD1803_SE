package object;
/**
 * ����point��д��Object����
 * @author danneil
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		
		Point p = new Point(1,2);
		/*Object�����tostring�������ص��Ǹö���ĵ�ַ��Ϣ��ʵ�ʿ��������岻��
		 * ����������Ҫʹ�ã�ͨ������д���������
		 * ע�⣺java�ṩ�����ǵ���������д����
		 * ������ֻ�������Լ��������ͨ��Ҫ��д
		 */
		String str = p.toString();
		System.out.println(str);
		/* system.out.println��Object o��
		 * �÷����Ὣ��������toString�������ص��ַ������������̨
		 * object�ṩ��
		 * equals�ٴ�ʹ��ʱ��������д
		 */
		Point p1 = new Point(1,2);
		System.out.println(p);
		System.out.println(p==p1);
		System.out.println(p.equals(p1));
		
	}
	

}
