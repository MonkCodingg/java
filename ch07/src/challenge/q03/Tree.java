package challenge.q03;

//public class Tree implements Countable {
public class Tree extends Countable {
	String name;
	
	public Tree(String name) {
		
		super(name, 0);
	}
//	public Tree(String name) {
//		super(name) = name;
//		
//	}
	public void ripen() {
		System.out.println(super.num + "�׷� " + name + "�� ���Ű� ���;���.");
	}
	
	public void count() {
		System.out.println(name + "�� " + super.num + "�׷� �ִ�.");
	}
}
