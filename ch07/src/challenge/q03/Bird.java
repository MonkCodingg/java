package challenge.q03;

//public class Bird implements Countable {
class Bird extends Countable {
	public Bird(String name, int num) {
		super(name, num);
	}

	public void count() {
		System.out.println(name + "�� " + num + "���� �ִ�.");
	}

	public void fly() {
		System.out.println(num + "���� " + name + "�� ���ư���.");
	}
}
