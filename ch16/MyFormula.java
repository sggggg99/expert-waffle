package ch16;

public class MyFormula implements Formula {

	public MyFormula() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFormula f=new MyFormula();
		System.out.println(f.add(1, 2));
	}

	@Override
	public double add(int a,int b) {
		// TODO Auto-generated method stub
		return sqrt(a+b);
	}

}
