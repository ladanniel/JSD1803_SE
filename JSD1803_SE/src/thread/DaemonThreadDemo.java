package thread;
/**�ػ��̣߳��ػ�ǰ̨�̣߳�
 * �ػ��߳��ֳ�Ϊ��̨�̣߳�һ���̴߳�������Ĭ�϶�����ͨ��ǰ̨�̣߳����ػ��߳���Ҫ��ǰ̨�߳�
 * ����ǰ�����������ã�
 * ʹ�����ػ��߳�����ͨ�߳��޲�𣬵����ڽ���ʱ������һ�㲻ͬ�����������̽���ʱ�������������е�
 * �ػ��̶߳��ᱻǿ���жϣ�
 * ���̽�������һ�������жϵ�����ǰ̨�̶߳�����ʱ�����̼�������
 * 
 * @author live
 *
 */

public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
			for (int i = 0; i < 5; i++) {
				System.out.println("rose:let me go!");
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("rose:����������AaAaAaAaAaAa.......");
			System.out.println("��ͨ��");
			}
		};
		Thread jack = new Thread(){                        //��̨�߳�
			public void run(){
				while(true){
					System.out.println("jack:you jump , i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					};
				}
			}
		};
		rose.start();
		jack.setDaemon(true);                                                         //����Ϊ�ػ��̣߳�������start������֮ǰ���ã������������󣬲��ٹܵ�����������Զ�����
		jack.start();
		
	}

}
