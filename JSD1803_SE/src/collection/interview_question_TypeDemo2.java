package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型常见面试题：
 * @author live
 *
 */
public class interview_question_TypeDemo2 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		//编译器检测add的参数是否为Integer
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
	//	c1.add("one");  编译不通过，实参与c1的泛型不匹配
	//获取集合元素时，编译器会补全代码将元素造型为Integer
		for (int i:c1) {
			System.out.println(i);
		}
		System.out.println("c1:"+c1);
		
		
		Collection c2 = c1;                                            //声明一个集合c2并指向c1的集合new ArrayList
	    c2.add("four");
	    System.out.println("c2:"+c2);
	    System.out.println("c1:"+c1);
	    //遍历c1时会出现造型异常考察点在ci 
	    for (double i:c1) {
			System.out.println(i);
		}
	}
	

}
