package object;
/**
 * ʹ�ø��������дObject��ط�����ԭ��
 * �����ʾֱ������ϵ�е�һ����
 * @author dannies
 *
 */

public class Point {
	private int x;
	private int y;

	
	
	public Point(int x, int y) {
		super();
		this.x =x;
		this.y=y;
		
	}
	public int getX() {
		
		return x;
	}
	public void setX(int x) {
		this.x = x;
	
	
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * ͨ�����Ƕ�������ʹ��toString����ʱ��Ӧ����д���������
	 * ���ص��ַ�����ʽô�о����Ҫ�󣬿ɽ�Ͻ���ʵ�ʿ������������
	 * ����ԭ���Ϸ��ص��ַ���Ӧ��������ǰ�����е�������Ϣ
	 */
	public String toString(){
		
		return "("+x+","+y+")";
		
	}
	/**
	 * equals �����Ŀ���ǱȽ�(����������Ƚ�)�������������Ƿ���ͬ
	 * ����ָ���ǵ�ǰ����this���Ͳ�������obj�������Ƿ���ͬ
	 * �����this�������equals�����ĵ�ǰ����
	 * ��Ӧ�б�Ҫ���ж�if
	 */
	public boolean equals(Object obj){
		if (obj==null) {
			return false;
			
		}
		if (obj==this) {
			return true;
			
		}
		if (obj instanceof Point) {
			return true;
		}
		return false;
	}
	




	public static void main(String[] args) {
		
		
	
		
	}

}
