package com.huawei.classroom.student.h05.q01;

public class Dog {
	public static int feed = 0;
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public void feed() throws Exception{
		feed ++;
		if(feed >3)
			throw new Exception("I can not eat more!");
	}

}
