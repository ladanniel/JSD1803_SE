package regular_expression_demo;
/**
 * 字符串支持正则表达式方法三：
 * String replaceAll（String regex Stringstr）
 * 将当前字符串中满足正则表达式的部分替换为给定的字符串
 * @author danniel
 *
 */

public class ReplaceAllDemo {
	public static void main(String[] args) {
		String str = "abvc123defff456dagsfhsj";
		/**
		 * 将数字部分替换为#木木#
		 * "abvc123defff456dagsfhsj"
		 * 替换后
		 * "abvc#number#defff#number#dagsfhsj"
		 * 将字母部分换成#char#
		 */
		str=str.replaceAll("[a-zA-Z]+", "#木木#");
		System.out.println(str);
	}

}
