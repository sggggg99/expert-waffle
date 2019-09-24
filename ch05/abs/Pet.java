package ch05.abs;
/**
 * 本类和Dog一起，演示了抽象类
 * @author xxm
 *
 */
public abstract class Pet {
	private String name;	
	public Pet() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void speak(); 

}
