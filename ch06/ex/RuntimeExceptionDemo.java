package ch06.ex;

/**
 * 演示了几种常见的RuntimeException
 * @author cjy
 *
 */
public class RuntimeExceptionDemo {

	public RuntimeExceptionDemo() {
		// TODO Auto-generated constructor stub
	}
	public static int divByZero(int a,int b) {
		return a/b;
	}
	public static int arrayIndex(int[]a, int i) {
		return a[i];
	}
	public static int numberFormat(String s) {
		return Integer.valueOf(s);
	}
	public static void main(String[] args) {
		try {
			divByZero(1,0);
			arrayIndex(new int[0],1);
			numberFormat("abc");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}

}
