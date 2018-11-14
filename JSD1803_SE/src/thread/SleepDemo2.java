package thread;
/**
 * 打断睡眠阻塞
 * @author live
 *
 */

public class SleepDemo2 {
	public static void main(String[] args) {
		Thread lin = new Thread(){
	     public void run(){
	    	 System.out.println("林：刚美容完，睡一会儿");
	    	 try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
		        System.out.println("林：干嘛呢？都破相了");
			}
	    	 System.out.println("醒了");
	     }
		};
		
		
		
		Thread te = new Thread(){
			public void run(){
				System.out.println("黄：开始砸墙了！");
				for (int i = 0; i < 5; i++) {
					System.out.println("黄：80！");
					 
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("哐当！");
				System.out.println("黄，搞定！");
			lin.interrupt();//打断lin线程
			}
		};
		lin.start();
		te.start();
	}

}
