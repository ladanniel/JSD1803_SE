package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**使用collections.sort(List)排序时会存在一些不足之处：
 * 1：该方法要求集合元素必须实现Comparable接口，这在实际开发中是不太可取的，因为该功能会对我们写的
 * 代码有入侵性，
 * 所谓入侵性：指：当我们调用某个功能时，该功能要求我们为其修改代码，修改的地方越多，侵入性越高
 * 不利于程序的扩展和后期维护
 *  
 *  2：若元素已经实现了Comparable接口并定义了比较规则，但该规则不满足我们排序需求时，该方法就无法使用。
 *  比如排序字符串，只能按照字符Unicode编码排序，排序中文时则没有什么意义
 * 
 * @author live
 *
 */

public class Collections_sort3 {
	   public static void main(String[] args) {
	      List<String> list = new ArrayList<String>();
	      
	      list.add("marry");
	      list.add("jons");
	      list.add("david");
	      list.add("rose");
	      list.add("jack");
	      list.add("danniel");
	      Collections.sort(list);
	      System.out.println(list);
	      list.add("江");
	      list.add("南");
	      list.add("塞");
	      list.add("上");
	      Collections.sort(list);
	      System.out.println(list);
	      
	    	  
		
	}

}
