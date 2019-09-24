package ch05.sort;

public class Findmax {

	public Object findMax(Comparable[] a) {		
		Comparable max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max.compareTo(a[i])>0) {
				max=a[i];
			}
		}
		return max;
	}
}
}
