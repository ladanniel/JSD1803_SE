package string;

import java.util.Random;

/**
 * int length() 
 * ���ص�ǰ�ַ������ȣ��ַ�������
 * @author live
 *   xxx.indexof(m);
 *�鿴�����ַ����ڵ�ǰ�ַ�����λ�ã�����ǰ�ַ��������и����ݣ��򷵻�ֵΪ-1������У��򷵻ص�һ�ַ���Ӧ��λ�õ�[�±�,index]�����飬
 *�ϸ����ִ�Сд
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
		
		
		
		
		
		
//		String str="�Ұ�java";
//		System.out.println("len:"+str.length());
//		
//		String st="thinking in java";
//		int i=st.indexOf("t");
//		//��ָ��λ�ò���
//		i=st.indexOf("t",i);
//		System.out.println("index��"+i);
//		//�������һ�γ��ָ����ַ�����λ��
//		i=st.lastIndexOf("in");
//		System.out.println("index:"+i);
//	
	    
	
	
	
	
	
	
	}

}
