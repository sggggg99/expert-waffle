package com.huawei.classroom.student.h03;
/**
 * 把你作业的代码写到这个类里面
 * 不可以修改类的名字、包名、和固有的几个方法名以及方法的可见性
 * 可以增加其他方法、属性、类
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class Home03 {

	public Home03() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 返回一个正整数数组a中偶数的个数
	 * @param a
	 * @return
	 */
	public int getEvenCount(int[] a) {
		int count = 0;
		for(int i = 0 ; i < a.length ; i ++) {
			if(a[i] % 2 == 0)
				count ++;
		}
		return count;
	}
	/**
	 * 将个10进制非负整数变成8进制的数
	 * 例如输入 binToOct(8) 返回 "10"
	 * 输入 binToOct(10) 返回 "12"
	 * 难度系数1星
	 * @return
	 */
	public String binToOct(int i) {
		String b = "";
		if( i == 0)
		  return b + 0;
		while(i > 0) {
		b = i % 8 + b;
		i /= 8;
		}
		// 完成本函数里面的代码
		return b;
	}
	
	
	/**
	 * 比较两个字符串，返回其中最小的字符串，提示按String.compareTo 比较即可
	 * 例如 getMin("abc","abe")返回"abc"
	 * 难度系数1星
	 * @return
	 */
	public String getMinStr(String s1,String s2) {
		if(s1.compareTo(s2) >= 0)
			return  s2 ;
		else
		// 完成本函数里面的代码
		return s1;
	}
	
	/**
	 * 判断一个字符串中是否包含大写字母，包含返回true，否则false
	 * 例如：containsUpperCase("Abc")返回true
	 * 难度系数1星
	 * @return
	 */
	public boolean containsUpperCase(String str) {
		
		for(int i = 0 ; i < str.length(); i ++) {
			Character c = str.charAt(i);
			if(Character.isUpperCase(c))
				return true;
		}
		// 完成本函数里面的代码
		return false;
	}
	
	/**
	 * 转换一个字符串中的大小写，原来是大写字母的地方转换为小写，小写字母地方转为大写
	 * 例如：switchUpperLower("Abc")返回 "aBC"
	 * 难度系数1星
	 * @return
	 */
	public String switchUpperLower(String str) {
		String xin = "";
		for(int i = 0 ; i < str.length(); i ++) {
			
			Character c = str.charAt(i);
			if(Character.isUpperCase(c))
				 xin += Character.toLowerCase(c);
			else
				xin += Character.toUpperCase(c);
		}
		// 完成本函数里面的代码
		return xin;
	}
	
	/**
	 * 去掉一个字符串中所有的空格
	 * 难度系数1星
	 * 例如：zipSpace(" a b  c ")返回 "abc"
	 * @return
	 */
	public String zipSpace(String str) {
		String xin = "";
		for(int i = 0 ; i < str.length(); i ++) {
			if(str.charAt(i) == ' ')
				xin +="";
			else
				xin += str.charAt(i);
		}
		// 完成本函数里面的代码
		return xin;
	}
	
	/**
	 * 将一个正整数转换为10位字符串，不足位数左补0；
	 * 例如：exandIntToStr10(123) 返回 "00000000123"
	 * 难度系数1星
	 * @param i
	 * @return
	 */
	public String exandIntToStr10(int i) {
		String xin = ""+i;
		while(xin.length() < 10) {
			xin = 0 + xin;
		}
		return xin;
	}
	
	/**
	 * 将一个正整数转换为len位字符串，不足位数左补0；
	 * 如果这个正整数本身位数超过len，则直接将这个正整数返回即可
	 * 例如：exandIntToStrL(123,4) 返回 "0123"
	 * exandIntToStrL(123,2) 返回 "123"
	 * 难度系数2星
	 * @param i
	 * @param len
	 * @return
	 */
	public String exandIntToStrL(int i,int len) {
		String xin = "" + i;
			while(xin.length() < len) {
				xin = 0 + xin ;
			}
		return xin;
	}
	
	
	/**
	 * 设二元一次方程 a*x*x+bx+c=0;
	 * 的系数分别为a,b,c
	 * 请将这个方程的两个实数根放在数组中返回,如果没有实数解则返回null
	 * 例如 getRoot(1,-2,1)返回 {1,1}
	 * 例如 getRoot(1,-2,2)返回 null
	 * 难度系数1星
	 * @return
	 */
	public double[] getRoot(double a,double b,double c) {
		if(b*b-4*a*c < 0)
			return null;
		double [] root = new double[2];
		double pan = Math.sqrt(b*b - 4*a*c);
		root[0] = (b*(-1) + pan)/(2 * a);
		root[1] = (b*(-1) - pan)/(2 * a);		
		return root;
	}
	
	/**
	 * 返回杨辉三角( Pascal  triangle,请百度 杨辉三角 或者 Pascal  triangle )第i行的系数，杨辉三角第一行定义为1
	 * 提示：从顶部的单个1开始，下面一行中的每个数字都是上面两个数字的和
	 * 例如getPascalTriangle(1)返回{1}，
	 * getPascalTriangle(2)返回{1,2,1}
	 * 测试的时候，系数肯定不会超过int的范围 
	 * 难度系数3星
	 * @param line
	 * @return
	 */
	public int[] getPascalTriangle(int i) {
		int [] T = new int[i];
		for(int j = 1 ; j <= T.length ; j ++) {
			T[j-1] = jie(i-1)/(jie(j-1)*jie(i-j));
		}
		
		return T;
	}
	public static int jie(int i) {
		if(i== 0 || i == 1)
			return 1;
		else
		return  jie(i-1) * i ;
	}
	


	public static void main(String[] args) {
		System.out.println("abc".compareTo("acd"));
	}
}
