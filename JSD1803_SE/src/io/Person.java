package io;

import java.io.Serializable;

/**
 * ʹ�õ�ǰ���ʵ�����Զ�������д����Ĳ���
 *��һ�����ʵ��Ҫ�󱻶��������ж�дʱ��Ҫ��������ʵ��Serrializable�ӿ�
 * @author live
 *
 */
public class Person implements Serializable {
	/**��һ����ʵ����serializable�ӿں�Ӧ������һ��������serialVersionUID
	 * ������������л��汾�ţ����������ڱ���ʱ���յ�ǰ��Ľṹ����һ���汾�ţ�����
	 * ����Ľṹ�����ı䣬�汾�Ż���Ÿı䣬
	 * ���л��汾��ֱ��Ӱ��������������з����л��Ƿ��ܹ��ɹ�
	 * �������л��Ķ���Ե�ǰ��汾��һ�£���ô�����л��ɹ����������л�ʱ���׳��쳣
	 * ����ǰ��ṹ�����˱仯��ֻҪ�汾��û�иı䣬��ô�����л�ʱ�Ὣ��Ȼ�е����Խ��л�ԭ
	 * 
	 */
	private static final long serialVersionUID = 258354357300352267L;
	private String name;
	private int age;
	private String gender;
	private transient String [] otherInfo;
	/*
	 * ��һ������ʹ��transient���κ���ô���������л�ʱ�������Իᱻ����
	 * ���Բ���Ҫ�����Կ��Դﵽ�����Ч��
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
