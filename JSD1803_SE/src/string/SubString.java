package string;
/**
 * Sting substring(int s,inte)
 * ��ȡ��ǰ�ַ�����ָ����Χ�ڵ����ַ���
 * @author danial
 *��ͬ����β
 */
public class SubString {
	public static void main(String[] args) {
		String str ="think in java";
		String sub = str.substring(5,8);
		
		System.out.println(sub);
		//��ָ��λ�ÿ�ʼ��ȡ���ַ���ĩβ
		sub=str.substring(9);
		System.out.println(sub);
		String name = getHostName("www.baidu.com");
		System.out.println("name:"+name);
		
		name = getHostName("www.souhu.com");
		System.out.println("name:"+name);
	}
	public static String getHostName(String str){
		//��ȡ������֮�������
		 str=str.substring(str.indexOf(".")+1,str.lastIndexOf("."));//ƿ�Ӹ����ӵ�����b=b+c+1
		
		 /*
		 * int start = str.str.indexOf(".")+1
		 * int end =str.lastIndexOf(".")
		 * return str.substring(start,end)
		 */
		
		return str;
		
	}

}
