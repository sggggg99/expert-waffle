package ch03;

/**
 * 本例子演示了如何遍历数组
 * @author xxm
 *
 */
public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"天津","大学","软件","学院"};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("下面演示另一种写法 这两种写法等效");
		for (String s : a) {
			System.out.println(s);
		}
	
		
	}

}
