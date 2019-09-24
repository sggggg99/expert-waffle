package ch06.ex;

import java.io.IOException;

/**
 * Exception引发的override问题 参见 ExceptionSon
 * 
 * @author cjy
 *
 */
public abstract class ExceptionFather {

	public ExceptionFather() {
		// TODO Auto-generated constructor stub
	}

	public abstract void method1();

	public abstract void method2() throws IOException;

	public static void main(String[] args) {
		 
		
	}
	public  void test(ExceptionFather f) {
		try {
			f.method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}
