package ch13.reflect;

public class Student {
	private String name;
	private String school;
	private Integer age;
	private Integer id;
	public Student() {
		this("unset", 0);
		System.out.println("=============================");
	}
	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
