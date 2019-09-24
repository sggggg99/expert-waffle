package ch06;

/**
 * 这个例子演示了 instanceof的用法
 * @author cjy
 */

public class InstanceOfDemo {

	public InstanceOfDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str = "123";
		Son son = new Son();
		MyObject myObj=new MyObject();
		
		//instanceof 的正确用法
		System.out.println(str instanceof Object);
		System.out.println(son instanceof Father);
		System.out.println(myObj instanceof MyObject);
		
		//instacneof的错误用法
		System.out.println(String instanceof Object);
		System.out.println(Son instanceof Object);
		System.out.println(MyObject instanceof MyObject);
	}
}
