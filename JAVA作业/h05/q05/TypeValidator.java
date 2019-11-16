package com.huawei.classroom.student.h05.q05;
/**
 * 这个类里面可以增加适当的属性，方法，但是不可以修改现有的方法的声明
 * @author cjy
 *
 */
public class TypeValidator {

	public TypeValidator() {
		// TODO Auto-generated constructor stub
	}

	public void validate(Object obj)throws RuntimeException{
		if(!(obj instanceof String))
			throw new RuntimeException("RuntimeException");
	}

}
