package thread;
/**ʹ�������ڲ��ഴ�����̣߳���������̴߳�����ʽ��
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
					System.out.println("�ҵ��ഺС��һ���������������ӴӴ�������ӴӴ.......................");
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
			System.out.println("̫����ȥ��������������������л�����껹��һ���Ŀ�������С���ȥ����Ӱ");
		}
	}
}
