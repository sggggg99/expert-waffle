package ch06.ex;

public class ExceptionDemo101 {
	public int myDiv(int i1,int i2) {
		return i1/i2;
	}
	public ExceptionDemo101() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ExceptionDemo101 demo = new ExceptionDemo101();
		try {
			demo.myDiv(0,10);			
			// 不是什么都能catch
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
	}

}
