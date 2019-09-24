package ch04;

public class SonFatherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//每个构造函数在开始以前，会默认的调用其父类的无参数构造方法，
		//除非这个类开始显式的调用了其他的父类构造函数。
		Son son2 = new Son("张三");
		//Son son1 = new Son("王小毛", "王大毛");
		
		

	}

}
