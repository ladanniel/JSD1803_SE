package exception;

/**异常常用方法
 * @author live
 *
 */
public class ExceptionAPIDemo {
	public static void main(String[] args) {
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//输出错误堆栈信息有助于定位错误为位置
			//获取准确信息
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("程序结束了");
	}

}
