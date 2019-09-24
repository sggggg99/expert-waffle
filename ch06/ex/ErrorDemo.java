package ch06.ex;

/**
 * 本例子演示了几种可能出现Error的情况
 * @author cjy
 *
 */
public class ErrorDemo {

	public ErrorDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void appendStr() {
		StringBuffer s=new StringBuffer();
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;i++) {
				s.append(i);
			}
			s.append("*");			
		}
	}
		
	public static int factorial(int i) {
		return i*factorial(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//factorial(1);
			appendStr();
		} catch (Error e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
