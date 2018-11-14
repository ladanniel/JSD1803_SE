package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读一个文件
 * @author live
 *
 */

public class ReadDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","r");
		int d = raf.read();
		System.out.println(d);
		d=raf.read();
		System.out.println(d);
		raf.close();
		
	}

}
