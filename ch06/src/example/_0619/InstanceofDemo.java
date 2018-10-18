package example._0619;

public class InstanceofDemo {

	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		// 앞의 변수가 뒤 타입이 맞는지
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
	
		downcast(s);
	}
	
	static void downcast(Person p) {
		if (p instanceof Student) {	
			//캐스트를 하기전에는 접근 못했던 변수 매소드
			//캐스트를 한 후 접근 못했던 변수 메소드 접근가능 
			Student s = (Student) p;
			System.out.println("ok, 하향 타입 변환");
		}
	}
}
