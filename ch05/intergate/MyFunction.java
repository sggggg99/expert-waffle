package ch05.intergate;

public class MyFunction implements Integrable {

	public MyFunction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValue(double x) {
		// TODO Auto-generated method stub
	
		Math.pow(Math.E,x);
		return Math.sin(x);
	}

}
