package ch13;

public /** 消费者线程 */
class Consumer extends Thread {
	private Stack theStack;

	public Consumer(Stack s, String name) {
		super(name);
		theStack = s;
		start(); // 启动自身消费者线程
	}

	public void run() {
		try {
			String goods;
			while (true) {
				goods = theStack.pop();
				Thread.sleep((long) (Math.random() * 10000L));
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
