package challenge.q03;

//public interface Countable {
//	
//	void count();
//}
abstract class Countable {
	String name;
	protected int num;

	abstract void count();

	public Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}
}
