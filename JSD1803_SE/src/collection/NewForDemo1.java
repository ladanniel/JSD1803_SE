package collection;
/**新循环 自JDK1.5之后推出的一个特性
 * 
 * 新循环是用来遍历集合或数组使用的
 * 新循环又称为：增强for循环，，for each
 * @author live
 *语法结构：
 *for(定义接收变量：需要遍历的对象数组){system.out.println(定义接收遍历后的数组变量)}
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String [] arr = {"one","two","three","four","five","six","seven"}; 
		for (int i = 0; i < arr.length; i++) {  
			String str = arr[i];
			System.out.print(str+" ");
			
		}System.out.println();
		
		/**新循环是编译器认可，而不是JVM认可，
		 * 编译器会将新循环遍历数组改为普通的for循环比遍历；
		 */
		for (String str:arr) {
			System.out.print(str+" ");
		}
	}

}
