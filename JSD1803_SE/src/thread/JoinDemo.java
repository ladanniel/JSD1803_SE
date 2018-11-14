package thread;
/**join方法可以协调线程之间的同步运行；
 * join方法会让运行该方法的线程处于阻塞状态，直到该方法所属线程运行完毕才会解除阻塞；抛异常，应在run中抛出，否则，该线程会被终止
 * 
 * @author live
 *
 */
public class JoinDemo {
	private static boolean isFinsh=false;
	public static void main(String[] args) {
		//final Thread down = new Thread(){ jdk1.8以前的版本，要调用down参数，就必须遵循语法，添加final
		Thread down = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片........");
				for (int i = 0; i <=100; i++) {
					System.out.println("down"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("下载完毕！");
				isFinsh=true;
			}	
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:开始显示图片.........");
			           //先等待下载线程将图片下载完毕再加载                                           	
				try {
					down.join();
					//将show线程阻塞，知道down将任务执行完毕
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				if (!isFinsh) {
					
					throw new RuntimeException("图片加载失败.......");		
				}
				System.out.println("图片显示完毕！");
			}
		};
		
		show.start();
		down.start();
	
	}

}
