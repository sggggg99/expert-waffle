package ch13;

public /** 堆栈 */
class Stack {
	private String name;
	private String[] buffer = new String[100];
	int point = -1;

	public Stack(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPoint() {
		return point;
	}

	// int a=0;
	// int b=0;
	// int c=0;
	//
	// public void add(int i ,int j) {
	// synchronized(Stack.calss) {
	// a=i;
	// b=j;
	// c=a+b;
	// }
	// }
	

	public synchronized String pop() throws InterruptedException {
	 
		while ((point + 1) <= 0) {
			this.wait();
		}
		String goods = buffer[point];
		buffer[point] = null;
		point--;
		System.out.println(" pop " + goods + " cur stack size  =" + (point + 1));
		this.notifyAll();

		return goods;
		}
	}

	public synchronized void push(String goods) throws InterruptedException {
		while ((point + 1) > 5) {
			this.wait();
		}
		point++;
		buffer[point] = goods;
		System.out.println(" push " + goods + " cur stack size  =" + (point + 1));
		this.notifyAll();
	}
}
