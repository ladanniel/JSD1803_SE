package string;
/**
 * String��������ַ����ǲ��ɱ��ı�ģ�Ҫ��ı䣬�����´���
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
 //s2/s3����s1�������ַ�������
	  s1=s1+"��";
 //�޸ĺ����ݻᴴ���¶���
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println(s1==s2);
	  System.out.println(s2==s3);
	  
	  String s4 =new String("121abc");
	  System.out.println(s2==s4);
	  //�ж��ַ�����ʱ��������==����equals
	  
	  /*
	   * ��������һ���Ż���ʩ��
	   * ��һ��������ʽ����������߶���������ʱ��
	   * ��������ֱ�ӽ����������������ԭ���ı��ʽ��
	   * ����JVM������.class�ļ�ʱ��
	   * ������������뱻����������ΪString s5="121abc";
	   * ���Ի�����ɹ�Ǹ���s2�Ķ���
	   */
	  
	  String s5= "121"+"abc";
	  System.out.println(s2==s5);
	  //�������������룬jvm���أ��������ڱ���ʱ����s+"abc",bΪ�������ڱ���ʱ�Ѿ��ѽ���������
	  String s ="123";
	  String s6=s+"abc";
	  
	  System.out.println(s2==s6);
	 
	
}

}


