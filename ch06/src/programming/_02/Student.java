package programming._02;

public class Student extends Person {
	private String studentId;
	
	public Student() {
		this.studentId = "";
	}
	
	public void show() {
		System.out.println("학생[이름: "+ getName() +", 나이 "+ getAge() + ", 학번 : "+ getStudentId() +"]");
	}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}
