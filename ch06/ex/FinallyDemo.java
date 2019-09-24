package ch06.ex;

/**
 * 这段代码演示了如果return的时候，finally是否会被执行
 * @author cjy
 *
 */
public class FinallyDemo {

	public FinallyDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void test() {
		try {
			if(1>0) {
			return ;
			}
			int a=0;
			int b=3;
			//System.exit(0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			//这行代码会被执行么？
			System.out.println("finally");
		}
	}
	public static void main(String[] args) {
		test();
	}

}
