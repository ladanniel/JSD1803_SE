package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**线程池
 * 线程池主要有两个作用“
 * 1：控制线程数量，
 * 每个线程都会占用进程的一部分内存，线程数量过多会导致资源消耗大，由于所有线程都是并发运行，那么过多
 * 的线程也会导致CPU过度切换，导致并发效率变差，
 * 2：重用线程：
 * 频繁的创建销毁线程，会给线程调度带来负担，所以应当重用线程；
 * 
 * @author live
 *
 */
public class ThreadPoolDemo {
	/**
	 * 固定大小线程池
	 */
	public static void main(String[] args) {
		ExecutorService threadPool =  Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			Runnable r = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					try {
						System.out.println(t.getName()+"线程正在执行任务");
						Thread.sleep(5000);
						System.out.println(t.getName()+"任务执行完毕");
						
					} catch (Exception e) {
						
					}
				}
			};
			//将任务指派给线程池：
			threadPool.execute(r);
			
			
		}
		
		threadPool.shutdownNow();//threadPool.shutdown();两者的区别前者是立刻停止，后者是线程执行完任务后停止
		System.out.println("已停止线程池");
		
	}

}
