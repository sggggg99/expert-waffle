package ch04;

/**
 * 本例子展示了“作用域”
 * 
 *
 */
public class DomainDemo {
	public DomainDemo() {
		// TODO Auto-generated constructor stub
		this("");
		k = 9;
	}

	int k;
	int i = k;

	public DomainDemo(String s) {
//		int i=Count.count;
//		int j=new Count().myCount;
	}

	public void f1() {
		f3();
	}

	public void f2() {

	}

	public void f3() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
