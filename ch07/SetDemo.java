package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 本例子演示了如何使用set
 * @author cjy
 *
 */
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new HashSet();
		// Set重要方法1 增加一个元素
		set.add("aa");
		set.add("bb");
		set.add("ss");
		set.add("kk");
		set.add("aa");

		// Set重要方法2 remove()
		set.remove("aa");

		String s = "aa";
		// Set重要方法4 contains()
		System.out.println("contains " + s + ":" + set.contains(s));

		// Set重要方法5 size()
		System.out.println("size :" + set.size());
		//又增加一个次bb 但是set大小不变，因为bb只能存储一次
		set.add("bb");
		System.out.println("size :" + set.size());

		printSet(set);
	}

	public static void printSet(Set set) {
		// 遍历一个set的方法
		System.out.println("打印出来的顺序和增加顺序没有关系,如果碰巧相等是偶然");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
