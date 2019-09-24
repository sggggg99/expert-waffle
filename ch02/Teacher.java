package ch02;

public class Teacher {

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Student().study("java");
		new Student().study("java");
		//new Student().sleep();
		System.out.println(Student.getCount());

	}
}
 