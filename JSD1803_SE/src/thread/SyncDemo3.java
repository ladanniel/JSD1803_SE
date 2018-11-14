package thread;
/**
 * 静态方法使用synchronized修饰后，那么该方法一定具有同步效果，与对象无关；
 * @author live
 *
 */

public class SyncDemo3 {
	public static void main(String[] args) {
		
		Thread te = new Thread(){                                       //创建线程
			public void run(){
				Foo.dosome();                                           //静态方法调用，用类名调用，对象掉也可以，会报黄
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
		Thread t = Thread.currentThread();                                    //获取线程
		System.out.println(t.getName()+"正在执行、、、、、");
		
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			
		}System.out.println(t.getName()+"运行dosome方法、、、、、、");
	}
}
