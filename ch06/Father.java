package ch06;

/**
 * 本类和Son演示了对象构造 销毁的过程
 * @author cjy
 *
 */
public class Father {
	static {
		System.out.println("father static init!");
	}

	public Father() {
		
		//System.out.println("Father init!");
		 
	}

	/**
	 * 析构函数
	 */
	protected void finalize() throws Throwable {
		//System.out.println("Father finalize!");
		super.finalize();
	}
}
