package thread;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**�߳����ȼ�
 * �߳�֮�����ܵ��Բ������У��ǿ��̵߳��ȵĹ������̵߳��Ȼ����CPUʱ��Ƭ�θ�ĳ���̣߳�ʹ��
 * ��������У��̲߳���������ȡCPUʱ��
 * �����̵߳����ȼ��������̶ȵĸ���ĳ���̻߳�ȡCPUʱ��Ƭ�Ĵ������������߳����ȼ�Խ�ߵ��߳�
 * ��ȡCPUʱ��Ƭ�Ĵ���Խ��
 * �̵߳����ȼ�������1-0��ʾ��1��������ȼ���10Ϊ������ȼ���5ΪĬ��ֵ
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
