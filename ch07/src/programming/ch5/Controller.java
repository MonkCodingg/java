package programming.ch5;

public abstract class Controller {
	boolean power;
	public Controller(boolean power) {
		this.power = power;
	}
	public void show() {
		System.out.println(this.getName());
	}
	
	public abstract String getName();
}
