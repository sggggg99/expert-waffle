package ch07;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public TreeSetDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Set set=new TreeSet();
		SortedSet t;
		System.out.println(System.currentTimeMillis());
//		Set set = new HashSet();
//		set.add("wer");
//		Double[] list = (Double[]) set.toArray(new Double[0]);
//	
	 

	}

	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		Set s = new TreeSet();
		s.add(new Dog("a"));
		s.add(new Dog("b"));
		s.add(new Dog("0"));
		Dog[] ds = (Dog[]) s.toArray();
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i].toString());

		}

	}

}
