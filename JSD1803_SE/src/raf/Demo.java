package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读字符串
 * @author live
 *
 */

public class Demo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		byte[] data = new byte[(int)raf.length()];
		raf.read(data);
		/*String提供了一组重载的构造方法可以将给定的字节数组按照
		 * 指定字符集（GBK，UTF-8等）还原为字符串
		 */
		String str = new String(data,"GBK");
		System.out.println(str);
		raf.close();
	}

}
