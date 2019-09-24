package ch13;

/**
 *  ThreadLocal 变量
 * @author cjy
 *
 */
public class MyThreadLocal extends Thread {
	public void run() {
		for(int i=0;i<5;i++){
			try {
				Thread.currentThread().getName();
				String value=this.getName()+" "+i;
				Print.getSession().set(value);
				Thread.sleep(1000);
				Print.printline();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}
