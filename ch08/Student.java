package ch08;

public class Student implements Comparable {

	public Student(String id, String name, int score, int height) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.height = height;
	}

	private String id;
	private String name;
	private int score;
	private int height;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Student) {
			Student that = (Student) o;
			return this.id.compareTo(that.id);
		} else {
			return -1;
		}

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
		// return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student that = (Student) obj;
			return that.id == this.id;
		} else {
			return false;
		}

	}
}
