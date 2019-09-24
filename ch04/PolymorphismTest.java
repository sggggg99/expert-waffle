package ch04;

import java.util.List;
import java.util.Set;

/**
 * 这个例子演示了 static对多态的影响 比较一下ch03.PolymorphismTest
 * 
 * @author cjy
 *
 */

public class PolymorphismTest {

	public static void main(String[] args) {

		Animal an = new Animal();
		Dog dog = new Dog();
		// 1 下面两行运行结果是什么？为什么？
		an.speak();
		dog.speak();

		an = dog;
		// 调用了Dog的还是Aniaml的？？ 为什么？！！！
		an.speak();

		// 调用了Dog的还是Aniaml的？？ 为什么？
		Object o = new Object();
		o = dog;
		// 调用了Dog的还是Aniaml的？？ 为什么？
		((Animal) o).speak();// 强制类型转换
		// 调用了Dog的还是Aniaml的？？ 为什么？
		((Dog) o).speak();// 强制类型转换
		//想一想这个例子运行结果为什么和ch03.PolymorphismTest不一样？
		//为什么？
		System.out.println(((Animal) o).name);
		System.out.println(((Dog) o).name);

	}

}
