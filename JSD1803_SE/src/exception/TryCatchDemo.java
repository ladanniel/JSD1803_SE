package exception;
/**java�쳣��������е�Try-catch�﷨
 * try{
 * }catch(xxxxExcetpion e)
 * ����try����Ƭ���г��ֵ�xxxException��Ĵ���ʽ
 * error:ϵͳ���Ĵ���
 * Exception:���򼶵Ĵ���
 * @author live
 *��ָ���쳣���ֳ�Ϊ�����ˡ�����,�쳣���ڼ̳й�ϵ
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str ="a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			
		} catch (NullPointerException e) {
			
			System.out.println("�����˿�ָ���쳣��");
			/**
			 * catch���Զ���������Բ�ͬ���쳣�в�ͬ�Ĵ����ַ������Էֱ𲶻���Щ�쳣
			 */
			
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("�ַ����±�Խ���ˣ�");
			/**
			 * Ӧ����һ����ϰ�ߣ������һ��catch�в���Exception��
			 * ����������Ϊһ��δ������쳣���³����ж�
			 * ����˳��Ӧ�����������쳣�������Ȳ��񣬸������쳣�����沶��
			 */
		}catch (Exception e) {
			System.out.println("����δ֪�쳣��");
		}
	
		/**��jvmִ�д���ʱ�����쳣����ʵ�������쳣��һ��ʵ����Ȼ�����úô���ִ�е�
		 * ���̣��������쳣�׳�������׳��쳣�Ĵ������ڷ���û�д����쳣���������쳣���׵�
		 * ��ǰ����֮�⣬�ɵ��õ�ǰ�����Ĵ���Ƭ��ȥ����
		 * 
		 * 
		 */
		
		System.out.println("���������");
	}

}
