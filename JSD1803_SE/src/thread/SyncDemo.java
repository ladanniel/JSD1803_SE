package thread;
/**死锁现象：
 * 当多个线程都持有自己的锁，但是都等待对方先释放锁时，就会出现“僵持（双方互不让步）”的现象
 * 使得所有线程进入阻塞状态。
 * 这种“僵持（双方互不让步）”的现象就称为——死锁现象（选择了不合适的锁对象）；
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
			System.out.println(t.getName()+"持有localA的锁");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(t.getName()+":开始执行B方法");
			methodB();
		}
		
		System.out.println(t.getName()+"释放A的锁，执行B方法完毕");
	}
	
	public  void methodB(){
		Thread t = Thread.currentThread();
		synchronized(lockB){
			System.out.println(t.getName()+"持有lockB的锁");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+"开始执行A方法");
			methodA();
		}
		System.out.println(t.getName()+"释放B的锁，执行A方法完毕");
	}
	
	
	
}
