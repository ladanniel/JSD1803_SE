package exception;
/**
 * 测试异常的抛出
 * @author live
 *
 */

public class ThrowDemo {
	//原则问题向上抛出public static void main(String[] args) throws Exception{ main方法严格要处理，也可以throws看原则问题，也可以throws抛出去
	public static void main(String[] args)  {
		System.out.println("程序开始了");
		Person ps = new Person();
	try{
		/**当调用一个含有throws声明异常抛出的方法时，编译器要求必须处理这个异常，而处理方式
		 * 有两种：
		 * 1：使用try-catch处理该异常；
		 * 2：在当前方法上继续声明throws将该异常抛出；
		 * 具体如何处理，结合实际业务需求而定，而不是所有的异常到这都try-catch
		 * 
		 */
			ps.setAge(100);
	}catch(Exception e){
		
	}
		
		System.out.println("此人年龄为："+ps.getAge());
		System.out.println("程序结束了");
		
	}

}
