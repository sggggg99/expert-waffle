package ch06;

import java.util.ArrayList;
import java.util.List;

/**
 * 本程序和 Father Son类一起，演示的一个类static 构造方法 析构函数 的调用过程
 * 
 * @author cjy
 *
 */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) throws InterruptedException {
		Object o;
		
		Son s = new Son();
		while(true){			
			s = new Son();
			// 强制系统回收内存
			//System.gc();
			//Thread.sleep(3000);
		}
	}

}
