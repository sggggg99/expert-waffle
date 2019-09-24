package ch06.ex;

/**
 * 异常引发的问题 buy 函数为什么会有编译错误？？
 * @author cjy
 *
 */
public class ExceptionDemo20 {

	public ExceptionDemo20() {
		// TODO Auto-generated constructor stub
	}
	public int getBalance(String username) throws InvalidUserException {
		// 这个地方实际上应该访问数据库查询，为了简单，我们直接判断
		if (username.equals("张三")) {
			return 10000;
		}
		// 不是什么都能throw
		throw new InvalidUserException("用户" + username + "不存在！");
	}

	/**
	 * 这个函数为什么编译不过？？
	 * @param username
	 * @param amount
	 * @return
	 * @throws Exception 
	 */
	public int buy(String username, int amount) throws Exception {
		try {
			int orgBalance = this.getBalance(username);
			if (orgBalance < amount) {
				throw new BalanceException("余额不足！");
			}
			return orgBalance-amount;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//throw e;
			//e.printStackTrace();
			//throw new Exception(e.getMessage());
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new ExceptionDemo20().buy("ssdf",100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
