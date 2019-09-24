package ch04;

import java.util.Set;

/**
 * 本例子演示了this的用法
 * 
 * @author cjy
 *
 */
public class ThisSample {
	private String name;

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ThisSample(String name) {
		// this第二种用法，限定变量范围
		// name="abc";
		this.name = name;
	}

	public static void main(String[] args) {
		// this的错误用法 static 方法里面不能调用this
		String temp = "123";
		new ThisSample(temp);
		System.out.println(temp);

		// 这行代码为什么报错？
		this.name = "tom";
	}

	public void errorDemo() {
		// 这行代码为什么报错
		this("no name");
	}

}
