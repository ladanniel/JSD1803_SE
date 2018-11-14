package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**java将流按照读写单位划分，分为字节流和字符流
 * 字符流：读写单位是以字符为单位，所以字符流读写数据有一定的局限性，只用于
 * 读写文本数据。
 * 非文本数据流不能使用字符流读取（如：图片。基本数据类型，MP3等数据）
 * java.io.Reader,java.io.Writer;
 * Reader是所有字符输入流的父类；
 * Writer是所有字符输出流的父类；
 * 
 * 转换流：
 * java.io.InputStreamReader;
 * java.io.OutputStreamWriter;
 * 他们是一对高级流，同时也是常用的字符流实现类；
 * 在读写文本数据时，使用高级流进行流链接中是非常重要的一环，
 * 起到承上启下的作用，因为几乎所有的字符流都只能连接在其他字符流上，而基本上低级流
 * 都是字节流，由于转换流可以连接字节流，而本身其自身又是字符流，所以起到将字符流与字节流
 * “对接”的作用。
 * 
 *字符流：只能读写文本数据，不通用
 * @author live
 *
 */

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
		osw.write("摩擦摩擦，似魔鬼的步伐。");
		osw.write("在光滑的马路牙子上打出溜儿滑");
		System.out.println("读写完毕");
		osw.close();
		
		
		
	}

}
