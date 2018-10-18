package example;

public class _4_4_CircleDemo {

	public static void main(String[] args) {
		Circle3 myCircle = new Circle3();

		myCircle.radius = 10.0;

		myCircle.show(myCircle.radius, myCircle.findArea());
	}
}
class Circle3 {
	double radius;

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}
