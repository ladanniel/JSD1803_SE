package thread;
/**sleep����
 * �߳��ṩ�ķ�����
 * static void sleep(long ms)
 * �÷������������и÷������̴߳�������״ָ̬�����볬ʱ���̻߳����»ص�runnable״̬���ȴ�
 * ����CPUʱ��Ƭ�ٴ����У�
 * 
 * @author live
 *
 */

public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			Thread.sleep(5000);
			                                              /**ͨ���������߳���������ķ���
			                                               * ��Ҫ�����ж��쳣���߳���һ��������interrupt�������÷��������ж�һ���������е��߳�
			                                               * ���������̴߳���ĳ������ʱ�������жϷ����жϣ���ô�����ǽ����߳�ֱ���жϣ������ж�������״̬��
			                                               * ����ͨ�����׳��ж��쳣��֪ͨ������̵߳�����״̬����ϣ�
			                                               * 
			                                               */
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("���������");
	}

}
