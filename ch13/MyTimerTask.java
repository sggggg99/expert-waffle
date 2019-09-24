package ch13;

import java.util.TimerTask;
/**
 * timerTask的实现
 * @author cjy
 *
 */
public class MyTimerTask extends TimerTask {
	private int i = 0;
	public void run() {
		System.out.println(i++);
	}
}
