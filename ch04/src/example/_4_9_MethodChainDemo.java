package example;

public class _4_9_MethodChainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// person 타입의 변수에 펄슨 생성자 결과 객체 주소를 저장함
		Person person = new Person();
		person.setName("민국").setAge(21).sayHello();
	}

}

class Person {
	String name;
	int age;

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public void sayHello() {
		System.out.println("안녕, 나는 " + name + "이고 " + age + "살아야.");
	}
}
