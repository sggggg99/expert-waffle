package ch04;

public class Son extends Father{
	  String sonName;
	  public Son( ){
		 // super();
	    System.out.println("I am default constrctor of son!");
	  }
	  /**
	   * 本方法演示了this的作用
	   * 不可以把 sonName 前面的this去掉
	   * @param sonName
	   */
	  public Son(String sonName){
		 // super();
	    this.sonName=sonName;    
	  }
	  public Son(String sonName,String fatherName){
	    super(fatherName);

	    this.sonName=sonName;    
	  }

}
