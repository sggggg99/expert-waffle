package ch04;

/**
 * 本类演示了 变量前面带有static 和不带static 的区别
 * @author cjy
 *
 */
public class Count {
	//每个对象有一个myCount
	public int myCount;
	//整个类（所有的对象）共享一个count
	public static int count;

	
	public int getMyCount() {
		return myCount;
	}

	public void setMyCount(int myCount) {
		this.myCount = myCount;
	}

	public static int getCount() {
		//注意这里不能使用myCount
		return count;
	}

	public static void setCount(int count) {
		//注意这里不能使用myCount
		Count.count = count;
	}

	public static void main(String args[]) {
		Count count1 = new Count();
		count1.setMyCount(1);
		//下面的方法可以，但是编程风格不好，建议Count.setCount(1);
		count1.setCount(1);
		System.out.println("count1.myCount=" + count1.getMyCount());
		System.out.println("count1.count=" + count1.getCount());
		Count count2 = new Count();
		count2.setMyCount(2);
		//下面的方法可以，但是编程风格不好，建议Count.setCount(2);
		count2.setCount(2);
		System.out.println("count1.myCount=" + count1.getMyCount());
		System.out.println("count1.count=" + count1.getCount());

	}

}
