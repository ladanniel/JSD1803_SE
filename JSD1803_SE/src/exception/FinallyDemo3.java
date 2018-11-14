package exception;

import java.io.FileInputStream;

/**
 * JDK1.7�Ժ��Ƴ���һ�������ԣ��Զ��رչ���
 * @author live
 *
 */

public class FinallyDemo3 {
	public static void main(String[] args) {
		/**ʵ����AutoCloseable�ӿڵĿ��Զ���������������Ǳ������Ͽɣ����ձ��������ǻὫ�����Ϊ
		 * ��finally�йرո���
		 */
		try(FileInputStream fis = new FileInputStream("fos.txt");) {
			int d = fis.read();
			System.out.println(d);
			fis.close();
			return;
		} catch (Exception e) {
			e.printStackTrace();

		}
		
	}

}
