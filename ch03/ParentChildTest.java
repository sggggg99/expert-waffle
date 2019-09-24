package ch03;


/**
 * 这个例子再次演示的多态Polymorphism
 * @author cjy
 *
 */
public class ParentChildTest {

	public static void main(String[] args) {
		// 这个例子再次演示的多态Polymorphism
		// 注意Parent.test 的代码
		// 思考一下Parent.test()中 this.getClass()
		Parent p=new Parent();
		p.test();
		
		Child c=new Child();
		c.test();
		
		Parent p2=c;
		p2.test();
		
		Parent p3=(Parent)c;
		p3.test();
		

	}

}
