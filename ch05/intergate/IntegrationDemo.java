package ch05.intergate;

public class IntegrationDemo {

	public IntegrationDemo() {
		// TODO Auto-generated constructor stub
	}
	public double integrateAB(Integrable fun,double a,double b,double step) {
		
		double sum=0;
		while(a<b) {
			sum=sum+step*fun.getValue(a);
			a=a+step;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegrationDemo demo=new IntegrationDemo();
		
		Integrable myFun=new MyFunction();
		
		//MyFunction myFun2=new MyFun2();
		
		double sum=demo.integrateAB(myFun,-1,1,0.0005);
		System.out.println(sum);
	}


}
