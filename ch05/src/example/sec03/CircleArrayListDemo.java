package example.sec03;

import java.util.ArrayList;

//class Circle{
//	double radius;
//	
//	public Circle(double radius) {
//		this.radius = radius;
//	}
//
//	public double getRadius() {
//		return radius;
//	}
//
//	double findArea() {
//		return 3.14 * radius *radius;
//	}
//	
//}

public class CircleArrayListDemo {

	public static void main(String[] args) {
//		실수하는 부분
//		ArrayList<Circle> circles = null; 

		ArrayList<Circle> circles = new ArrayList<Circle>();

		for (int i = 0; i < 5; i++) {
			Circle c = new Circle(i + 1.0);
			circles.add(c);
			System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", c.radius, c.findArea());

		}
	}

}
