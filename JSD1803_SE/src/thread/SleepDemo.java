package thread;
/**sleep阻塞
 * 线程提供的方法：
 * static void sleep(long ms)
 * 该方法可以让运行该方法的线程处于阻塞状态指定毫秒超时后，线程会重新回到runnable状态，等待
 * 分配CPU时间片再次运行；
 * 
 * @author live
 *
 */

public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			Thread.sleep(5000);
			                                              /**通常会引起线程阻塞现象的方法
			                                               * 都要求处理中断异常，线程有一个方法：interrupt（）；该方法可以中断一个正在运行的线程
			                                               * 但是若该线程处于某种阻塞时被调用中断方法中断，那么并不是将该线程直接中断，而是中断其阻塞状态，
			                                               * 这是通常会抛出中断异常，通知程序该线程的阻塞状态被打断；
			                                               * 
			                                               */
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("程序结束了");
	}

}
