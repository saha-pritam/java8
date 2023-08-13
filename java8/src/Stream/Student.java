package Stream;

public class Student implements Comparable<Student> {
	private int roll;
	private String name;
	private int marks;
	
	public Student() {
	}
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		if(this.roll<o.roll)
			return -1;
		else if(this.roll>o.roll)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
