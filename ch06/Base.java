package ch06;

public class Base {
	int i;

	Base() {
		add(1);
	}

	void add(int v) {
		i += v;
	}

	void print() {
		System.out.println(i);
	}
}
