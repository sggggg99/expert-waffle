package ch13;

public class ChildThread extends Thread {
	private long start;
	private long end;	 
	
	public ChildThread(long start, long end ) {
		super();
		this.start = start;
		this.end = end; 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		double sum=0;
		for(long i=start;i<end;i++) {
			sum=sum+i;
		}
		ParentThread.add(sum); 
	}
	
}
