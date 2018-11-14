package thread;
/**��������
 * ������̶߳������Լ����������Ƕ��ȴ��Է����ͷ���ʱ���ͻ���֡����֣�˫�������ò�����������
 * ʹ�������߳̽�������״̬��
 * ���֡����֣�˫�������ò�����������ͳ�Ϊ������������ѡ���˲����ʵ������󣩣�
 * @author live
 */
public class SyncDemo {
	public static void main(String[] args) {
		Coo coo = new Coo();
		Thread t1= new Thread(){
			public void run(){
			coo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				coo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}
class  Coo{
	private Object lockA = new Object();
	private Object lockB = new Object();
	public void methodA(){
		Thread t = Thread.currentThread();
		synchronized(lockA){
			System.out.println(t.getName()+"����localA����");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(t.getName()+":��ʼִ��B����");
			methodB();
		}
		
		System.out.println(t.getName()+"�ͷ�A������ִ��B�������");
	}
	
	public  void methodB(){
		Thread t = Thread.currentThread();
		synchronized(lockB){
			System.out.println(t.getName()+"����lockB����");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+"��ʼִ��A����");
			methodA();
		}
		System.out.println(t.getName()+"�ͷ�B������ִ��A�������");
	}
	
	
	
}
