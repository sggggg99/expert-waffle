package ch03;

 

/**
 * 这个例子演示了 Polymorphism(多态)
 * @author cjy
 *
 */
public class PolymorphismTest {

	public static void main(String[] args) {

		Animal an = new Animal();
		Dog dog = new Dog();
		//1 下面两行运行结果是什么？为什么？
		an.speak();
		dog.speak();

		an = dog; 
		//调用了Dog的还是Aniaml的？？ 为什么？！！！
		an.speak();

		// 调用了Dog的还是Aniaml的？？ 为什么？
		Object o = new Object();
		o = dog;
		// 调用了Dog的还是Aniaml的？？ 为什么？
		((Animal) o).speak();// 强制类型转换
		// 调用了Dog的还是Aniaml的？？ 为什么？
		((Dog) o).speak();// 强制类型转换

		// 看看o的类型变化，有助于理解((Animal) o).speak();
		o = new Object();
		System.out.println(o.getClass().toString());
		
		o = dog;
		// 看看o的类型变化，有助于理解((Animal) o).speak();
		
		System.out.println(o.getClass().toString());
		//不管怎么强制类型转换 o的类型 始终是Dog
		System.out.println(((Animal) o).getClass().toString());
		System.out.println(((Dog) o).getClass().toString());
		//看到getClass().toString()的结果，理解speak()的运行结果了吗。
		System.out.println(((Animal) o).name);
		System.out.println(((Dog) o).name);

	}

}
