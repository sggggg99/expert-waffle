package ch05.intergate;

public class MyFun2 implements Integrable {

	@Override
	public double getValue(double x) {
		// TODO Auto-generated method stub
		return Math.pow(Math.E,x);
	}

}
