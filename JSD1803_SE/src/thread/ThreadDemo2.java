package thread;

/**第二种创建线程的方式：单独定义线程任务，
 * 实现Runnable接口并重写run方法
 * @author live
 *这种模式：任务与线程都是独立运行的，线程复用性更好；
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		
		Runnable r1 = new MyRunnable1();
		Runnable r2 = new MyRunnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();	
	}
		
	}
  class MyRunnable1 implements Runnable{
		public void run(){
			for (int i = 0; i < 1000; i++) {
				System.out.println("太阳下去明早依旧爬上来，花儿谢了明年还是一样的开，美丽小鸟飞去无踪影");
			}
		}
	}
  class MyRunnable2 implements Runnable{
	  public void run(){
		  for (int i = 0; i < 1000; i++) {
			  System.out.println("我的青春小鸟一样不回来，别的那哟哟，别的那哟哟.......................");
		}
		  
	  }
  }













