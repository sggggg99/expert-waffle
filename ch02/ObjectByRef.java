package ch02;

/**
 * 这段程序 展现了java中的=赋值，传递的是引用
 * 同时也说明了什么是不变类型
 */
public class ObjectByRef {

	public static void main(String[] args) {
		Student student=new Student(); 
		Student student2=student;
		
		//这段程序 展现了java中的=赋值，传递的是引用
		student.setName("tom");
		System.out.println("student.name="+student.getName());
		System.out.println("student2.name="+student2.getName());		
		//这段程序 展现了java中的=赋值，传递的是引用
		student2.setName("jack");
		//student2=new Student("jack");
		System.out.println("student.name="+student.getName());
		System.out.println("student2.name="+student2.getName());
		
		//下面这段代码 为什么所谓的传递的引用规则不适用了？
		Integer i=new Integer(18);
		System.out.println("i="+i);
		Integer j=i;
		System.out.println("j="+j);
		j=new Integer(20);
		//j.setValue(20);
		//j.setValue(20);
		System.out.println("i="+i);
		
		//下面这段代码 为什么所谓的传递的引用规则不适用了？
		String str1="tom";
		String str2=str1;
		str2="jack";
		//str2.setValue("jack");
		System.out.println("str1="+str1);//???
	}

}
