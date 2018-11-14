package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**�̳߳�
 * �̳߳���Ҫ���������á�
 * 1�������߳�������
 * ÿ���̶߳���ռ�ý��̵�һ�����ڴ棬�߳���������ᵼ����Դ���Ĵ����������̶߳��ǲ������У���ô����
 * ���߳�Ҳ�ᵼ��CPU�����л������²���Ч�ʱ�
 * 2�������̣߳�
 * Ƶ���Ĵ��������̣߳�����̵߳��ȴ�������������Ӧ�������̣߳�
 * 
 * @author live
 *
 */
public class ThreadPoolDemo {
	/**
	 * �̶���С�̳߳�
	 */
	public static void main(String[] args) {
		ExecutorService threadPool =  Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			Runnable r = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					try {
						System.out.println(t.getName()+"�߳�����ִ������");
						Thread.sleep(5000);
						System.out.println(t.getName()+"����ִ�����");
						
					} catch (Exception e) {
						
					}
				}
			};
			//������ָ�ɸ��̳߳أ�
			threadPool.execute(r);
			
			
		}
		
		threadPool.shutdownNow();//threadPool.shutdown();���ߵ�����ǰ��������ֹͣ���������߳�ִ���������ֹͣ
		System.out.println("��ֹͣ�̳߳�");
		
	}

}
