package programming._05;

public class Telephone extends Phone {
	private String when;
	public Telephone() {
		
	}
	public Telephone(String owner, String when) {
		this.owner = owner;
		this.when = when;
	}
	void autoAnswering() {
		System.out.println(owner+"가 없다. "+when+"내일 전화 줄래.");
	}
}
