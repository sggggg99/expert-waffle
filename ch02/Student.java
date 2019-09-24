/**
 * 
 */
package ch02;

/**
 * 一个类的例子代码
 *
 */
public class Student {
	//静态变量 类变量 请注意 private static int 的顺序
	private static int count=0;//静态变量  又叫类变量
	private int myCount=0;//成员变量
	private String name;//成员变量
	private String pid;//成员变量
	
	public String getName() {//公开方法
		return name;
	}
	public void setName(String name) {//公开方法
		String s="s";
		this.name = name;		
	}
 
	public String getPid() {//公开方法
		return pid;
	}
	
	//所有方法需要返回类型
	public void setPid(String pid) {//公开方法
		this.pid = pid;
	}

	/**
	 * 静态方法 又叫类方法
	 * @return
	 */
	
	public static int getCount(){
		return count;
	}
	/**
	 * 构造方法 这个方法可以省略
	 * 构造方法不能设置返回类型
	 */
	public  Student() {
		count=count+1;
		myCount=myCount+1;
		System.out.println("count="+count);
		System.out.println("myCount="+myCount);
	}
	
	/**
	 * 私有方法 对外不可见
	 */
	private void play(){
		System.out.println("haha I am playing game!");
	}
	
	
	/**
	 * 共有方法
	 */
	public void study(String language){
		this.play();
		System.out.println("ok I study :"+language);
	}
	public static void main(String[] args) {
		Object o;
		for(int i=0;i<10;i++){
			Student student=new Student();
			//体会一下为什么count 和myCount不一样
			//因为count前面有static myCount没有static
			//如果不能理解 以后会深入讨论
			//student.play();
		}
	}

}
