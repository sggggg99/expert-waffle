package ch12;


/**
 * 内部成员类演示
 * @author cjy
 *
 */
public class MemberInnerClassTest {
	private static int b = 2;
	private int c;

	public static void main(String[] args) {
		//报错
		//MemberInner inner = new MemberInner();
		new MemberInnerClassTest().myTest();
		//如下代码报错
		new MemberInner().test();
	}
	public void myTest() {
		c=100;
		MemberInner inner = new MemberInner();
		inner.test();
	}

	public class MemberInner {
		//下面的语句报错
		private  static int a = 1;
		private int d=9;
		public void test() {
			// 静态内部类可以访问外部类的静态成员
			// 并且它只能访问静态的
			System.out.println(b);
			// 访问非静态变量报错
			System.out.println(c);
		}

	}
}
