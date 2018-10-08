package challenge;

public class Bird implements Countable {
	String name;
	
	public Bird(String name) {
		this.name = name;
		
	}
	public void count() {
		System.out.println("2마리 "+"Bird count  : " + name + "가 2마리 있다.");
	}
	
	public void fly() {
		System.out.println("2마리 "+"Bird fly : " + name +"가 날아간다.");
	}
	
}
