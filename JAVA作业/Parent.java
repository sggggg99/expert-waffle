package com.huawei.classroom.student.h04;

public class Parent {
    private String name;
	public Parent() {
		
	}
	public Parent(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String speak() {
		return "parent";
	}
}
