package challenge.q03;

//public class Bird implements Countable {
public class Bird extends Countable {
	String name;
	
	public Bird(String name) {
		super(name, 0);
		
	}
	public void count() {
		System.out.println(name + "�� " + super.num + "���� �ִ�.");
	}
	
	public void fly() {
		System.out.println(super.num +"���� " + name +"�� ���ư���.");
	}
	
}
