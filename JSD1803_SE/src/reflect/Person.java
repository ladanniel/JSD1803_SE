package reflect;
/**
 * ʹ�ø�����Է������
 * @author live
 *
 */


public class Person {
	public void sayHello(){
		System.out.println("��Һã�");
	}
	public void sayHi(String name){
		System.out.println("��Һã��ҽУ�"+name);
	}
	public void sayHello(String name,int age){
		System.out.println("��Һã��ҽУ�"+name+",���꣺"+age+"����");
		
	}
	public void sayHi(){
		System.out.println("Hi");
	}
	private void dosome(){
		System.out.println("����˽�з�����");
	}

}
