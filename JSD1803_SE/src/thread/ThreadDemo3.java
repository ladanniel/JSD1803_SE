package thread;
/**使用匿名内部类创建多线程，完成两种线程创建方式：
 * 
 * @author live
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		
		Runnable x1 = new MyRunnable1();
		
	
		Runnable x2 = new MyRunnable2(){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					System.out.println("我的青春小鸟一样不回来，别的那哟哟，别的那哟哟.......................");
				}
			}
			
		};
		Thread t1 = new Thread(x1);
		Thread t2 = new Thread(x2);
		t1.start();
		t2.start();
		
	}
	
	

}
class MyRunnabel31 implements Runnable{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("太阳下去明早依旧爬上来，花儿谢了明年还是一样的开，美丽小鸟飞去无踪影");
		}
	}
}
