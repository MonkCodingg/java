package programming._02;

public class StudentTest {

	public static void main(String[] args) {
		// ������
		Person p = new Person();
		p.setName("�浿��");
		p.setAge(22);
		Student s = new Student();
		s.setName("Ȳ����");
		s.setAge(23);
		s.setStudentId("100");
		ForeignStudent f = new ForeignStudent();
		f.setName("Amy");
		f.setAge(30);
		f.setStudentId("200");
		f.setNationality("U.S.A");
		
		Person[] persons = {
			p,
			s,
			f,
		};
//	person�� ������ �������� �ʾƵ� �ȴ�. �δ㰨�� ����.
		for (Person person : persons) {
			person.show();
		}
// person�� ������ �˾ƾ� �ϴ� ��		
//		for (int i = 0; i < 3; i++) {
//			persons[i].show();
//		}
	}
}
