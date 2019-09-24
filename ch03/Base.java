package ch03;

public class Base {

	int i;

	Base() {
		this.add(1);
	}

	void add(int v) {
		i += v;
	}

	void print() {
		System.out.println(i);
	}

}
