package ch02;

public class Sample {

	int v1;
	boolean v2;

	public static void main(String args[]) {
		long i=1000L*60*60*24*365;
		System.out.println(i);
		Sample s = new Sample();
		System.out.println(s.v1);
		System.out.println(s.v2);
	}

	public void doComputation() {
		int x = (int) (Math.random() * 100);
		int y;
		int z;
		if (x > -999999999) {
			y = 9;
		}
		//这行代码无法编译通过 y没有初始化
		//y是成员变量 默认初始化
		//为什么v1 v2同样没有初始化 却不报错？
		z = y + x;		
	}
	
}
