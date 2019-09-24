package ch06.ex;

public class ExceptionDemo2 {
	public int getBalance(String username) 
			throws Exception {
		//这个地方实际上应该访问数据库查询，为了简单，我们直接判断
		if(username.equals("张三")) {
			return 10000;
		}
		throw new Exception("用户"+username+"不存在！");
	}
	
	public static void main(String[] args) {		
		String name="张三";
		ExceptionDemo demo=new ExceptionDemo();
		try {
			int balance=demo.getBalance(name);
			//不发生异常时候 下面代码会被执行
			System.out.println("The balance of "+name+" is:"+balance);			
		}catch(Exception e) {
			//发生异常的时候 下面代码会被执行			
			System.out.println("出事了："+e.getMessage());
			//e.printStackTrace();
		}finally {
			//不管是否发生异常，下面代码都会被执行
			System.out.println(name+" 试图访问账户余额");
		}
	}
}
