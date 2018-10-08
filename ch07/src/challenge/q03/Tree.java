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
		System.out.println(super.num + "그루 " + name + "에 열매가 잘익었다.");
	}
	
	public void count() {
		System.out.println(name + "가 " + super.num + "그루 있다.");
	}
}
