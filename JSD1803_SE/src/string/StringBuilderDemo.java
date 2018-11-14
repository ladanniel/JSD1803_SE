package string;
/**
 * StringBuilder��ר����������޸��ַ������ݵ��ڲ�ά��һ���ɱ���ַ����顣
 * �ŵ㣺����С�����ܺ�
 * 
 * ���Է�����Ƶ���޸��ַ������ݲ���ʱ����Ӧ��ʹ���������
 * @author live
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		/*
		 * Ĭ�ϴ���StringBuilder��ʾ���ַ���"";
		 */
		StringBuilder builder = new StringBuilder("�ú�ѧϰjava");
		String str =builder.toString();
		/*
		 * append ��������׷�Ӹ����ַ���
		 * �ú�ѧϰjava+,Ϊ���Ҹ��ù���
		 * replace,�滻ָ����Χ�ڵ��ַ�
		 * 
		 * �ú�ѧϰjava������Ϊ�˸ı����磡
		 * 
		 * deleteɾ��ָ����Χ�ڵ��ַ���
		 * 
		 * insert ���������ݲ��뵽ָ��λ��
		 */
		builder.append("��Ϊ���Ҹ��ù�����");
		str=builder.toString();
		System.out.println(str);
		
		builder.replace(9, 25, "���Ǹı����磡");
		str=builder.toString();
		System.out.println(str);
		
		builder.delete(0, 8);
		str=builder.toString();
		System.out.println(str);
		
		
		builder.insert(0, "����");  //insert ���������ݲ��뵽ָ��λ��
		str=builder.toString();
		System.out.println(str);
		
	}

}
