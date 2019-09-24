package ch06.ex;

/**
 * 异常的处理，向上抛出
 * @author cjy
 *
 */
public class ExceptionDemo4 {
	public int getBalance(String username) throws Exception {
		// 这个地方实际上应该访问数据库查询，为了简单，我们直接判断
		if (username.equals("张三")) {
			return 10000;
		}
		// 不是什么都能throw
		throw new Exception("用户" + username + "不存在！");
	}

	public int getNewBalance1(String username, int amount) throws Exception {
		int orgBalance = this.getBalance(username);
		return orgBalance - amount;
	}

	

	public static void main(String[] args) {
		String name = "张三";
		ExceptionDemo4 demo = new ExceptionDemo4();
		try {
			int balance = demo.getNewBalance1(name,100);
			System.out.println("The new balance of " + name + " is:" + balance);
			// 不是什么都能catch
		} catch (Exception e) {
			System.out.println("出事了：" + e.getMessage());
			// e.printStackTrace();
		} finally {
			System.out.println(name + " 试图访问账户余额");
		}
	}

}
