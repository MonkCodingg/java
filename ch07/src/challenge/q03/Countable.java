package challenge.q03;


//public interface Countable {
//	
//	void count();
//}
public abstract class Countable {
	protected String name;
	protected int num;
	//생성자
	public Countable (String name, int num) {
		this.name = name;
		this.num = num;
	}
	//추상 메서드
	//메서드 본체를 완성하지 못한 메서드. 무엇을 할지는 선언할 수 있지만
	// 어떻게 할지는 정의할 수 없음
	abstract void count();
	
}
