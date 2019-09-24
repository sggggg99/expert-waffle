package ch07;

public class StrBufStrBuilder {

	public StrBufStrBuilder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 比较String StringBuffer StringBuilder的区别
		 */
		String str="";
		StringBuffer sbf=new StringBuffer();
		StringBuilder sbd=new StringBuilder();
		int times=30000;
		long l=System.currentTimeMillis();
		for(int i=0;i<times;i++) {
			str=str+"abc";
		}
		System.out.println("String :"+(System.currentTimeMillis()-l)+" ms cost!");
		l=System.currentTimeMillis();
		for(int i=0;i<times;i++) {
			sbf.append("abc");
		}
		System.out.println("StringBuffer :"+(System.currentTimeMillis()-l)+" ms cost!");
		l=System.currentTimeMillis();
		for(int i=0;i<times;i++) {
			sbd.append("abc");
		}
		System.out.println("StringBuilder :"+(System.currentTimeMillis()-l)+" ms cost!");
	}

}
