package challenge.q01;

public class Tree implements Countable {
	String name;
	public Tree(String name) {
		this.name = name;
		
	}
//	public Tree(String name) {
//		super(name) = name;
//		
//	}
	public void ripen() {
		System.out.println(name +"�� ���Ű� ���;���.");
	}
	
	public void count() {
		System.out.println(name +"�� 5�׷� �ִ�.");
	}
}
