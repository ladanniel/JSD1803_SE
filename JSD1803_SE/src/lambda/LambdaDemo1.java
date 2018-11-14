package lambda;
/**JDK8之后推出了一个新的特性：lanmbda表达式；使用lambda可以快速简单的创建仅“含有一个”抽象方法的接口
 * 或抽象类的子类实例（替代匿名内部类创建）
 * lambda语法：
 * 前提条件：只要一个接口只能有一个抽象方法
 * （[参数列表]）—>{方法体}
 * 作用：简化实例创建模式
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
		
		/**lambda是由编译器认可的，最终会改为内部类形式创建并且编译会结合源代码上下文自动分析要创建匿名内部类的类型
		 * 由于要求该接口只能有一个方法，所以方法不存在争议
		 * 
		 */
		
		Runnable r2 = ()->{System.out.println("hello***********");};
		/**
		 * 当重写的方法中只有一句代码时，lambda可以忽略{}
		 */
		Thread t2 =new Thread(r2);
		t2.start();
		Runnable r3 = ()->System.out.println("hello=======");
		Thread t3 =new Thread(r3);
		t3.start();
		
		
	}
	

}
