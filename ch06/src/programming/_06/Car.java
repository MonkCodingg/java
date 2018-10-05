package programming._06;

public class Car extends Vehicle {
	private int displacement;
	private int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	
	void show() {
		System.out.println("Car show()");
	}
}
