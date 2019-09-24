package ch08;

import java.util.Comparator;

/**
 * 比较器
 * @author cjy
 *
 */
public class StudentComparator implements Comparator<Student> {
	public StudentComparator(EnumField field, EnumOrder order) {
		super();
		this.field = field;
		this.order = order;
	}

	private EnumField field;
	private EnumOrder order;
	public StudentComparator() {
	// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub

		int result=0;
		if(field==EnumField.id) {
			result=o1.getId().compareTo(o2.getId());
		}else if(field==EnumField.name) {
			result=o1.getName().compareTo(o2.getName());
		}else if(field==EnumField.score) {			
			result=Integer.valueOf(o1.getScore()).compareTo(Integer.valueOf(o2.getScore()));
		}else if(field==EnumField.height) {
			result=Integer.valueOf(o1.getHeight()).compareTo(Integer.valueOf(o2.getHeight()));
		}else {
			throw new java.lang.IllegalArgumentException("Invlaid field:"+field);
		}
		if(order==EnumOrder.asc) {
			return result;
		}else {
			return -result;
		}
			 
	}
	
}
