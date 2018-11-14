package string;
/**
 * String toUpperCase()
 * String toLowerCase()
 * 将当前字符串的英文部分转换成全部大写或者全部小写
 * @author live
 *
 */

public class toUpperCase {
	public static void main(String[] args) {
		String str= "我 Like Java";
		String upper =str.toUpperCase();
		System.out.println("upper:"+upper);
		
		String lower = str.toLowerCase();
		System.out.println("lower"+lower);
		
	}

}
