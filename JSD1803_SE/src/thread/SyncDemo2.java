package thread;
/**有效的缩小同步范围可以在保证并发安全的前提下尽可能提高并发效率
 * 
 * 同步块可以更准确的控制需要同步运行的代码片段
 *synchronized(this同步监视器){
 *需要同步运行的代码片段} （this看对象）
 *
 *同步监视器是java中任意一个对象，只要保证多个线程看到的该对象是“同一个”，即可保证同步块中的
 *代码是并发安全的。
 * *(synchronized修饰方法run()时带来的缺点，排队运行效率低下)
 * @author live
 *
 */

public class SyncDemo2 {
	public static void main(String[] args) {
		final  Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
			
		};
		Thread t2 = new Thread (){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}

}
class  Shop{
	public  void buy(){
		Thread  t = new Thread();
		
	   
		try {
			    System.out.println(t.getName()+"正在挑衣服........");
			    
				Thread.sleep(5000);
			                                                                                 //保证synchronized看到的是同一个，此处看到的都是同一个shop(.buy),作用类似一个开关的作用
				synchronized(this){
			    System.out.println(t.getName()+"正在试衣服........");
				Thread.sleep(5000);
				}
				
				System.out.println(t.getName()+"结账离开..........");
	
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
