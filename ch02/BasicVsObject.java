package ch02;

public class BasicVsObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Integer I=i;
		I=1;
		
		
		boolean b=false;
		Boolean B=b;
		B=false;
		
		System.out.println("i="+i);
		System.out.println("I="+I);
		System.out.println("b="+b);
		System.out.println("B="+B);
		
		
	}

}
