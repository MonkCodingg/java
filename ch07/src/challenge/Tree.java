package challenge;

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
		System.out.println("Tree ripen : " + name +"�� ���Ű� ���;���.");
	}
	
	public void count() {
		System.out.println("Tree count  : " + name +"�� 5�׷� �ִ�.");
	}
}
