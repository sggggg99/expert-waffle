package ch04;

/**
 * 
 * @author cjy
 *
 */

public class EqDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o=new Object();
		EqDemo eq=new EqDemo();
		 //Ϊʲô eq.equals(o) ���벻�ᱨ��
		
		System.out.println(eq.equals(o));		 
	}	
	 
	//@Override
	public boolean equals(EqDemo obj) {
		return true;
	}
	
	public String toString() {
		return super.toString();
	}
	 
	 
}
