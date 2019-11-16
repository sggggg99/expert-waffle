package com.huawei.classroom.student.h01;


/**
 * 把你作业的代码写到这个类里面
 * 不可以修改类的名字、包名、和固有的几个方法名
 * 可以增加其他方法、属性
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class Home01 {

	public Home01() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 判断a,b,c是否能够构成三角形的三个边
	 * 难度系数1星
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */

	public boolean isTriangle(int a,int b,int c) {
		//完成本函数里面的代码
		if((a - b < c)&&(b - a < c)&&(a - c < b )&&(c - a < b)&&(b - c < a)&& (c - b < a))
			return true ;
		return false; 
	}	
	
	/**
	 * 判断两个浮点数是否相等，一般认为如果两个浮点数的差值小于0.0001，即认为相等
	 * 难度系数1星
	 * @param f1
	 * @param f2
	 * @return
	 */
	public boolean isEq(float f1, float f2) {
		if((f1 - f2<0.0001)&&(f1 - f2 >= 0)||
				(f2 - f1 < 0.0001)&&(f2 - f1 >= 0))
			return true;
		else
		//完成本函数里面的代码
				return false; 
	}
	/**
	 * 将学生百分之成绩变换为A(>=90,B>=80且非A,C>=70且非C,D>=60且非D,E 其他)
	 * 难度系数1星
	 * @param score
	 * @return
	 */
	public String getGrade(int score) {
		if(score >=90)
			return "A";
		else if(score >= 80)
			return "B";
		else if(score >= 70)
			return "C";
		else if(score >= 60)
			return "D";
		else if( score >= 0)
			return "E";
		else
		//完成本函数里面的代码
		return null; 
	}
	/**
	 * 判断一个数字是否是质数，如果是质数返回true，否则false
	 * 难度系数1星
	 * @param i
	 * @return
	 */
	public boolean isPrime(int i) {
		// 完成本函数里面的代码
		if(i == 1)
				return false ;
						
		int j = (int)( Math.pow( i , 1/2.0));
		for(int k = 2 ; k <= j ; k ++ ) {
			if(i % k == 0)
		
		return false;
		}
		return true;
	}
	
	/**
	 * 计算 整数 i+(i+1)....+j的加和
	 * 难度系数1星
	 * @param i
	 * @param j
	 * @return
	 */
	public int getSum(int i, int j) {
		// 完成本函数里面的代码
		if(i <= j) {
		int sum = 0;
		for(int k = i ; k <= j ; k ++) {
			sum += k;
		}
	return sum;}
		else
			return 0;
		
	}
	
	/**
	 * 返回大于等于i，且小于等于j的所有的偶数的加和
	 * 难度系数1星
	 * @param i
	 * @param j
		 * @return
	 */
	public int getEvenSum(int i,int j) {
		// 完成本函数里面的代码
		if(i <= j) {
			int sum = 0 ;
			int k;
			if( i % 2 == 0 ) 
				 k = i ;
			else
				k = i + 1;
			for( ;k <= j ; k += 2 ) {
				sum += k;
			}
			return sum;
		}
		else
		return 0;
	}
	
	/**
	 * 返回i,j,k中的最大值
	 * 难度系数1星
	 * @param i
	 * @param j
	 * @param k
	 * @return
	 */
	public int getMax(int i,int j,int k) {
		// 完成本函数里面的代码
		int m = i ;
		if(m - j < 0)
			m = j;
		if(m - k < 0)
			m = k;
		return m;
	}
	/**
	 * 判断一个数是否是水仙花数，
	 * 所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
	 * 难度系数2星
	 * @param i
	 * @return
	 */
	public boolean isNarcissisticNum(int i) {
		// 完成本函数里面的代码
		int m , n , k;
		m = i /100;
		n = (i %100) / 10 ;
		k = i %10;
		if( m*m*m+n*n*n+k*k*k == i)
			return true;
			else
		return false;
	}
	
	/**
	 * 判断一个数是否是完全数，
	 * 一个数如果恰好等于它的因子之和，这个数就称为 "完全数 "。
	 * 难度系数2星
	 * @param i
	 * @return
	 */
	public boolean Perfectnumber(int i) {
		// 完成本函数里面的代码
		
		int sum = 0;
		for(int k = 1 ; k < i ; k ++) {
			if(i % k == 0)
				sum += k;
			
		}
		if(sum == i)
			return true;
		else
		return false;
	}
}
