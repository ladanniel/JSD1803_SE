package flie;

import java.io.File;

/***
 * ɾ��Ŀ¼��
 * ����delete����ɾ��Ŀ¼ʱҪ�������һ����Ŀ¼��
 * ��ô��ʵ������У�������Ҫ�Ƚ�һ��Ҫɾ����Ŀ¼��ղſ��Խ���ɾ��
 * ɾ��������File����ʾ���ļ���Ŀ¼
 * �ݹ���ã�����
 * �����ڲ������Լ����������󣬳�Ϊ�ݹ���ã��ܲ��þͲ��ã�
 * �ڴ濪���ܴ󣬶��ڷ���˶��ԣ�
 * ʹ������
 * 1���ݹ����������һ����֧�п���
 * 2:�㼶������
 * @author live
 *�ݹ���ϰ��
 *1�����д���룬���1+2+3+4+��������+100����������
 *�ڴ����в��ó���for,while,�ؼ��֣�
 *2��һ��������ˮ��1��Ǯ1ƿ��ˮ��3��ƿ�ǿ��Ի�1ƿ��ˮ��2����ƿ���Ի�1ƿ��ˮ����дһ�γ��򣬼���20��Ǯ�ܹ������򵽶���ƿ��ˮ
 *
 */
public class DeleteDirsDemo {
	public static void main(String[] args) {
		File dir = new File("./a");
		delete(dir);
	}
	public static void delete(File file){
		if (file.isDirectory()) {
			//�Ƚ���Ŀ¼��գ�1����ȡ��Ŀ¼���������2������������һ��һ��ɾ��
			File[]subs=file.listFiles();
			for (int i = 0; i < subs.length; i++) {
				File sub=subs[i];
				delete(sub);
			}
			
		}file.delete();
	}

}
