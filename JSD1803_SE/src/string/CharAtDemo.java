package string;
/**
 * char charAt(int index)
 * 获取指定位置对应的字符
 * @author live
 *
 */

public class CharAtDemo {
	public static void main(String[] args) {
		String str = "think in java";
		char st =str.charAt(4);
		System.out.println(st);
		/*
		 * 回文：正数的位置与倒数的位置的字符或数字一样的现象，称为回文
		 *检测一半即可
		 */
		String info= "上海自来水来自海上";
		                                                                     //method3:boolean flag =true
		for (int i = 0; i < info.length()/2; i++) {
			if (info.charAt(i)!=info.charAt(info.length()-1-i)) {
				System.out.println("不是回文");                              //method 2:System.out.println("不");
		                                     	                             //method3:flag=true;
				return;                                                     //method2:break;
				/*当方法的返回值类型是void时，
				 * return是可以单独使用的，作用是结束方法；
				 * 
				 */
			}
			
		}System.out.println("是回文");
		
	}

}
