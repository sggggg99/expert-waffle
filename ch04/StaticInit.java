package ch04;

/**
 * static 静态初始化的演示
 * 
 * @author cjy
 *
 */
public class StaticInit {
	static int i = 5;
	static {
		System.out.println(" First Static code i= " + i++);
	}
	static {
		System.out.println(" Second Static code i= " + i++);
	}
	public static void main(String args[]) {
		//这个方法里面什么都没写，但是有代码被调用，为什么？
		//一个类载入的时候，不管是否构造了对象，都有会调用static 部分
		//static 部分出错，
	}
}
