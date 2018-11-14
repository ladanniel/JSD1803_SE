package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**homework
 * 登陆验证
 * 程序启动后，要求用户输入用户名及密码
 * 然后匹配user.dat文件中的用户，若用户名及密码输入正确
 * 提示登陆成功，否则提示用户名或密码不正确
 * 
 * @author live
 *
 */
public class Demo3 {
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入信息：");
		
		System.out.println("请输入用户名：");
		String name = scan.nextLine();
		
		System.out.println("请输入密码");
		String pword = scan.nextLine();
		
	 RandomAccessFile raf = new RandomAccessFile("hello.txt","r");
	 
		    boolean flag = false;//表示是否通过验证
			for (int i = 0; i < raf.length()/100; i++) {

				raf.seek(i*100);//将指针移动到当前位置
				byte []data = new byte[32];
				raf.read(data);
				String username = new String(data,"GBK").trim();
				if ( username.equals(name)) {
					//找到此人然后匹配密码
					raf.read(data); 
					String password = new String(data,"UTF-8").trim();
					if ( password.equals(pword)) {
						//登陆成功
						System.out.println("登陆成功");
						flag=true;
					}
					break;
			}

		}
			if (!flag) {
			System.out.println("用户名或密码不正确");
			
		}
		raf.close();
		} 

	}



