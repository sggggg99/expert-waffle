package ch03;

/**
 * 这个例子演示了 Polymorphism(多态)、override
 * 
 *
 */
public class OverLoadest {

	public static void main(String[] args) {
		OverLoadest o=new OverLoadest();
		//调用了那个方法？
		o.speak();
		//又调用了那个方法？
		o.speak("haha");
		 
		Animal an=new Animal();
		//又调用了那个方法？
		o.speak(an);
		
		Dog dog=new Dog();	
		//又调用了那个方法？
		o.speak(dog);
		//又调用了那个方法？
		o.speak((Animal)dog);
	}
	
	public  void speak() {
		System.out.println(" this is speak()");
	}
	public  void speak(String str) {
		System.out.println(" this is speak(String str)");
	}
	
	public  void speak(Animal an) {
		System.out.println(" this is speak(Animal an)");
	}
	public  void speak(Dog dog) {
		System.out.println(" this is speak(Dog dog)");
	}

}
