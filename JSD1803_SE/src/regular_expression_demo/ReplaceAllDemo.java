package regular_expression_demo;
/**
 * �ַ���֧��������ʽ��������
 * String replaceAll��String regex Stringstr��
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�������ַ���
 * @author danniel
 *
 */

public class ReplaceAllDemo {
	public static void main(String[] args) {
		String str = "abvc123defff456dagsfhsj";
		/**
		 * �����ֲ����滻Ϊ#ľľ#
		 * "abvc123defff456dagsfhsj"
		 * �滻��
		 * "abvc#number#defff#number#dagsfhsj"
		 * ����ĸ���ֻ���#char#
		 */
		str=str.replaceAll("[a-zA-Z]+", "#ľľ#");
		System.out.println(str);
	}

}
