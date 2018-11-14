package exception;
/**java异常处理机制中的Try-catch语法
 * try{
 * }catch(xxxxExcetpion e)
 * 捕获try代码片段中出现的xxxException后的处理方式
 * error:系统级的错误
 * Exception:程序级的错误
 * @author live
 *空指针异常，又称为“闪退”现象,异常存在继承关系
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str ="a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			
		} catch (NullPointerException e) {
			
			System.out.println("出现了空指针异常！");
			/**
			 * catch可以定义多个，针对不同的异常有不同的处理手法，可以分别捕获这些异常
			 */
			
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界了！");
			/**
			 * 应当有一个好习惯，在最后一个catch中捕获Exception，
			 * 尽量避免因为一个未捕获的异常导致程序中断
			 * 捕获顺序应当是子类型异常在上面先捕获，父类型异常在下面捕获
			 */
		}catch (Exception e) {
			System.out.println("遇到未知异常！");
		}
	
		/**当jvm执行代码时遇到异常，会实例化该异常的一个实例，然后设置好代码执行的
		 * 过程，并将该异常抛出，如果抛出异常的代码所在方法没有处理异常的能力，异常会抛到
		 * 当前方法之外，由调用当前方法的代码片段去处理。
		 * 
		 * 
		 */
		
		System.out.println("程序结束了");
	}

}
