package regular_expression_demo;
/**
 * String֧��������ʽ��������
 * ����ǰ�ַ�����������������ʽ�Ĳ��ֽ��в�֣�
 * �������б���ֺ�Ĳ���
 * @author danniel 
 */
public class SpliypDemo {
	public static void main(String[] args) {
		String str = "1111111ab123defg456hijk142lmn111111111111111111";
		/**
		 * ��������",""\\s(�ո�)"�ȷ�ʽ���в��
		 * 
		 * �����������ƥ���˲�����ݣ���ô���ֳ��ո��ַ�����
		 * ���������ַ���ĩβ����ƥ����
		 * ������ݣ���ô���в�ֵĿ��ַ�����������
		 */
		/*String [] arr =str.split("[0-9]+");
		System.out.println("len:"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
	    String [] arr=str.split("[0-9]");
		System.out.println("len:"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}

}
