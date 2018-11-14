package thread;
/**synchronized����ʵ�ֻ���Ч����������                                                         ������ĺ������Է�������������ͬʱ���У����ǻ���Ч����
 * ��ʹ��synchronized��ס"��β�ͬ"�Ĵ��룬������Щͬ����ʹ�õ�ͬ��������������ͬһ��ʱ����ô��Щ����
 * Ƭ��֮����ǻ���ģ�����̲߳���ͬʱִ�����ǡ�
 * 
 * @author live
 *
 */

public class SyncDemo4 {
	
	public static void main(String[] args) {
		final Boo m = new Boo();
		Thread t1 = new Thread(){
			public void  run(){
				m.methodB();
				
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				m.methodA();
			}
		};
		t1.start();
		t2.start();
	}

}
class Boo{
	public  void methodA (){
		synchronized(this){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"�������С�����������");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}
		System.out.println(t.getName()+"����A��������������");
	}
	}
	public  void methodB(){
		synchronized(this){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"�������С�����������");
		 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+"��������B����������������");
		}
	}
}
