package ch13;

public 
/** 生产者线程 */
class Producer extends Thread {
	private Stack theStack;

	public Producer(Stack s, String name) {
		super(name);
		theStack = s;
		start(); // 启动自身生产者线程
	}

	public void run() {
		try {
			String goods;
			while (true) {
				goods = "goods" + (SyncTest.index++);
				theStack.push(goods);
				Thread.sleep((long) (Math.random() * 1000L));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

