package thread;
/**多线程并发（危害及处理办法）
 * 当多个线程并发操作统一资源时,由于线程切换不确定，可能会导致线程操作该资源时未按照程序预定的执行
 * 顺序执行代码(形成“抢”的局面)，导致逻辑出现混乱，严重时可能导致系统瘫痪；
 * @author live
 *解决办法：当一个方法被 synchronized修饰后，那么该方法称为同步方法，从而解决了并发安全问题
 *减小并发安全，提高线程效率？？见SyncDemo2
 */

public class SyncDemo1 {
	public static void main(String[] args) {
		final  Table table =new Table(); //jdk1.8以下的版本必须用final修饰
	
		 Thread t1 = new Thread(){                                               //创建线程
			public void run(){
				while(true){
				int bean=table.getBeans();
				Thread.yield();                            //让出CPU，模拟线程切换
				System.out.println(getName()+","+bean);
				}
			}
		};
	
	
	Thread t2 = new Thread(){
		public void run(){
			while(true){
				int bean = table.getBeans();
				Thread.yield();
				System.out.println(getName()+","+bean);
			}
		}
	};
	t1.start();
	t2.start();
	
	

}
}
class Table{
	private int beans = 20;
	                                                             /**当一个方法被 synchronized修饰后，那么该方法称为同步方法，从而解决了并发安全问题
	                                                              * @return
	                                                              * 在方法使用上synchronized，那么同步监视器对象就是当前方法所属对象，即：方法内部看到的this
	                                                              */
	public synchronized int getBeans(){                      //添加 synchronized 解决线程并发
		if (beans ==0) {
			throw new RuntimeException("没有豆子了");
		}
		 Thread.yield();                              //让出CPU，模拟线程切换
		return beans--;
	}
}
