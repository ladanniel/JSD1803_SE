package string;
/**
 * char charAt(int index)
 * ��ȡָ��λ�ö�Ӧ���ַ�
 * @author live
 *
 */

public class CharAtDemo {
	public static void main(String[] args) {
		String str = "think in java";
		char st =str.charAt(4);
		System.out.println(st);
		/*
		 * ���ģ�������λ���뵹����λ�õ��ַ�������һ�������󣬳�Ϊ����
		 *���һ�뼴��
		 */
		String info= "�Ϻ�����ˮ���Ժ���";
		                                                                     //method3:boolean flag =true
		for (int i = 0; i < info.length()/2; i++) {
			if (info.charAt(i)!=info.charAt(info.length()-1-i)) {
				System.out.println("���ǻ���");                              //method 2:System.out.println("��");
		                                     	                             //method3:flag=true;
				return;                                                     //method2:break;
				/*�������ķ���ֵ������voidʱ��
				 * return�ǿ��Ե���ʹ�õģ������ǽ���������
				 * 
				 */
			}
			
		}System.out.println("�ǻ���");
		
	}

}
