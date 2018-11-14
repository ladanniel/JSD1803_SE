package exception;
/**
 * 使用当前类测试异常抛出
 * @author live
 *满足语法，不满足业务的情况，原则问题throws Exception()再次往上抛出
 */

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws IllegalAgeException {
		if (age<0||age>100) {
			/**当不满足业务逻辑要求时，可以主动抛出异常，当一个方法中使用throws声明该异常的抛出
			 * 通知调用者在调用前方法时，要处理异常（RuntimeException）否则编译不通过
			 * 
			 */
			throw new IllegalAgeException("年龄不符合法");
		}
		this.age = age;
		
	}
	

	
	

}
