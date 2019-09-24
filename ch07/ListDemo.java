package ch07;

import java.util.ArrayList;
import java.util.List;

/**
 * 本例子演示了如何使用List
 * @author cjy
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();
		//List中重要方法1 增加一个元素 add()
		list.add("a");
		//增加一个元素"b"
		list.add("b");
		//增加一个元素"b"
		list.add("b");
		printList(list);
		
		//List中重要方法2 利用对象移除一个元素 remove()
		list.remove("a");
		//List中重要方法3  利用索引移除一个元素  remove()
		list.remove(1);
		
		printList(list);
		
		String s="b";
		//List中重要方法6  contains();
		System.out.println("contains "+s+": "+list.contains(s));
		
		System.out.println("增加b以前的size "+list.size());
		list.add("b");
		System.out.println("增加一次b之后的size "+list.size());
		list.add("b");
		System.out.println("再增加一次b之后的size "+list.size());
		
		//list.remove(1);
		//遍历list
	}
	
	/**
	 * 把list中的所有元素打印出来
	 * @param list
	 */
	public static void printList(List list) {
		System.out.println("list size="+list.size());
		System.out.println("完全按照添加的顺序打印：");
		//List中重要方法4 list的大小 list.size()
		for(int i=0;i<list.size();i++) {
			//List中重要方法5 list的大小 list.get()
			System.out.println(list.get(i));
		}
	}

}
