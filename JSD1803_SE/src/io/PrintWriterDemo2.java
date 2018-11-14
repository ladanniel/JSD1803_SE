package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流连接中使用PrintWriter 
 * @author live
 *
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws FileNotFoundException {
//		FileOutputStream fis = new FileOutputStream("pw2.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fis);
//		BufferedWriter bw = new BufferedWriter(osw);
//		PrintWriter pw = new PrintWriter(bw);
//		pw.println("《春夜喜雨》.唐.杜甫");
//		pw.println("好雨知时节，当春乃发生；随风潜入夜，润物细无声。");
//		pw.println("野径云俱黑，江船火独明；晓看红湿处；花重锦官城。");
//		System.out.println("写出完毕！");
//		pw.close();
		
		
		FileOutputStream fis = new FileOutputStream("pw2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fis);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("《春夜喜雨》.唐.杜甫");
		pw.println("好雨知时节，当春乃发生；随风潜入夜，润物细无声。");
		pw.println("野径云俱黑，江船火独明；晓看红湿处；花重锦官城。");
		System.out.println("写出完毕！");
		pw.close();
		
	}

}
