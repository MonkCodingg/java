package example;

//�ɹ� ����, ���� ���� ����

public class _4_5_CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle();
		
		myCircle.setRadius(10.0);
		
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	
	}
}

class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	double findArea() {
		return 3.14 * radius * radius;
	}
	
	void show(double x, double y) {
		System.out.printf("������ = %.1f, ���� = %.1f\n", x, y);
	}
}

