package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流写数据时的缓冲区问题,缓冲区容量8kb
 * @author live
 *
 */

public class BufferedOutputStreamDemo_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "从前有座山，山里有座庙，庙里老和尚对小和尚说：从前有座山、、、、";
		byte [] lin = str.getBytes("GBK");
		bos.write(lin);
		//强制将缓冲区里的数据一次性全部写出来（加快读写效率）
	//  bos.flush();
		System.out.println("写出完毕");
		bos.close();
	}

}
