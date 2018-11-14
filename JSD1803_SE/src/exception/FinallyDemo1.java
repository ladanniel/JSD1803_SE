package exception;
/**Finally块是异常捕获机制中的最后一块，Finally可以直接跟在try后面或者最后一个catch之后。
 * Finally可以保证只要程序执行到try语句块中，无论try语句块中是否抛出异常，Finally块中的代码都必须执行。
 * 通常会将无论是否出现异常都要运行的代码放在Finally中确保运行，比如IO操作的关闭流
 * 
 * @author live
 *
 */

public class FinallyDemo1 {
	public static void main(String[] args) {
		
	System.out.println("程序开始了！");
	try {
		String str = null;
		System.out.println(str.length());
		return;
	} catch (Exception e) {
		System.out.println("程序出错了");
	}finally {
		System.out.println("finally中的程序运行了！");
		
	}System.out.println("程序结束了！");
	}

}
