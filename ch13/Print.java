/**
 * 
 */
package ch13;

/**
 * @author cjy
 *
 */
public class Print {
	private static final ThreadLocal<String> session = new ThreadLocal<String>();

	public static ThreadLocal<String> getSession() {
		return session;
	}

	public static void printline() {
		System.out.println(getSession().get());
	}
}
