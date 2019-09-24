package ch04;

public class Sample2 {
	/** 一旦自己显式的定义了构造方法，系统就不再会提供缺省构造方法。 **/
	// 这个类里面没有下面注释掉的默认构造函数
	// public Sample2() {}
	public Sample2(int a) {
		System.out.println("My Constructor");
	}

}
