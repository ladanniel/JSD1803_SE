package regular_expression_demo;
/**
 * �ַ���֧��������ʽ�ķ���֮һ��
 * boolean matches(String regex)
 * ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ������ʽҪ��
 * �����򷵻�true
 * @author danniel
 *
 */
public class MatchesDemo {

	public static void main(String[] args) {
		String email="1842667603@sina.com";
		/*email������ʽ
		 * \w+@\w+(\.[a-zA-Z]+)+==[a-zA-Z0-9]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 * 
		 */	
		String regex="\\w+@\\w+(\\.[a-zA_Z]+)+";
		boolean match = email.matches(regex);
		if (match) {
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
		
	}

}
