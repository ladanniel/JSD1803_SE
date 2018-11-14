package regular_expression_demo;

public class ReplaceAllDemo2 {
	/**
	 * 游戏不和谐话语转换为*******
	 */
	public static void main(String[] args) {
		String regex ="(wqnmlgb|cnm|mmp|sb|nc|djb)+";
		
		String message = "mmp!cnm!你这个sb!你怎么这么nc!你个djb!";
		message =message.replaceAll(regex,"****");
		System.out.println(message);
	}
	
	

}
