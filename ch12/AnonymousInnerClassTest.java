package ch12;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


/**
 * 匿名类的例子
 * @author cjy
 *
 */
public class AnonymousInnerClassTest  {

	public static void main(String[] args) {
		Comparator myComparator=new MyComparator();
		TreeSet<Student> test1=new TreeSet<Student>(myComparator);
		
		
		TreeSet<Student> test=new TreeSet<Student>(new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return -o1.getId().compareTo(o2.getId());
			}
		}
		);
		testSet(test);
	}
	
	public static void testSet(Set<Student> set) {
		init(set);
		print(set);
	}
	
	/**
	 * 初始化数据
	 * @param set
	 */
	public static void init(Set<Student> set) {
		
		Student stu=new Student("001","zhang",500,170);
		set.add(stu);
		stu=new Student("009","liu",500,178);
		set.add(stu);
		stu=new Student("008","wang",510,160);
		set.add(stu);
		stu=new Student("003","li",520,171);
		set.add(stu);
	}
	
	/**
	 * 打印出set中所有数据
	 * @param set
	 */
	public static void print(Set<Student> set) {
		Iterator<Student> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}



}
