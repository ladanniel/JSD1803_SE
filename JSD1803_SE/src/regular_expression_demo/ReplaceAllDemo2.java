package regular_expression_demo;

public class ReplaceAllDemo2 {
	/**
	 * ��Ϸ����г����ת��Ϊ*******
	 */
	public static void main(String[] args) {
		String regex ="(wqnmlgb|cnm|mmp|sb|nc|djb)+";
		
		String message = "mmp!cnm!�����sb!����ô��ônc!���djb!";
		message =message.replaceAll(regex,"****");
		System.out.println(message);
	}
	
	

}
