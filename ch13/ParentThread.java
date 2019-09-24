package ch13;

/**
 * 一个简单的多线程例子
 * @author cjy
 *
 */
public class ParentThread {
	private static double sum = 0;

	public ParentThread() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int threadCount = 100;
		long start = 0;
		long end = 1000000000L;
		//计算start end的加和
		Thread[] threads = new Thread[threadCount];
		long l = System.currentTimeMillis();
		for (int i = 0; i < threads.length; i++) {
			long tStart = i * (end - start) / (threads.length + 1);
			long tEnd = (i + 1) * (end - start) / (threads.length + 1);
			if (i == threads.length - 1) {
				tEnd = end;
			}
			//创建线程
			threads[i] = new ChildThread(tStart, tEnd);
		}
		
		for (int i = 0; i < threads.length; i++) {
			//启动线程
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			try {
				//等待线程结束
				threads[i].join();
				System.out.println("thread["+i+"] finished! "+(System.currentTimeMillis()-l)+" ms cost!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("sum=" + sum + " " + (System.currentTimeMillis() - l) + " ms cost!");
	}

	/**
	 * 注意synchronized 修饰符
	 * @param threadSum
	 */
	public synchronized static void add(double threadSum) {
		sum = sum + threadSum;
	}

}
