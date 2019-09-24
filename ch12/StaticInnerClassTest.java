package ch12;

/**
 * 静态内部类示例
 * 
 * @author cjy
 *
 */
public class StaticInnerClassTest {
	private static int b = 2;
	private int c;
	public static void main(String[] args) {
		StaticInner inner = new StaticInner();
		inner.test();
	}
	public static class StaticInner {
		private static int a=1;
		public void test() {
			// 静态内部类可以访问外部类的静态成员
			// 并且它只能访问静态的
			System.out.println(a);
			System.out.println(b);
			// 访问非静态变量报错
			//System.out.println(c);
		}
	}
}
