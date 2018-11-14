package string;
/**
 * boolean startWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否以给定的字符开始或结束
 * @author live
 *
 */
public class StartWithEndsWith {
	public static void main(String[] args) {
		String str="think in java";
		boolean start=str.startsWith("thi");
		System.out.println("start:"+start);
		
		boolean ends = str.endsWith("ava");
		System.out.println("ends:"+ends);
	}

}
