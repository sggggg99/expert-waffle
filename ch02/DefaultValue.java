package ch02;

/**
 * 本例子演示了每种类型变量的默认值
 * @author cjy
 *
 */
public class DefaultValue {
	int i;
	String s;
	boolean b;
	int[] a;
	public static void main(String[] args) {
		DefaultValue value=new DefaultValue();
		//体会每种类型变量的默认值
		System.out.println("defautl i="+value.i);
		System.out.println("defautl s="+value.s);
		System.out.println("defautl b="+value.b);
		System.out.println("defautl a="+value.a);
		
		//下面的注释的写法为什么报错
		//System.out.println("defautl i="+i);
	}
}
