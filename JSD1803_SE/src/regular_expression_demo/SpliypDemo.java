package regular_expression_demo;
/**
 * String支持正则表达式方法二：
 * 将当前字符串按照满足正则表达式的部分进行拆分，
 * 返回所有被拆分后的部分
 * @author danniel 
 */
public class SpliypDemo {
	public static void main(String[] args) {
		String str = "1111111ab123defg456hijk142lmn111111111111111111";
		/**
		 * 按照数字",""\\s(空格)"等方式进行拆解
		 * 
		 * 若拆分是连续匹配了拆分内容，那么会拆分出空格字符串，
		 * 但是若在字符串末尾连续匹配了
		 * 拆分内容，那么所有拆分的空字符串都被忽略
		 */
		/*String [] arr =str.split("[0-9]+");
		System.out.println("len:"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
	    String [] arr=str.split("[0-9]");
		System.out.println("len:"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}

}
