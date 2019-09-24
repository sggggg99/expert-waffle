package ch04;

/**
 * 这个类演示了静态方法、静态变量  实例方法、实例变量的调用规则
 * @author cjy
 *
 */
public class Wrong {
	public static int sum=0;
	public int add(int a) {
		sum=sum+a;
		return sum;
	}
	
	public int x;

	public void method() {
		x++;
	}

	public static void test() {
		
		// 静态方法不可以访问成员变量 成员方法
		add(1);
		x = 1; // 非法
		method();// 非法
	}

	public static void main(String args[]) {
		// 静态方法不可以访问成员变量 成员方法
		x = 9; // 非法
		method();// 非法
		
		Wrong w=new Wrong();
		w.x=9;
		w.method();
		//下面这行大部分编译器不会保存，但是不规范
		w.test();
		w.sum=0;
	}

	public void myTest() {
		// 成员变量可以访问静态方法
		test();
	}
}
