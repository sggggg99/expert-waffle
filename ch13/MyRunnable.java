package ch13;

/**
 * 线程的第二种实现方式
 * 
 * @author cjy
 *
 */
public class MyRunnable implements Runnable {
	int a = 0; // 实例变量

	public void run() {
		
		for (a = 0; a < 10; a++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + " " + a);
		}
	}

	public static void main(String args[]) {
		MyRunnable mr = new MyRunnable();
		MyRunnable mr2 = new MyRunnable();
		Thread t1 = new Thread(mr); // Thread(Runnable r)
		Thread t2 = new Thread(mr);
		t1.start();
		t2.start();
	}
}
