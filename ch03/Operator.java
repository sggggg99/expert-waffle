/**
 * 
 */
package ch03;

/**
 * 各种操作符的例子
 * @author  
 * 
 */
public class Operator {

	/**
	 * 
	 */
	public Operator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 各种操作符的例子
		//体会&& 和  &的区别 同理还有 ||和|
		System.out.println("f1() && f2()");
		System.out.println(f1() && f2());
		
		System.out.println("f1() & f2()");
		System.out.println(f1() & f2());
		
		

	}

	public static boolean f1() {
		System.out.println("f1 exectued!");
		return false;
	}

	public static boolean f2() {
		System.out.println("f2 exectued!");
		return true;
	}

}
