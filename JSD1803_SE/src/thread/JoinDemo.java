package thread;
/**join��������Э���߳�֮���ͬ�����У�
 * join�����������и÷������̴߳�������״̬��ֱ���÷��������߳�������ϲŻ������������쳣��Ӧ��run���׳������򣬸��̻߳ᱻ��ֹ
 * 
 * @author live
 *
 */
public class JoinDemo {
	private static boolean isFinsh=false;
	public static void main(String[] args) {
		//final Thread down = new Thread(){ jdk1.8��ǰ�İ汾��Ҫ����down�������ͱ�����ѭ�﷨�����final
		Thread down = new Thread(){
			public void run(){
				System.out.println("down:��ʼ����ͼƬ........");
				for (int i = 0; i <=100; i++) {
					System.out.println("down"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("������ϣ�");
				isFinsh=true;
			}	
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ.........");
			           //�ȵȴ������߳̽�ͼƬ��������ټ���                                           	
				try {
					down.join();
					//��show�߳�������֪��down������ִ�����
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				if (!isFinsh) {
					
					throw new RuntimeException("ͼƬ����ʧ��.......");		
				}
				System.out.println("ͼƬ��ʾ��ϣ�");
			}
		};
		
		show.start();
		down.start();
	
	}

}
