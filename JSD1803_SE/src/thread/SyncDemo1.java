package thread;
/**���̲߳�����Σ��������취��
 * ������̲߳�������ͳһ��Դʱ,�����߳��л���ȷ�������ܻᵼ���̲߳�������Դʱδ���ճ���Ԥ����ִ��
 * ˳��ִ�д���(�γɡ������ľ���)�������߼����ֻ��ң�����ʱ���ܵ���ϵͳ̱����
 * @author live
 *����취����һ�������� synchronized���κ���ô�÷�����Ϊͬ���������Ӷ�����˲�����ȫ����
 *��С������ȫ������߳�Ч�ʣ�����SyncDemo2
 */

public class SyncDemo1 {
	public static void main(String[] args) {
		final  Table table =new Table(); //jdk1.8���µİ汾������final����
	
		 Thread t1 = new Thread(){                                               //�����߳�
			public void run(){
				while(true){
				int bean=table.getBeans();
				Thread.yield();                            //�ó�CPU��ģ���߳��л�
				System.out.println(getName()+","+bean);
				}
			}
		};
	
	
	Thread t2 = new Thread(){
		public void run(){
			while(true){
				int bean = table.getBeans();
				Thread.yield();
				System.out.println(getName()+","+bean);
			}
		}
	};
	t1.start();
	t2.start();
	
	

}
}
class Table{
	private int beans = 20;
	                                                             /**��һ�������� synchronized���κ���ô�÷�����Ϊͬ���������Ӷ�����˲�����ȫ����
	                                                              * @return
	                                                              * �ڷ���ʹ����synchronized����ôͬ��������������ǵ�ǰ�����������󣬼��������ڲ�������this
	                                                              */
	public synchronized int getBeans(){                      //��� synchronized ����̲߳���
		if (beans ==0) {
			throw new RuntimeException("û�ж�����");
		}
		 Thread.yield();                              //�ó�CPU��ģ���߳��л�
		return beans--;
	}
}
