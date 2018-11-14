package io;

import java.io.Serializable;

/**
 * 使用当前类的实例测试对象流读写对象的操作
 *当一个类的实例要求被对象流进行读写时，要求该类必须实现Serrializable接口
 * @author live
 *
 */
public class Person implements Serializable {
	/**当一个类实现了serializable接口后，应当定义一个常量：serialVersionUID
	 * 这个常量是序列化版本号，编译器会在编译时按照当前类的结构生成一个版本号，但是
	 * 若类的结构发生改变，版本号会跟着改变，
	 * 序列化版本号直接影响对象输入流进行反序列化是否能够成功
	 * 当反序列化的对象对当前类版本号一致，那么反序列化成功，否则反序列化时会抛出异常
	 * 若当前类结构发生了变化，只要版本号没有改变，那么反序列化时会将任然有的属性进行还原
	 * 
	 */
	private static final long serialVersionUID = 258354357300352267L;
	private String name;
	private int age;
	private String gender;
	private transient String [] otherInfo;
	/*
	 * 当一个属性使用transient修饰后，那么在新兴序列化时，该属性会被忽略
	 * 忽略不必要的属性可以达到瘦身的效果
	 */

	public Person(String name, int age, String gender, String[] otherInfo) {//alt+shift+s
		super();
		this.name = name;
		this.age = age;
		this.gender = null;
		this.otherInfo = otherInfo;
	}
	public String toString(){
		return name+","+age+","+gender+","+otherInfo;
		
	}

}
