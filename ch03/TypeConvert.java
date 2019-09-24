package ch03;

/**
 * 这个例子展现了类型的转换原则
 *
 */
public class TypeConvert {

	public TypeConvert() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Object o=new Object();
		String s="a";
		Object o2=s;
		o=s; //编译能通过么？
		//o2=new Object();
		s=(String)o2; //编译能通过么？

	}
	public static void main2(String[] args) {
		
		
		
		int a=1000000000;
		int b=a*3;
		//结果是多少？
		
		System.out.println("b="+b);
		
		System.out.println("abs b="+Math.abs(b));
		
		
		int c=-2147483648;
		System.out.println("abs c="+Math.abs(c));
		/*
		float f = 1.0f;
		double d = f;
		f = (float) d;
		
		//下面这段代码输出什么？
		System.out.println("5 / 3 * 3="+(5 / 3 * 3));
		//下面这段代码输出什么？
		System.out.println("(int)(1.0*5/3*3)="+(int)(1.0*5/3*3)); 

		Object o = new Object();
		String s = "a";
		o = s;
		s = (String) o;
		System.out.println(s instanceof String);
*/
	}

}
