package ch12;

/**
 *  内部局部类演示
 * @author cjy
 *
 */
public class LocalInnerClassTest {
	private static int b = 2;
	private int c;

	public static void main(String[] args) {
		new LocalInnerClassTest().doSomething();
	}
	public void doSomething() {
		//public class LocalInner {会报错
		class LocalInner {
			public void test() {
				System.out.println(b);
				System.out.println(c);
			}
		}
		new LocalInner().test();
	}

}
