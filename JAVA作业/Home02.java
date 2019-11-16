package com.huawei.classroom.student.h02;

/**
 * 把你作业的代码写到这个类里面
 * 不可以修改类的名字、包名、和固有的几个方法名以及方法的可见性
 * 可以增加其他方法、属性、类
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class Home02 {

	public Home02() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 一个整数，判断整数是不是回文数。例如：12321是回文数，个位与万位相同，十位与千位相同
	 * @param i
	 * @return
	 */
	public boolean isSymmetricalNum(int i) {
		if(i >= 0) {
		// 完成本函数里面的代码
		String s = "" +i;
		int l = s.length() - 1;
		for(int j = 0 ; j < (l+1) / 2 ; j ++ ) {
			if(s.charAt(j) != s.charAt(l - j))
				return false ;
		}
		
		return true;
		}
		else
			return false;
	}
	/**
	 * 计算i的阶乘
	 * @param i
	 * @return
	 */
	public long factorial(int i) {
		// 完成本函数里面的代码
		if(i == 1L || i == 0L)
			return 1;
		else if( i > 1L)
			return factorial(i - 1 ) * i ;
		else
		return 0L;
	}
	
	/**
	 * 计算裴波那契数列的第n项
	 * 裴波那契数列定义如下：
	 * F(1)=1;
	 * F(2)=1;
	 * F(n)=F(n-1)+F(n-2) 
	 * @param i
	 * @return
	 */
	public long calcPeponacci(int i) {
		// 完成本函数里面的代码
		if(i == 1 || i == 2 )
			return 1L;
		else if( i > 2)
			return calcPeponacci(i - 1) + calcPeponacci(i - 2);
		else
		return 0L;
	}
	/**
	 * 将一个正整数各位颠倒后返回 
	 * 例如输入1234 返回4321   输入100 返回1
	 * @param i
	 * @return
	 */
	public int reverseInt(int i) {
		if(i > 0) {
		// 完成本函数里面的代码
		String s = "";
		while(i > 0) {
			
			s = s + i%10;
			
			i = i / 10;
		}
		int a = Integer.parseInt(s);
		return a ;
		}
		else
		return 0;
	}
	/**
	 * 计算一个整数各位数之和 
	 * 例如输入 123，返回6
	 * @param i
	 * @return
	 */
	public int mySum(int i) {
		// 完成本函数里面的代码
		if(i >= 0) {
			int sum = 0 ;
			while(i > 0) {
				sum += (i % 10);
				i /= 10;
			}
			return sum ;
		}
		else
		return 0;
	}
	
	/**
	 * 计算两个整数的最小公倍数
	 * @param i
	 * @return
	 */
	public int LCM(int i,int j) {
		// 完成本函数里面的代码
		if(i > 0 && j > 0) {
			int gcd;
			
			if(i < j) {
				int tamp = i ; 
				i = j ;
				j = tamp ;
			}
			int n1 = i;
			int n2 = j;
			while(i % j != 0) {
				gcd = i %j ;
				i = j ;
				j = gcd ;
			}
			gcd = j ;
			return n1 * n2 / gcd;
		}
		else
		return 0;
	}
	/**
	 * 计算两点之间的距离
	 * @return
	 */
	public double getDistance(double x1,double y1,double x2,double y2 ) {
		// 完成本函数里面的代码
		if(Math.abs(x1 - x2) <= 0.0001 && Math.abs(y1 - y2) <= 0.0001)
			return 0;
		else
		return Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)* (y1 - y2));
		
	}

	/**
	 * 返回一个数组中最大元素的位置（元素不会出现相等的情形）
	 * @param i
	 * @return
	 */
	public int findMaxIndex(int[] a ) {
		// 完成本函数里面的代码
		int l = a.length;
		if(l > 0) {
		int max = a[0];
		int index = 0;
		for(int k = 1 ; k < l ; k ++) {
			if(max < a[k]) {
				max = a[k];
				index = k;
				}
		}
		return index ;
		}
		else
		return 0;
	}
	
	/**
	 * 判断一个字符串中一个字符出现的次数
	 * @return
	 */
	public int getCharCount(String str ,char c) {
		// 完成本函数里面的代码
		int count = 0;
		for(int i = 0 ; i < str.length(); i ++) {
			if(str.charAt(i) == c)
				count ++ ;
		}
		return count ;
		//return 0;
	}
	/**
	 * 判断一个字符串中一个字符串出现的次数
	 * @return
	 */
	public int getStrCount(String str ,String sub) {
		// 完成本函数里面的代码
		int count = 0 ;
		int place = -1 ;
		for(int k = 0 ; k < (str.length() - sub.length() ); ) {
			
		if(str.indexOf(sub , k) > place) {
			place = str.indexOf(sub , k) ;
			count ++ ;
			k = place + 1 ;
		}
		else
			break;
		}
		return count ;
		//return 0;
	}
}
