package com.huawei.classroom.student.h05.q03;

public class NoMoneyException extends Exception{
	private double deposits ;

	public NoMoneyException(double deposits) {
		super("NoMoneyException" + deposits);
		this.deposits = deposits;
		// TODO Auto-generated constructor stub
	}
	public double getDeposits() {
		return deposits;
	}

}
