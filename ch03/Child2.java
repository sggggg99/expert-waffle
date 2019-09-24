/**
 * 
 */
package ch03;

/**
 * 本例子演示了一个失败的override的例子
 * 
 * @author cjy
 *
 */
public class Child2 extends Parent {


	public void tset() {

		System.out.println("override in child!");
	}

	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		// 下面这行代码结果和你预想的一样么？为什么会发生这种事情，怎么避免发生这种事情
		ch2.test();
	}
}
