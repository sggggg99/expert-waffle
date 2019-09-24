package ch12;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	public MyComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return -o1.getId().compareTo(o2.getId());
	}

}
