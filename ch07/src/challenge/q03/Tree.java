package challenge.q03;

//public class Tree implements Countable {
class Tree extends Countable {
	public Tree(String name, int num) {
		super(name, num);
	}

	public void count() {
		System.out.println(name + "�� " + num + "�׷� �ִ�.");
	}

	public void ripen() {
		System.out.println(num + "�׷� " + name + "�� ���Ű� �� �;���.");
	}
}
