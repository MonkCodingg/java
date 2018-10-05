package programming._02;

public class Person {
	private String name;
	private int age;
	
	public Person (){
		this.name = "";
		this.age = 0;
	}
	
	public void show() {
		System.out.println("사람[이름: "+ name +", 나이 "+ age +"]");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
