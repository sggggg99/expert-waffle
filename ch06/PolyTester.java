package ch06;

public class PolyTester {
	public static void main(String args[]) {
		bogo(new Extension());
	}

	static void bogo(Base b) {
		b.add(8);
		b.print();
	}
}
