package ch03;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
//		Father f=new Son();
//		f.staticMethod();
//		f.method();
//		System.out.println(f.staticVar);
//		System.out.println(f.var);
	}
	public static void main(String args[]) {
	    bogo(new Extension());
	  }
	  static void bogo(Base b) {
	   b.add(8);
	   b.print();
	  }

}
