package ch13;

/**
 * 线程的例子
 * 
 * @author cjy
 *
 */
public class MyThread extends Thread {
	public void run() {
		for (int a = 0; a < 10; a++) {
			try {
//				long l=System.currentTimeMillis();
//				//double d=0;
//				while((System.currentTimeMillis()-l)<1000) {
//					//d=d+1;
//					Thread.sleep(1000-(System.currentTimeMillis()-l));
//				}
				Thread.sleep(100);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + " " + a);
		}
	}

	public static void main(String args[]) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		//注意 运行的结果是两个线程交替打印，不是传统的一个执行完了，另外一个再执行
		t1.start();
		//System.out.println("end!");
		t2.start();
		try {
			//t1.join();
			//t2.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end!");
	}
}
