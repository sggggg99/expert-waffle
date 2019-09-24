package ch04;

/**
 * 本程序显示了各代码段的执行顺序
 * 
 * @author cjy
 *
 */
public class InitOrder {
	static int i = 5;
	static {
		System.out.println(" First Static code i= " + i++);
	}
	static {
		System.out.println(" Second Static code i= " + i++);
	}

	public InitOrder() {
		System.out.println(" InitOrder() ");
	}

	public static void main(String args[]) {
		// 注意各种方法执行的顺序
		new InitOrder();
		new InitOrder();

	}

}
