package ch13;

import java.util.ArrayList;
import java.util.List;

/**
 * 一种奇葩的排序算法
 * 
 * @author cjy
 *
 */
public class MySort extends Thread {
	private List<Integer> list;
	private int value;

	public MySort(List<Integer> list, int value) {
		this.list = list;
		this.value = value;
	}

	@Override
	public void run() {
		try {
			this.sleep(value);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.add(value);
	}

	public static void main(String[] args) {
		int[] arrays = { 1230, 454, 1, 30, 60, 300, 89, 1999, 765 };
		List<Integer> list = new ArrayList<Integer>();
		MySort[] threads=new MySort[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			 new MySort(list, arrays[i]).start();;			
		}		
		try {
			 //等待每个线程的排序结束
			while (list.size() < arrays.length) {
				Thread.sleep(100L);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
