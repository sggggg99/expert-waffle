package ch06;

public class Extension extends Base {
	Extension() {
		add(2);
		System.out.println(this.getClass()+" Extension");
	}

	void add(int v) {
		i += v * 2;
		System.out.println(this.getClass()+" add");
	}
}
