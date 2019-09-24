package ch06.ex;

import java.sql.SQLException;

/**
 * 这个例子演示了 没有抛出异常的情况下，凭空的捕捉异常，不会导致编译错误
 * @author cjy
 *
 */
public class ExceptionDemo10 {
	public int myDiv(int i1,int i2) {
		if(i2==0) {
			throw new Error("除数不能为0");
			//throw new SQLException("");
		}
		return i1/i2;
	}
	public ExceptionDemo10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ExceptionDemo10 demo = new ExceptionDemo10();
		try {
			int result=demo.myDiv(10,0);
			System.out.println("result="+result);
			// 不是什么都能catch
		} catch (Exception e) {
			System.out.println("出错拉！");
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
	}

}
