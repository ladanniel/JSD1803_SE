package thread;
/**
 * ���˯������
 * @author live
 *
 */

public class SleepDemo2 {
	public static void main(String[] args) {
		Thread lin = new Thread(){
	     public void run(){
	    	 System.out.println("�֣��������꣬˯һ���");
	    	 try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
		        System.out.println("�֣������أ���������");
			}
	    	 System.out.println("����");
	     }
		};
		
		
		
		Thread te = new Thread(){
			public void run(){
				System.out.println("�ƣ���ʼ��ǽ�ˣ�");
				for (int i = 0; i < 5; i++) {
					System.out.println("�ƣ�80��");
					 
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("�ѵ���");
				System.out.println("�ƣ��㶨��");
			lin.interrupt();//���lin�߳�
			}
		};
		lin.start();
		te.start();
	}

}
