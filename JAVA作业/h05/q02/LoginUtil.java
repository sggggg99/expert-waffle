package com.huawei.classroom.student.h05.q02;

public class LoginUtil {

	private String name;
	private String passWord;

	public LoginUtil() {};

	public void login(String name,String passWord) throws InvalidUserExcetpion{
		set(name,passWord);
		}
	public void set(String newName,String newPassWord) throws InvalidUserExcetpion{
		if(newName.equals("a") && newPassWord.equals("a")) {
			name = newName;
			passWord = newPassWord;
			}
		else 
			throw new InvalidUserExcetpion(newName,newPassWord);
	}

}
