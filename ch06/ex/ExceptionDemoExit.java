package ch06.ex;

/**
 * 本类演示了 什么情况下 finally 不执行 System.exit(状态码);会导致程序直接退出
 * 
 * @author cjy
 *
 */
public class ExceptionDemoExit {

	public ExceptionDemoExit() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		try {
			System.out.println("Begin");
			// 退出系统 类似C语言中的 exit();
			System.exit(0);
		} finally {
			//这句话 永远不会被执行 因为系统退出了
			System.out.println("Finally");
		}
		//这句话 永远不会被执行 因为系统退出了
		System.out.println("End");
	}

}
