package ch05;

/**
 * 本例子中展示了接口中可以定义什么，不可以定义什么？
 * 
 * @author cjy
 *
 */
public interface InterfaceSample {
	// 编译出错 为什么？
	private void method2();

	// 编译出错 为什么？
	protected int var;

	// 编译出错 为什么？
	public void method1(){
		System.out.println("method1");
	}

 
	public  void method3() {
		System.out.println("method3");
	}  

	void method4(); // 编译正确

	/**
	 * jdk1.8新特性
	 * @return
	 */
	default String getString() {
		return "Default String";
	}
}
