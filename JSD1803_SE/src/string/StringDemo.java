package string;
/**
 * String创建后的字符串是不可被改变的，要想改变，得重新创建
 * @author live
 *
 */
public class StringDemo {
  public static void main(String[] args) {
	  String s1 ="121abcdefg";
	  String s2="121abcdefg";
	  String s3="121abcdefg";
	  System.out.println(s1==s2);
	  System.out.println(s2==s3);
 //s2/s3重用s1创建的字符串对象
	  s1=s1+"！";
 //修改后内容会创建新对象
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println(s1==s2);
	  System.out.println(s2==s3);
	  
	  String s4 =new String("121abc");
	  System.out.println(s2==s4);
	  //判断字符串的时候尽量不用==，用equals
	  
	  /*
	   * 编译器有一个优化措施：
	   * 当一个计算表达式计算符号两边都是字面量时，
	   * 编译器会直接将结果计算出来并替代原来的表达式，
	   * 所以JVM在运行.class文件时，
	   * 看到的下面代码被编译器改了为String s5="121abc";
	   * 所以会重用晒那个面s2的对象
	   */
	  
	  String s5= "121"+"abc";
	  System.out.println(s2==s5);
	  //编译器经过编译，jvm加载，编译器在编译时发现s+"abc",b为变量，在编译时已经把结果计算好了
	  String s ="123";
	  String s6=s+"abc";
	  
	  System.out.println(s2==s6);
	 
	
}

}


