package ch05.sort;

import java.io.Serializable;

public class Student implements Comparable {
	private String name;
	private int score;

	public Student(String name, int score) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.score = score;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "score=" + score + " name=" + name;
	}

	@Override
	public int compareTo(Object o) {
		
		// 这样强制类型转换 程序不很严谨
		
		Student that = (Student) o;		
//		if(this.getScore()>that.getScore()) {
//			return 1;
//		}else if(this.getScore()<that.getScore()) {
//			return -1;
//		}else {
//			return 0;
//		}
		//return this.name.compareTo(that.name);
		
		
		
		return Integer.valueOf(this.getScore()).compareTo(Integer.valueOf(that.getScore()));
		
	}

}
