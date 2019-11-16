package com.huawei.classroom.student.h04;

public class MyStack {
	private int size;
	private int[] elements;
	private int length;
	public MyStack(int size) {
		this.size = size;
		length = 0;
		elements = new int [size];
	}
	public int pop() {
		return elements[--length];
	}
	public void push(int value) {
		elements[length] = value;
		length++;
	}
	public boolean isEmpty() {
	    return length == 0;
	}
	public boolean isFull() {
		return length == size;
	}
}
