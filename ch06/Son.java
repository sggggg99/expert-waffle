package ch06;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类和Father演示了对象构造 销毁的过程
 * @author cjy
 *
 */
public class Son extends Father {
	private static int id=0;
	 
	private int myId;
	static {
		System.out.println("son static init!");
	}

	public Son() {
		myId=id++;
		System.out.println("son init! id="+myId);
	}
	/**
	 * 析构函数
	 */
	
	protected void finalize() throws Throwable {
		//System.out.println("Son finalize! id="+myId);
		super.finalize();
	}
}
