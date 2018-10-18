package programming.dice;

public class Dice {
	private int face;

	public int getFace() {
		return face;
	}

	public void setFace(int face) {
		this.face = face;
	}

	public int roll() {
		double r = Math.random();

		int res = (int) ((r * 6) + 1);

//		System.out.println(res);
		return res;
	}

}
