package programming._05;

public class Smartphone extends Telephone {
	private String game;

	void playGame() {
		System.out.println(owner + "�� " + game + " ������ �ϴ� ���̴�.");
	}

	public Smartphone() {

	}

	public Smartphone(String owner, String game) {
		this.owner = owner;
		this.game = game;
	}
}
