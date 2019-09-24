package ch03;

/**
 * 这个类里面展示了 == 和 equals的区别
 * 
 */
public class TestEq {

	public TestEq() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog();
		dog1.setName("tom");
		Dog dog2 =new Dog();;
		dog2.setName("tom");
		// 结果输出true还是false?为什么？
		System.out.println("dog1==dog2?"+(dog1==dog2));
		
		
		String s1 = "ab";
		String s2 = "ab";		 
		// 结果输出true还是false?为什么？
		System.out.println("s1 == s2?"+(s1 == s2));		
		s1 = "ab";
		s2 = "a" + "b";
		// 结果输出true还是false?为什么？ 看看反编译结果
		System.out.println("s1 == s2?"+(s1 == s2));		
		String s3 = "a";
		String s4 = "b";
		String s5 = s3 + s4;
		// 结果输出true还是false?为什么？
		System.out.println("s1 == s5?"+(s1 == s5));
		
		
		String s;
		// 结果输出true还是false?为什么？
		System.out.println("s1.equals(s5)"+s1.equals(s5));

		
		Integer s10=100;
		Integer s20=s10;
		//s20=new Integer(200);
		s20.setValue(200);
		
		//
		
		// 结果输出true还是false?为什么？
		//equals 返回true和false 取决于 Dog.equals方法
		dog2.setName("tom");
		System.out.println("dog1.equals(dog2)?"+dog1.equals("s"));
		//
//		Integer i1=127;
//		Integer i2=127;
//		Integer i3=128;
//		Integer i4=128;
		
		   Integer i1 = Integer.valueOf(127);
		    Integer i2 = Integer.valueOf(127);
		    Integer i3 = Integer.valueOf(128);
		    Integer i4 = Integer.valueOf(128);
		int i5=128;
		int i6=128;
		System.out.println(i1==i2);
		System.out.println(i3==i4);
		System.out.println(i5==i6);


	}

}
