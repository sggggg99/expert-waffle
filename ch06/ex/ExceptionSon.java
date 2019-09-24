package ch06.ex;

import java.io.IOException;

/**
 * Exception引发的override问题
 * @author cjy
 *
 */

public class ExceptionSon extends ExceptionFather {

	public ExceptionSon() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void method1() throws Exception {
		// 这个方法为什么编译不过去？
		

	}

	@Override
	public void method2() throws Exception {
		// 这个方法为什么编译不过去？

	}

}
