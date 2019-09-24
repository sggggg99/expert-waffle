package ch13;

/**
 * ThreadLocal的例子
 * @author cjy
 *
 */
public class ThreadLocalDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new MyThreadLocal().start();
		}
	}	
}
