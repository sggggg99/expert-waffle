package ch05.abs;

/**
 * 本类和Pet一起，演示了抽象类
 * @author xxm
 *
 */
public class Dog extends Pet {

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("wang wang!");
	}

}
