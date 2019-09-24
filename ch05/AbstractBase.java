package ch05;

/**
 * 本例子和AbstractSub演示了abstract的用法
 * 
 *
 */
//抽象类，1允许有抽象方法 2不能实例化
public abstract class AbstractBase {
	//抽象方法，不能有具体实现
	public abstract void method1(String arg1);
	
	/**
	 * 虽然抽象类不能被实例化，但是可以有构造函数
	 */
	public AbstractBase() {
		// 
	}

	public static void main(String[] args) {
		// 此处报错，抽象类不能被实例化
		new AbstractBase();

	}

}
