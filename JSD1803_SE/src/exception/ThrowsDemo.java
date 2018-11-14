package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**派生类在继承超类时会重写其方法，那么在重写超类中含有Throws声明异常抛出的
 * 方法时，对Throws的重写规则
 * 
 * @author live
 *
 */
public class ThrowsDemo {
	public void dosome() throws IOException,AWTException{
		
	}

}
class song extends ThrowsDemo{
//	public void dosome()throws IOException,AWTException{
//		
//	}
//   可以不抛出任何异常
//   public void dosome(){
//	   
//   }
//	可以抛出父类方法抛出的部分异常
//	public void dosome ()throws IOException{
//		
//	}
//	可以抛出父类方法抛出异常的子类型异常 File异常时IOE的子类异常
	//不允许抛出父类方法抛出异常的父类型异常
//	public void dosome()throws SQLException{
//		
//	}
	public void dosmome()throws FileNotFoundException{
		
	}
}
