package collection;
/**��ѭ�� ��JDK1.5֮���Ƴ���һ������
 * 
 * ��ѭ���������������ϻ�����ʹ�õ�
 * ��ѭ���ֳ�Ϊ����ǿforѭ������for each
 * @author live
 *�﷨�ṹ��
 *for(������ձ�������Ҫ�����Ķ�������){system.out.println(������ձ�������������)}
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String [] arr = {"one","two","three","four","five","six","seven"}; 
		for (int i = 0; i < arr.length; i++) {  
			String str = arr[i];
			System.out.print(str+" ");
			
		}System.out.println();
		
		/**��ѭ���Ǳ������Ͽɣ�������JVM�Ͽɣ�
		 * �������Ὣ��ѭ�����������Ϊ��ͨ��forѭ���ȱ�����
		 */
		for (String str:arr) {
			System.out.print(str+" ");
		}
	}

}
