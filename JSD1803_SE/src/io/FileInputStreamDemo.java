package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流，用于读取文件数据
 * @author live
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		
		byte [] data = new byte[200];
		//获取返回值，得到实际读取的字节量
		int len = fis.read(data);
		String str = new String(data,0,len,"GBK");
		System.out.println(str);
		fis.close();
		
	}

}
