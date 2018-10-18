package programming._02;

public class StudentTest {

	public static void main(String[] args) {
		// 다형성
		Person p = new Person();
		p.setName("길동이");
		p.setAge(22);
		Student s = new Student();
		s.setName("황진이");
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
//	person의 갯수를 생각하지 않아도 된다. 부담감이 없다.
		for (Person person : persons) {
			person.show();
		}
// person의 갯수를 알아야 하는 점		
//		for (int i = 0; i < 3; i++) {
//			persons[i].show();
//		}
	}
}
