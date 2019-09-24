package ch04;

/**
 * 
 * 这个例子展示了一个错误的构造方法例子
 * 构造函数 public void Sample 因为错误的声明，导致构建的时候，根本没有被调用
 * 
 * 
 *
 */
public class Sample {

	int x;

	public void Sample() { // 这个不是构造函数 因为void
		x = 1;
		
		//这句话一直没有被执行
		System.out.println("initialze sample!");
	}

	public static void main(String args[]) {
		
		Sample s = new Sample();
		//请注意 s.x没有被设置为1
		System.out.println(s.x);
	}

}
