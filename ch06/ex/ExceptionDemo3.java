package ch06.ex;

/**
 * 这个例子演示了 不是什么都可以throw ,throw的对象，必须是Throwable的子类
 * @author cjy
 *
 */
public class ExceptionDemo3 {
	public int getBalance(String username) throws Exception {
		//这个地方实际上应该访问数据库查询，为了简单，我们直接判断
		if(username.equals("张三")) {
			return 10000;
		}
		//不是什么都能throw
		throw new String("用户"+username+"不存在！");
	}
	
	public static void main(String[] args) {		
		String name="张三";
		ExceptionDemo demo=new ExceptionDemo();
		try {
			int balance=demo.getBalance(name);
			Throwable
			System.out.println("The balance of "+name+" is:"+balance);
			//不是什么都能catch
		}catch(String s) {
			System.out.println("出事了："+e.getMessage());
			//e.printStackTrace();
		}finally {
			System.out.println(name+" 试图访问账户余额");
		}
	}

}
