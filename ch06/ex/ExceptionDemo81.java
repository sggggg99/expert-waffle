package ch06.ex;

/**
 * 这个例子演示了 没有抛出异常的情况下，凭空的捕捉异常，却没有发生错误
 * @author cjy
 *
 */
public class ExceptionDemo81 {
	public int myAdd(int i1,int i2) {		
		return i1+i2;
	}

	public static void main(String[] args) {
		ExceptionDemo81 demo = new ExceptionDemo81();
		try {
			int result=demo.myAdd(10,0);
			System.out.println("result="+result);
			// 不是什么都能catch
		} catch (Exception e) {
			System.out.println("出错拉！");
			System.out.println(e.getMessage());
			 e.printStackTrace();
		}
	}
}
