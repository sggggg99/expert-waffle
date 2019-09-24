package ch04;


/**
 * 推论1：如果一个父类，显式的声明了构造函数，
 * 且没有无参数构造函数，则其子类构造函数的第一句必须
 * 显示的调用父类的一个构造函数(例子ch04.MySub）
 * @author cjy
 *
 */
public class MySub extends MyBase{
	//这个类编译不过去 为什么？
	public MySub() {
	
		
	}
	
}
