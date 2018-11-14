package string;

import java.util.Random;

/**
 * int length() 
 * 返回当前字符串长度（字符个数）
 * @author live
 *   xxx.indexof(m);
 *查看给定字符串在当前字符串中位置，若当前字符串不含有该内容，则返回值为-1，如果有，则返回第一字符对应的位置的[下标,index]的数组，
 *严格区分大小写
 */
public class LengthMethodDemo {
	public static void main(String[] args) {
		
		String str = "woaijava";
		System.out.println("len:"+str.length());
		String st="think in java";
		int i=st.indexOf("i");
		i=st.indexOf("i",i);
		System.out.println("index"+i);
		
		
		i=st.lastIndexOf("in");
		System.out.println("index:"+i);
		
		
		
		
		
		
//		String str="我爱java";
//		System.out.println("len:"+str.length());
//		
//		String st="thinking in java";
//		int i=st.indexOf("t");
//		//从指定位置查找
//		i=st.indexOf("t",i);
//		System.out.println("index："+i);
//		//查找最后一次出现给定字符串的位置
//		i=st.lastIndexOf("in");
//		System.out.println("index:"+i);
//	
	    
	
	
	
	
	
	
	}

}
