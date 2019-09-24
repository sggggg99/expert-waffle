package ch06.ex;

/**
 * 异常的处理方法
 * @author cjy
 *
 */
public class ExceptionDemo31 {

	public void f1() {
		int[] a=new int[10];
		for(int i=0;i<=a.length;i++) {
			a[i]=i;
		}
	}
	public void f2() {
		f1();
	}
	public ExceptionDemo31() {
		// TODO Auto-generated constructor stub
		f2();
	}

	public static void main(String[] args) {
		try {
			new ExceptionDemo31();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
