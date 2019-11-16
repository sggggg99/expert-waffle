package com.huawei.classroom.student.h05.q03;

/**
 * 在本包下增加合适的类和方法,并完善Bank类，使得Test类能够测试通过
 * 不能通过修改Test的代码使得测试通过
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
 
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		try {
			System.out.println("完成此操作后余额100");
			bank.save(100);
			System.out.println("完成此操作后余额400");
			bank.save(300);
			
			System.out.println("完成此操作后余额200");
			bank.get(200);
			System.out.println("作对第1步");
			
			System.out.println("余额不足，应该抛出异常了");
			bank.get(300);
			System.out.println("bunengchuxian");
			 

		} catch (NoMoneyException e) {

			System.out.println("做对了第2步");

		}
	}
}
