package thread;
/**
 * ��̬����ʹ��synchronized���κ���ô�÷���һ������ͬ��Ч����������޹أ�
 * @author live
 *
 */

public class SyncDemo3 {
	public static void main(String[] args) {
		
		Thread te = new Thread(){                                       //�����߳�
			public void run(){
				Foo.dosome();                                           //��̬�������ã����������ã������Ҳ���ԣ��ᱨ��
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				Foo.dosome();
			}
		};
		te.start();
		t2.start();
	}

} 
class Foo {
	public synchronized static void dosome(){
		Thread t = Thread.currentThread();                                    //��ȡ�߳�
		System.out.println(t.getName()+"����ִ�С���������");
		
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			
		}System.out.println(t.getName()+"����dosome����������������");
	}
}
