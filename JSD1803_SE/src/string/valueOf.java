package string;
/**
 * String valueOf(查阅API)
 * String提供了一组重载的静态方法ValueOf;
 * 作用是：将java中其任何他类型转换为字符串类型
 * 常见的是将基本类型转换成字符串；
 * @author live
 *
 */
public class valueOf {
	public static void main(String[] args) {
		int d = 100;
		String str = String.valueOf(d);
		System.out.println("str"+str);
		
		
		str=d+"";
		System.out.println("str:"+str);
		
		
		
		
		
	}
	
}


