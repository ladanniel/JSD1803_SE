package exception;

/**�쳣���÷���
 * @author live
 *
 */
public class ExceptionAPIDemo {
	public static void main(String[] args) {
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//��������ջ��Ϣ�����ڶ�λ����Ϊλ��
			//��ȡ׼ȷ��Ϣ
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("���������");
	}

}
