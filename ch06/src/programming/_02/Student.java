package programming._02;

public class Student extends Person {
	private String studentId;
	
	public Student() {
		this.studentId = "";
	}
	
	public void show() {
		System.out.println("�л�[�̸�: "+ getName() +", ���� "+ getAge() + ", �й� : "+ getStudentId() +"]");
	}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}
