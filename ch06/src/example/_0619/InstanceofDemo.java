package example._0619;

public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Person p = new Person();
		
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
	
		downcast(s);
	}
	
	static void downcast(Person p) {
		if (p instanceof Student) {	
			Student s = (Student) p;
			System.out.println("ok, 하향 타입 변환");
		}
	}
}
