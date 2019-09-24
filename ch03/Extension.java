package ch03;

public class Extension extends Base {
	Extension() {
		add(2);
	}

	void add(int v) {
		i += v * 2;
	}
}
