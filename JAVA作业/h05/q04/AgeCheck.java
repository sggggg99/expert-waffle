package com.huawei.classroom.student.h05.q04;

public class AgeCheck implements AgeCheckInterface{

	public AgeCheck() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void checkAge(int age)throws RuntimeException{
		if(age <0 || age >200)
			throw new RuntimeException();

		}
}

