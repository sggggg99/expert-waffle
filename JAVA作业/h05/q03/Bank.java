package com.huawei.classroom.student.h05.q03;

/**
 * 这个类里面可以增加适当的属性，方法，但是不可以修改现有的两个方法声明
 * @author cjy
 *
 */
public class Bank {
	private double deposits = 0;

	public Bank() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 初始账户余额为0，每次存款账户余额增加
	 * @param money
	 */
	public void save(int money) {
		deposits+= money;
	}
	
	/**
	 *  
	 * 当账号余额<money的时候，抛出NoMoneyException(NoMoneyException需要你自己定义)
	 * 否则账号余额减少
	 * @param money
	 * @throws NoMoneyException
	 */
	public void get(int money) throws NoMoneyException {
		if(deposits >= money)
			deposits -= money;
		else
			throw new NoMoneyException(money);
		
	}

}
