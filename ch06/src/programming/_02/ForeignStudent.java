package programming._02;

public class ForeignStudent extends Student {
	private String nationality;
	
	
	public void show() {
		System.out.println("외국학생[이름: "+ getName() 
						+", 나이 "+ getAge() 
						+ ", 학번 : "+ getStudentId() 
						+", 국적 : "+ getNationality() +"]");
	}
	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
