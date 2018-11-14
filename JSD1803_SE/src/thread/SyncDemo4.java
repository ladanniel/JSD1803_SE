package thread;
/**synchronized可以实现互斥效果，互斥锁                                                         （人体的喉咙，吃饭跟吸气，不能同时进行，而是互斥效果）
 * 当使用synchronized锁住"多段不同"的代码，但是这些同步块使用的同步监视器对象是同一个时，那么这些代码
 * 片段之间就是互斥的，多个线程不能同时执行他们。
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
		System.out.println(t.getName()+"正在运行、、、、、、");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}
		System.out.println(t.getName()+"运行A方法、、、、、");
	}
	}
	public  void methodB(){
		synchronized(this){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"正在运行、、、、、、");
		 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+"正在运行B方法、、、、、、");
		}
	}
}
