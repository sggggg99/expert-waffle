/**
 * 
 */
package ch01;

/**
 * @author chen jinyan
 *
 */
public class MainDemo {

	/**
	 * 整个程序的主方法
	 * @param args 字符串数组参数
	 * 这段程序的目的在于让大家学会如何从命令行中取得参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("该程序有"+args.length+" 个参数");
		System.out.println("这些参数分别如下：");
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}

	}
	
	/**
	 * 计算两个整数和的方法
	 * @param a 第一个整数
	 * @param b 第二个整数
	 * @return 两个整数的加和
	 */
	public int add(int a,int b){
		return a+b;
	}

	
	/**
	 * 计算两个整数和的方法
	 * @param a 第一个整数
	 * @param b 第二个整数
	 * @return 两个整数的加和
	 * @author chen jinyan
	 * @since jdk1.2
	 * @see add
	 * @deprecated  正是这行导致sum带横线
	 * 这个例子展示了 @后面跟特定保留字时候的效果
	 */
	public int sum(int a,int b){
		return a+b;
	}

}
