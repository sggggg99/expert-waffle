package ch16;

public interface  Formula {

	double add(int a,int b);

    default double sqrt(int a) {
    	
        return Math.sqrt(a);
    }

}
