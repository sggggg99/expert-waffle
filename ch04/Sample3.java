package ch04;

/**
 * 这个 例子说明如下问题：
 * 1 如果一个类 没有声明构造函数，则系统会“自动增加” 一个默认的构造函数
 * 2 如果一个类 一旦自己声明了构造函数，则系统不会“自动增加” 一个默认的构造函数
 * @author cjy
 *
 */
public class Sample3 {
	public Sample3() {
		System.out.println("My Default Constructor");
	}

	public static void main(String[] args) {
		//下面这行为什么不报错？
		//因为java会默认的给类一个缺省的构造方法：没有任何参数的构造方法
		Sample1 s1=new Sample1();  //合法
		//下面这行为什么报错？
		//一旦某个类自己显示的定义了构造方法，系统就不再会给他缺省的构造方法
		Sample2 s2=new Sample2();  //非法
		Sample2 s22=new Sample2(1);
		Sample3 s3=new Sample3();

	}
}
