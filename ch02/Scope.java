package ch02;
/**
 * 这个例子让大家替换变量定义在不同的地方 
 * 其作用域是不同的
 * 每个变量的作用域 可以理解为在定义这个变量的括号以内
 */
public class Scope {
	  int x=10; //成员变量 作用域 整个类	 
	  int y=20; //成员变量 作用域 整个类
	 
	  
	  public void setX(int ax){		  
		  x=ax;
		  y=ax+1;
		  int z=x;
		  if(z>0){
			  z=z-1;
			 
			  int w=0;
			 // Object obj=new Object();
			  w=5;
		  }
		
		  System.out.println(z);
		//下面这行代码报错 
		  //因为w的作用域仅仅在上面的大括号里面
		  System.out.println(w);
	  }
	  
	  public void setY(int ay){		  
		  y=ay;
		  x=ay-1;
	  }   
	  public static void main(String args[]){
		  Scope scope=new Scope();
		  
		  System.out.println(scope.x);
		  System.out.println(scope.y);
		  scope.setY(123);
		
		  //下面这行代码报错 编译不过去 
		  //因为x是非static变量，不能在static方法里面引用
		  System.out.println(x);
		  //下面这行代码报错 编译不过去
		  //z定义在方法里面，没有定义成为实例变量
		  System.out.println(scope.z);
		  //下面这行代码报错 编译不过去
		  //ax定义在函数参数里面
		  System.out.println(scope.ax);
	  }


}
