package thread;

import java.util.concurrent.SynchronousQueue;

/**��ǰ�߳��ṩ��һ����̬����
 * 
 * @author live
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread main  = Thread.currentThread();
		System.out.println("����main�������߳���"+main);
		
		dosome();
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("�Զ����߳�"+t);
				dosome();
			}
		};
		t.start();

}public static void dosome(){
	Thread t = Thread.currentThread();
	System.out.println("����dosome�������߳���"+t);
}
}