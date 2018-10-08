package challenge.q03;

//public class Bird implements Countable {
public class Bird extends Countable {
	String name;
	
	public Bird(String name) {
		super(name, 0);
		
	}
	public void count() {
		System.out.println(name + "가 " + super.num + "마리 있다.");
	}
	
	public void fly() {
		System.out.println(super.num +"마리 " + name +"가 날아간다.");
	}
	
}
