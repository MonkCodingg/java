package challenge;

public class Bird implements Countable {
	String name;
	
	public Bird(String name) {
		this.name = name;
		
	}
	public void count() {
		System.out.println("2���� "+"Bird count  : " + name + "�� 2���� �ִ�.");
	}
	
	public void fly() {
		System.out.println("2���� "+"Bird fly : " + name +"�� ���ư���.");
	}
	
}
