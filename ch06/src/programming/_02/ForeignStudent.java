package programming._02;

public class ForeignStudent extends Student {
	private String nationality;
	
	
	public void show() {
		System.out.println("�ܱ��л�[�̸�: "+ getName() 
						+", ���� "+ getAge() 
						+ ", �й� : "+ getStudentId() 
						+", ���� : "+ getNationality() +"]");
	}
	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
