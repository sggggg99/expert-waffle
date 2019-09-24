package ch08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/**
 * 这个例子展示了如何对set中对象进行排序
 * 方法1 对象实现comparable接口
 * 方法2 自定义comparator
 * @author cjy
 *
 */
public class SortDemo {

	public SortDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//无序
		testSet(new HashSet<Student>());
		//有序 依赖sudent.compareTo方法
		testSet(new TreeSet<Student>());
		//自己构造comparator1""
		testSet(new TreeSet<Student>(new StudentComparator(EnumField.name,EnumOrder.asc)));
		//自己构造comparator2
		testSet(new TreeSet<Student>(new StudentComparator(EnumField.height,EnumOrder.desc)));
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
//		stu=new Student("008","wangr",560,180);
//		set.add(stu);
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
		System.out.println("--------------------------");
	}
	
	

}
