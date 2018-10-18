package example;

public class _4_7_CircleDemo {
	public static void main(String[] args) {
		Circle2 c1 = new Circle2(10.0, "»¡°­");
		
		Circle2 c2 = new Circle2(5.0);
		
		Circle2 c3 = new Circle2("³ë¶û");
		
		Circle2 c4 = new Circle2();
	}
}

class Circle2 {
	double radius;
	String color;

	public Circle2(double r, String c) {
		radius = r;
		color = c;

	}

	public Circle2(double r) {
		radius = r;
		color = "ÆÄ¶û";

	}

	public Circle2(String c) {
		radius = 10.0;
		color = c;

	}

	public Circle2() {
		radius = 10.0;
		color = "»¡°­";

	}
}
