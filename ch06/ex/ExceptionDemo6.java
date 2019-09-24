package ch06.ex;

/**
 * 如何对异常分类处理
 * @author cjy
 *
 */
public class ExceptionDemo6 {
	public int getBalance(String username) throws InvalidUserException {
		// 这个地方实际上应该访问数据库查询，为了简单，我们直接判断
		if (username.equals("张三")) {
			return 10000;
		}
		// 不是什么都能throw
		throw new InvalidUserException("用户" + username + "不存在！");
	}

	public int buy(String username, int amount) throws BalanceException, InvalidUserException {
		 
			int orgBalance = this.getBalance(username);
			if(orgBalance<amount) {
				throw new BalanceException ("余额不足！");
			}
			return orgBalance - amount;
		
	}

	public static void main(String[] args) {
		String name = "张三o";
		ExceptionDemo6 demo = new ExceptionDemo6();
		try {
			int balance = demo.buy(name,100000);
			System.out.println("购物成功！当前余额："+balance);
			// 不是什么都能catch
		} catch (InvalidUserException e) {
			System.out.println("用户不存在：" + e.getMessage());
			// e.printStackTrace();
		} catch (BalanceException e) {
			System.out.println("没钱别买东西：" + e.getMessage());
			// e.printStackTrace();
		} finally {
			//不管发生什么情况，都要执行如下代码
			System.out.println(name + " 试图访问账户余额");
		}
	}


}
