package challenge.q01;

public class Bird implements Countable {
	String name;
	
	public Bird(String name) {
		this.name = name;
		
	}
	public void count() {
		System.out.println(name + "�� 2���� �ִ�.");
	}
	
	public void fly() {
		System.out.println(name +"�� ���ư���.");
	}
	
}
