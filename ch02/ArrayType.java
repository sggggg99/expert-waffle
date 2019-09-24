package ch02;

/**
 * 这个例子 展现了其实数组 也是一种对象
 * 也是Object的子类
 *
 */
public class ArrayType {

	public ArrayType() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s=new int[3];
		//下面这些方法 都是Object类里面定义的方法
		System.out.println(s.hashCode());
		System.out.println(s.toString());
		System.out.println(s.getClass());
	}

}

