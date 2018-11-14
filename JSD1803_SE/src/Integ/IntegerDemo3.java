package Integ;
/**
 * 包装类支持一个静态方法：parsexxx(String str)
 * 可以将给定的字符串解析为对应的基本类型，
 * 但是前提是该字符串内容必须正确表示基本类型可以保存的值
 * @author live
 *
 */

public class IntegerDemo3 {
	public static void main(String[] args) {
		String str  = "123";
		int d = Integer.parseInt(str);
		System.out.println(d+1);
		 double dou = Double.parseDouble(str);
		 System.out.println(dou);
		
	}

}
