package collection;

import java.util.ArrayList;
import java.util.Collection;

import object.Point;

/**���ϴ�ŵ���Ԫ�ص����ã�
 * java�е�������������ʵ�ʾ��Ǳ�����ֵ����
 * @author live
 *
 */
public class CollectionDemo2 {
            public static void main(String[] args) {
            	Collection c = new ArrayList();
               Point p = new Point(1,2);
               c.add(p);
               System.out.println("c:"+c);
               System.out.println("p:"+p);
               p.setX(2);
               System.out.println("c:"+c);
               System.out.println("p:"+p);
			}

}
