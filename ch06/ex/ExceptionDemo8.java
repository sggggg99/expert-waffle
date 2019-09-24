package ch06.ex;

/**
 * 这个例子演示了 什么情况下 异常需要显示的throw，什么情况下 不需要throw
 * @author cjy
 *
 */
public class ExceptionDemo8 {
	public int myDiv1(int i1,int i2) throws Exception  {
		if(i2==0) {
			//如果抛出的是Exception的子类，且非RuntimeException的子类，必须抛出或者捕捉
			throw new Exception("除数不能为0");
		}
		return i1/i2;
	}
	
	public int myDiv2(int i1,int i2) {
		if(i2==0) {
			//如果抛出的是RuntimeException的子类，或者Error子类，则不需要显示的抛出			
			throw new RuntimeException("除数不能为0");
		}
		return i1/i2;
	}

	public int myDiv3(int i1,int i2) {
		if(i2==0) {
			//如果抛出的是RuntimeException的子类，或者Error子类，则不需要显示的抛出			
			throw new Error("除数不能为0");
		}
		return i1/i2;
	}
	 
}
