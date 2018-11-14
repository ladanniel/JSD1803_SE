package regular_expression_demo;

public class SpliypDemo2 {
	public static void main(String[] args) {
		/**
		 * 
		 * ±ÜÃâÍ¼Æ¬Ãû×ÖÖØ¸´
		 * 18426678888779.png
		 * 
		 */
		String image = "123.png";
		String [] names = image.split("\\.");
		image = System.currentTimeMillis()+"."+names[1];
		System.out.println(image);
	}

}
