package regular_expression_demo;
/**
 * 字符串支持正则表达式的方法之一：
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足格式要求，
 * 满足则返回true
 * @author danniel
 *
 */
public class MatchesDemo {

	public static void main(String[] args) {
		String email="1842667603@sina.com";
		/*email正则表达式
		 * \w+@\w+(\.[a-zA-Z]+)+==[a-zA-Z0-9]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 * 
		 */	
		String regex="\\w+@\\w+(\\.[a-zA_Z]+)+";
		boolean match = email.matches(regex);
		if (match) {
			System.out.println("是邮箱");
		}else {
			System.out.println("不是邮箱");
		}
		
	}

}
