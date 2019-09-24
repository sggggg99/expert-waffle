package ch07;

import java.io.Serializable;

public class Dog implements Comparable{
	public String name;
	public Dog(String name) {
		super();
		this.name = name;
	}
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	Serializable s;
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
