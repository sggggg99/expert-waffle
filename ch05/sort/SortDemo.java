package ch05.sort;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 本例子演示了如果自动对学生进行排序，
 * 也是接口作用的演示
 * @author cjy
 *
 */
public class SortDemo {

	public SortDemo() {
		// TODO Auto-generated constructor stub
		
		 
	}
	public static void main(String[] args) {
//		TreeSet set=new TreeSet();
//		set.add(new Student("张三",200));
//		set.add(new Student("李四",600));
//		set.add(new Student("王武",300));
//		set.add(new Student("赵六",500));
		 
		
//		Iterator  it=set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			
//		}
		Student[] a=new Student[3];
		a[0]=new Student("张三",200);
		a[1]=new Student("张三",40);
		a[2]=new Student("张三",220);
		Findmax max=new FindMax(a);
		Object o=max.findMax(a);
		
	}
	

}
