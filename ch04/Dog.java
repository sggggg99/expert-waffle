package ch04;

/**
 * 这个例子 给出了java 中 == 和  equals 的区别
 * 同时 配合Aninaml OverRideTest PolymorphismTest 演示了overload override  
 *
 */
public class Dog extends Animal{
	public String name="Dog";

	public Dog() {

	}

	public static void speak() {
		System.out.println(" this is dog speak!");
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "旺旺";
	}

	/**
	 * 
	 */
//	@Override
	public boolean equals(Object obj) {		
//		((Dog)obj).getName();
		if(obj==null) {
			return false;
		}
		if (obj instanceof Dog) {
			if (((Dog) obj).getName().equals(this.getName())) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

}
