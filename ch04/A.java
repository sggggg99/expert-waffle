package ch04;
/**
 * 和Class B  一起演示类的初始化顺序
 * @author cjy
 *
 */
public class A {
	static {
		System.out.println("class A init");
		B.fb();
	}

	public static void fa() {
		System.out.println("class A static fa");
	}
	public static void main(String[] args) {
		//执行main 方法，看打印出了什么
	}
}
