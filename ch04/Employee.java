package ch04;

/**
 * 这个例子演示了各种构造方法 这个例子 也展示了如何正确的使用重载函数
 * 
 * @author cjy
 *
 */
public class Employee {
	private String name;
	private int salary;

	// 俩个参数的构造方法
	public Employee(String n, int s) {
		name = n;
		salary = s;
	}

	// 一个参数的构造方法
	public Employee(String n) {
		// 在构造函数中如何调用其他构造函数
		this(n, 0);
		// 如果不用 this(n, 0);而是写成如下代码好么？为什么？
//		 name=n;
//		 salary=0;
	}

	// 什么参数都没有的构造方法
	public Employee() {
		// 在构造函数中如何调用其他构造函数
		
		// 如果调用了其他构造函数，必须写在第一行
		this("无名 ");
		//或者 this("无名 ",0);
		/* 如果不用 this( "无名 ");而是写成如下代码好么？为什么？
		 name="无名 ";
		 salary=0;*/
		
		System.out.println("没名字"); // 正确
		

	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("张三", 1000);
		Employee e3 = new Employee("李四");
	}
}
