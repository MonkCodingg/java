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
		System.out.println("Tree ripen : " + name +"에 열매가 잘익었다.");
	}
	
	public void count() {
		System.out.println("Tree count  : " + name +"가 5그루 있다.");
	}
}
