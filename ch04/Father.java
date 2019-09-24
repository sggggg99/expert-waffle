package ch04;

public class Father {
	String fatherName;

	public Father() {
		System.out.println("public Father() 被调用");
		this.fatherName = "未知";
	}

	public Father(String fatherName) {
		System.out.println("public Father(String fatherName) 被调用");
		this.fatherName = fatherName;
	}

}
