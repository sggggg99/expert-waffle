package ch13;

import java.util.Timer;
import java.util.TimerTask;

/**
 * timertask例子
 * 
 * @author cjy
 *
 */

public class TimerTaskDemo {

	public TimerTaskDemo() {
		// TODO Auto-generated constructor stub
	}

	// public static void main(String[] args) {
	// Timer timer = new Timer();
	// timer.schedule(new MyTimerTask(), 0, 1000L);
	// }

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			int i = 0;
			public void run() {
				System.out.println(i++);
			}
		}, 0, 1000L);
	}
}
