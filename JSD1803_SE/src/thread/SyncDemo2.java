package thread;
/**��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ǰ���¾�������߲���Ч��
 * 
 * ͬ������Ը�׼ȷ�Ŀ�����Ҫͬ�����еĴ���Ƭ��
 *synchronized(thisͬ��������){
 *��Ҫͬ�����еĴ���Ƭ��} ��this������
 *
 *ͬ����������java������һ������ֻҪ��֤����߳̿����ĸö����ǡ�ͬһ���������ɱ�֤ͬ�����е�
 *�����ǲ�����ȫ�ġ�
 * *(synchronized���η���run()ʱ������ȱ�㣬�Ŷ�����Ч�ʵ���)
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
			    System.out.println(t.getName()+"�������·�........");
			    
				Thread.sleep(5000);
			                                                                                 //��֤synchronized��������ͬһ�����˴������Ķ���ͬһ��shop(.buy),��������һ�����ص�����
				synchronized(this){
			    System.out.println(t.getName()+"�������·�........");
				Thread.sleep(5000);
				}
				
				System.out.println(t.getName()+"�����뿪..........");
	
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
