package ch01;

/**
 * 这个例子展示了int 的错误使用
 */
public class ErrorType2 {
	public static void main(String[] args) {

		// 下面这4行代码 表现了int的错误使用
		int sum = 0;
		for (int i = 0; i < 1000000000; i++) {
			sum = sum + i;
		}
		//输出的结果居然是负数，因为sum已经溢出了
		System.out.println("sum=" + sum);
	}
}
