package string;
/**
 * Sting substring(int s,inte)
 * 截取当前字符串中指定范围内的子字符串
 * @author danial
 *含同不含尾
 */
public class SubString {
	public static void main(String[] args) {
		String str ="think in java";
		String sub = str.substring(5,8);
		
		System.out.println(sub);
		//从指定位置开始截取到字符串末尾
		sub=str.substring(9);
		System.out.println(sub);
		String name = getHostName("www.baidu.com");
		System.out.println("name:"+name);
		
		name = getHostName("www.souhu.com");
		System.out.println("name:"+name);
	}
	public static String getHostName(String str){
		//截取两个点之间的内容
		 str=str.substring(str.indexOf(".")+1,str.lastIndexOf("."));//瓶子根盖子的问题b=b+c+1
		
		 /*
		 * int start = str.str.indexOf(".")+1
		 * int end =str.lastIndexOf(".")
		 * return str.substring(start,end)
		 */
		
		return str;
		
	}

}
