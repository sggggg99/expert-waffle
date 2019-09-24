package ch04;

/**
 * 和Class A 一起演示类的初始化顺序
 * 这种嵌套式的static风格非常不好，不推荐
 * @author cjy
 *
 */
public class B {
	static {
		System.out.println("class B init");
		A.fa();
	}
	public static void fb()
	{
		System.out.println("class B static fb");
	}

	public static void main(String[] args) {
		//执行main 方法，看打印出了什么
	}
}
