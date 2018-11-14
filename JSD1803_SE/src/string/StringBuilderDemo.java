package string;
/**
 * StringBuilder是专门设计用来修改字符串内容的内部维护一个可变的字符数组。
 * 优点：开销小，性能好
 * 
 * 所以凡是有频繁修改字符串内容操作时，都应当使用它来完成
 * @author live
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		/*
		 * 默认创建StringBuilder表示空字符串"";
		 */
		StringBuilder builder = new StringBuilder("好好学习java");
		String str =builder.toString();
		/*
		 * append 方法用于追加给定字符串
		 * 好好学习java+,为了找个好工作
		 * replace,替换指定范围内的字符
		 * 
		 * 好好学习java，就是为了改变世界！
		 * 
		 * delete删除指定范围内的字符串
		 * 
		 * insert 将给定内容插入到指定位置
		 */
		builder.append("，为了找个好工作！");
		str=builder.toString();
		System.out.println(str);
		
		builder.replace(9, 25, "就是改变世界！");
		str=builder.toString();
		System.out.println(str);
		
		builder.delete(0, 8);
		str=builder.toString();
		System.out.println(str);
		
		
		builder.insert(0, "活着");  //insert 将给定内容插入到指定位置
		str=builder.toString();
		System.out.println(str);
		
	}

}
