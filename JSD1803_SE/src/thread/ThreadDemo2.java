package thread;

/**�ڶ��ִ����̵߳ķ�ʽ�����������߳�����
 * ʵ��Runnable�ӿڲ���дrun����
 * @author live
 *����ģʽ���������̶߳��Ƕ������еģ��̸߳����Ը��ã�
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		
		Runnable r1 = new MyRunnable1();
		Runnable r2 = new MyRunnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();	
	}
		
	}
  class MyRunnable1 implements Runnable{
		public void run(){
			for (int i = 0; i < 1000; i++) {
				System.out.println("̫����ȥ��������������������л�����껹��һ���Ŀ�������С���ȥ����Ӱ");
			}
		}
	}
  class MyRunnable2 implements Runnable{
	  public void run(){
		  for (int i = 0; i < 1000; i++) {
			  System.out.println("�ҵ��ഺС��һ���������������ӴӴ�������ӴӴ.......................");
		}
		  
	  }
  }













