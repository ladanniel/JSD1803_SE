package exception;
/**Finally�����쳣��������е����һ�飬Finally����ֱ�Ӹ���try����������һ��catch֮��
 * Finally���Ա�ֻ֤Ҫ����ִ�е�try�����У�����try�������Ƿ��׳��쳣��Finally���еĴ��붼����ִ�С�
 * ͨ���Ὣ�����Ƿ�����쳣��Ҫ���еĴ������Finally��ȷ�����У�����IO�����Ĺر���
 * 
 * @author live
 *
 */

public class FinallyDemo1 {
	public static void main(String[] args) {
		
	System.out.println("����ʼ�ˣ�");
	try {
		String str = null;
		System.out.println(str.length());
		return;
	} catch (Exception e) {
		System.out.println("���������");
	}finally {
		System.out.println("finally�еĳ��������ˣ�");
		
	}System.out.println("��������ˣ�");
	}

}
