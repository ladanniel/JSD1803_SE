package lambda;
/**JDK8֮���Ƴ���һ���µ����ԣ�lanmbda���ʽ��ʹ��lambda���Կ��ټ򵥵Ĵ�����������һ�������󷽷��Ľӿ�
 * ������������ʵ������������ڲ��ഴ����
 * lambda�﷨��
 * ǰ��������ֻҪһ���ӿ�ֻ����һ�����󷽷�
 * ��[�����б�]����>{������}
 * ���ã���ʵ������ģʽ
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		
		
		Runnable r = new Runnable(){
			public void run(){
				System.out.println("hello");
			}
		};
		Thread t =new Thread(r);
		t.start();
		Runnable y = new Runnable(){
			public void run(){
				System.out.println("hello++++++");
			}
		};
		Thread t1 =new Thread(y);
		t1.start();
		
		/**lambda���ɱ������Ͽɵģ����ջ��Ϊ�ڲ�����ʽ�������ұ������Դ�����������Զ�����Ҫ���������ڲ��������
		 * ����Ҫ��ýӿ�ֻ����һ�����������Է�������������
		 * 
		 */
		
		Runnable r2 = ()->{System.out.println("hello***********");};
		/**
		 * ����д�ķ�����ֻ��һ�����ʱ��lambda���Ժ���{}
		 */
		Thread t2 =new Thread(r2);
		t2.start();
		Runnable r3 = ()->System.out.println("hello=======");
		Thread t3 =new Thread(r3);
		t3.start();
		
		
	}
	

}
