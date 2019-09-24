package ch06.ex;

/**
 * 这个例子演示了 没有抛出异常的情况下，凭空的捕捉异常，可能导致编译错误
 * @author cjy
 *
 */
public class ExceptionDemo9 {
	public int getBalance(String username) throws InvalidUserException {
		// 这个地方实际上应该访问数据库查询，为了简单，我们直接判断
		if (username.equals("张三")) {
			return 10000;
		}
		// 不是什么都能throw
		throw new InvalidUserException("用户" + username + "不存在！");
	}

	public int buy(String username, int amount) {
		try {
			int orgBalance = this.getBalance(username);
			if (orgBalance < amount) {
				throw new BalanceException("余额不足！");
			}
			return orgBalance-amount;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return -1;
		}
	}

	public static void main(String[] args) {
		String name = "张三";
		ExceptionDemo9 demo = new ExceptionDemo9();
		try {
			int balance = demo.buy(name, 100);
			System.out.println("购物成功！当前余额：" + balance);
			// 调用上述函数 不可能抛出 InvalidUserException
			//所以下面代码编译报错 
		} catch (RuntimeException e) {
			System.out.println("用户不存在：" + e.getMessage());
			// e.printStackTrace();
			// 调用上述函数 不可能抛出 BalanceException
			//所以下面代码编译报错 
		}catch (InvalidUserException e) {
			System.out.println("用户不存在：" + e.getMessage());
			// e.printStackTrace();
			// 调用上述函数 不可能抛出 BalanceException
			//所以下面代码编译报错 
		} catch (BalanceException e) {
			System.out.println("没钱别买东西：" + e.getMessage());
			// e.printStackTrace();
		} finally {
			System.out.println(name + " 试图访问账户余额");
		}
	}
}
