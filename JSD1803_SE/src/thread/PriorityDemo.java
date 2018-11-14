package thread;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**线程优先级
 * 线程之所以能得以并发运行，是靠线程调度的工作，线程调度会分配CPU时间片段给某个线程，使得
 * 其可以运行，线程不能主动获取CPU时间
 * 调整线程的优先级可以最大程度的改善某个线程获取CPU时间片的次数，理论上线程优先级越高的线程
 * 获取CPU时间片的次数越多
 * 线程的优先级由数字1-0表示，1是最低优先级，10为最高优先级，5为默认值
 * @author live
 *
 */
public class PriorityDemo {
	
	public static void main(String[] args) {

		Thread te = new Thread(){
			public void run(){
			for(int i=0;i<10000;i++){
				System.out.println("te");
				
			}
			}
		};
		Thread max = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("max");
				}
			
			}
		};
		
		Thread min = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("min");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		min.start();
		te.start();
		max.start();
		
		
	}
	
	

}
