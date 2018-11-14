package Map;
/**
 * ***面试题**** HashMap底层工作原理：
 *一、工作原理
  1：HashMap内部利用数组存储数据；（ArrayList内部依然是数组）；
  2：根据key的HashCode值计算出数组的下标位置，进行添加或者查询数据；
     |-根据HashCode计算出数组的下标位置的算法，称为“散列算法”(散列运算：利用取余运算将HashCode映射为数组下标name.HashCode()%10(或者16))；
  3：数组下标位置会重复，重复时，利用链表（LinkedList）存储重复元素；
     |-这个链表，称为“散列同”（在散列运算过程中有重复的现象，称之为“散列同”）；
  4：添加和查询时候，如果有散列同，则根据equals方法逐一比较，找到位置；
  
  注：1；散列查找功能依然用的是“散列运算”
      2：优点：这种方式的计算，只需要进行一次计算，即可找到对应的位置
      3：如果出现重复，先找到对应的位置，然后对重复的内容（数据）进行equals比较，而找到相应的位置的数据；
 * 散列表查询速度快的原因：
 *  |——由于利用HashCode直接定位找到数组的存储位置，无需依次查找，所以HashMap具有极高的查找性能；
 * @author live
 *二、 影响HashMap的查找性能因素：
 * 如果数据多而数组容量少（小），或者大量数据重复的存储在“散列桶”中，造成在“散列同”中进行大量的顺序查找，性能下降很快，性能差；
 * |—解决办法—提供更多的数组容量，减少“散列同”中重复的数据。
 * |—如果保持数据元素的总数和数组容量的比值少于0.75（75%）时，出现重复位置的情况少于3个。（参考结论）
 * |—HashMap中默认的“加载因子”值就是75%（**），HashMap中添加元素时，HashMap始终会保持元素和数组容量的比值
 * |—小于75%，如果超过75%则进行数组扩容（“重新散列”）；
 * 如果加载因子大于75%（比如到200%），优点是节省内存，缺点：查询性能急剧下降；
 *三、 HashCode方法
 * java是在object中定义的方法，用于支持HashMap中的API的算法；
 * |—作为key的类型必须很好的实现HashCode方法，否则会影响HashMap的性能
 * |—要求：当两个对象equals方法比较结果为true时，他们的hashcode相同，
 * |—当两个对象，equals方法比较结果为false时，他们的hashCode尽可能不同！
 *四、equals 方法
 * |—HashCode添加或查找的时候，先根据HashCode计算数组下标位置，然后再利用equals比较key对象是否相同。
 * |—如果key（唯一性）的HashCode和equals方法不“一致”（不符合如上规则），会造成HashMap工作异常（包括：可能重复添加
 *    或者查找不到数据。）
 * 结论—：建议一定成对重写key的equals方法和HashCode方法。
 * 声明：java中的API String,Integer等都成对重写了equals和HashCode方法；
 * 创建HashMap的性能优化参数
 * |-new HashMap(数组容量，加载因子)
 * |-默认 new HashMap（）等价于 new HashMap（16,0.75f）;
 * -在添加到12个元素以后进行扩容
 * 作用：
 * 如果事先可以预测添加到HashMap中数量，则可以声明足够大的容量，避免反复扩容，浪费时间；
 * 例如：如果有1000条数据需要添加到HashMap，则new HashMap（1500）（1000/1500<75%）
 ********** 尽量将软件中的查找功能用Map进行优化，提高软件的性能！
 */

public class HashCodeDemo {
	public static void main(String[] args) {
		System.out.println("Tom".hashCode());
		System.out.println("jerry".hashCode());
		System.out.println("andy".hashCode());
		System.out.println("mac".hashCode());
		System.out.println("wang".hashCode());
		System.out.println("john".hashCode());
	}

}
