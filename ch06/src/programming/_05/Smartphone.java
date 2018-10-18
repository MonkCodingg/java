package programming._05;

public class Smartphone extends Telephone {
	private String game;

	void playGame() {
		System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
	}

	public Smartphone() {

	}

	public Smartphone(String owner, String game) {
		this.owner = owner;
		this.game = game;
	}
}
