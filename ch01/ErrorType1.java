/**
 * 
 */
package ch01;

/**
 * 这个例子 表现了byte的错误使用（10000超出了byte的表示范围）
 * 
 */
public class ErrorType1 {

	/**
	 * 这个例子 表现了byte的错误使用（10000
	 * 超出了byte的表示范围）
	 */
	public static void main(String[] args) {
		byte i = 0;
		while (i < 10000) {
			// 这段程序将永远陷入到这个循环中
			System.out.println(i);
			i++;
		}
	}

}
