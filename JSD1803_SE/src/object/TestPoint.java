package object;
/**
 * 测试point重写的Object方法
 * @author danneil
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		
		Point p = new Point(1,2);
		/*Object定义的tostring方法返回的是该对象的地址信息，实际开发中意义不大
		 * 所以若我们要使用，通常会重写这个方法，
		 * 注意：java提供给我们的类妥善重写过该
		 * 方法，只有我们自己定义的类通常要重写
		 */
		String str = p.toString();
		System.out.println(str);
		/* system.out.println（Object o）
		 * 该方法会将给定对象toString方法返回的字符串输出到控制台
		 * object提供的
		 * equals再次使用时，必须重写
		 */
		Point p1 = new Point(1,2);
		System.out.println(p);
		System.out.println(p==p1);
		System.out.println(p.equals(p1));
		
	}
	

}
