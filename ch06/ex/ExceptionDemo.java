package ch06.ex;

/**
 * 展示的异常的基本处理流程
 * @author cjy
 *
 */
public class ExceptionDemo {
	//一个可能抛出异常的方法(但是不一定抛出异常)，
	public int getBalance(String username) throws Exception {
		//这个地方实际上应该访问数据库查询，为了简单，我们直接判断
		if(username.equals("张三")) {
			return 10000;
		}
		//抛出了一个异常
		throw new Exception("用户"+username+"不存在！");
	}
	
	public static void main(String[] args) {		
		String name="李四";
		ExceptionDemo demo=new ExceptionDemo();
		try {
			//执行下面这句话 可能发生异常
			int balance=demo.getBalance(name);
			//如果发生了异常 下面这句话不会被执行
			System.out.println("The balance of "+name+" is:"+balance);
		}catch(Exception e) {
			//只有发生了异常下面这句话才会被执行
			System.out.println("出事了："+e.getMessage());
			//打印错误堆栈
			e.printStackTrace();
		}
	}
}
