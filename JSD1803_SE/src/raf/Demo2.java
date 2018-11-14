package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**完成用户注册业务操作:
 * 用户名信息包含：
 * 用户名；密码；昵称；年龄(int)，其他三项为字符串（String）
 * 
 * 每个用户的信息都要写入user.dat中保存
 * 每条记录的长度固定为100字节。其中用户名、密码、昵称三项各占32字节
 * 年龄int值固定为4个字节
 * 
 * 字符串“留白”操作便于修改内容。不会影响整个文件的格式
 * 
 * @author live
 *程序编写过程中一般不用xxx.nextInt();类型；而是用Integer.parseInt(xxx.nextInt) 出于输出读取安全考虑
 */

public class Demo2 {
	public static void main(String[] args) throws IOException {
	    RandomAccessFile raf = new RandomAccessFile("hello.txt","rw");
		System.out.println("欢迎注册");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入用户名");
		String username=scan.nextLine();
		
		System.out.println("请输入密码");
		String password = scan.nextLine();
		
		System.out.println("请输入昵称");
		String nickname = scan.nextLine();
				
	    System.out.println("请输入年龄");
	    int age = Integer.parseInt(scan.nextLine());
	    
//	                                                            System.out.println("uesername"+username);
//	                                                            System.out.println("password"+password);
//	                                                            System.out.println("nickname"+nickname);
//	                                                            System.out.println("age"+age);打桩有助于理解程序执行的过程，以及检测程序的错误
//		
//
	
	    
	    
	    
	    
	    
	    
	 raf.seek(raf.length());	 
//	 //写用户名
	 byte[] data = username.getBytes("GBK");
	  data=Arrays.copyOf(data, 32);  
	   raf.write(data);

//	 //写密码
	   data =password.getBytes("GBK");
	  data =Arrays.copyOf(data, 32);
	 raf.write(data);

//	 //写昵称
	 data= nickname.getBytes("GBK");
	 data = Arrays.copyOf(data, 32);
	 raf.write(data);
//	 //写年龄
	 raf.writeInt(age);

	 System.out.println("注册完毕");
     raf.close();
	 


	 

	}

}
