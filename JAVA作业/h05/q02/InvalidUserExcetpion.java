package com.huawei.classroom.student.h05.q02;

public class InvalidUserExcetpion extends Exception{
	private String name;
	private String passWord ;

	public InvalidUserExcetpion(String name , String passWord) {
		super("InvalidUserExcetpion" + name + " " + passWord);
		this.name = name;
		this.passWord = passWord;
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public String getPassWord() {
		return passWord;
	}

}
