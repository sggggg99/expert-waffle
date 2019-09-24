package ch06.ex;

/**
 * 异常的处理，自己处理
 * @author cjy
 *
 */
public class ExceptionDemo5 {
	public int getBalance(String username) throws Exception {
		// 这个地方实际上应该访问数据库查询，为了简单，我们直接判断
		if (username.equals("张三")) {
			return 10000;
		}
		// 不是什么都能throw
		throw new Exception("用户" + username + "不存在！");
	}

	public int getNewBalance2(String username, int amount) throws Exception   {
		try {
			int orgBalance = this.getBalance(username);
			return orgBalance - amount;
		} catch (Exception e) {
			System.out.println("出事了：" + e.getMessage());
			throw e;
			//return -1;
		}
	}

	public static void main(String[] args)   {
		String name = "张三8";
		ExceptionDemo5 demo = new ExceptionDemo5();

		
			int balance = demo.getNewBalance2(name, 100);
		
		//demo.getBalance(name);
	}

}
