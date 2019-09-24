package ch01;

/**
 * 这个例子展示了如何对不同类型的对象赋值 
 */

public class AssignDemo {

	public static void main(String[] args) {
		int i=1;//直接赋值
		boolean isOk=true;//直接赋值
		char grade='A';//直接赋值
		double d=12.34;//直接赋值
		
		Integer myI=new Integer(1);//通过 new 赋值
		Boolean myIsOk=new Boolean(true); //通过 new 赋值
		Character myGrade=new Character('A');//通过 new 赋值
		Double myD=new Double(12.34);//通过 new 赋值
		
		Man man=new Man();//通过 new 赋值
		man.setName("tom");//改变属性
		System.out.println(man.getName());
		Man man2=man;//传递了引用
		man.setName("jack");//改变属性
		System.out.println(man.getName());
		//这行代码 验证了传递的是引用
		System.out.println(man2.getName());
		
		String str="abc";//直接赋值
		Integer myI2=1;//jdk1.5以后做了隐含转换
		Boolean myIsOk2=true; //jdk1.5以后做了隐含转换
		Character myGrade2='A' ;//jdk1.5以后做了隐含转换
		Double myD2=12.34;//jdk1.5以后做了隐含转换
		
	}

}
