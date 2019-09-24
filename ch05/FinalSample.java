package ch05;

/**
 * 本例子演示了变量前面加const和不加const的区别
 * @author cjy
 *
 */
public class FinalSample {
	
	public static void main(String[] args) {
		//反编译本类，看看下面两行代码反编译后得到了什么？为什么会这样？
		//由此引申了什么问题？
		System.out.println(Const.url1);
		System.out.println(Const.url2);
	}
	

}
