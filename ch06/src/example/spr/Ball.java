package example.spr;

public class Ball extends Circle {
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + "공이다.");
	}
	
	public void findVolume() {
		System.out.println("부피는 4/3*(PI*반지름*반지름*반지름)이다.");
	}
	// 예제 6-4
	public void findArea() {
	// 예제 6-5
	findRadius();
	// 예제 6-5
	super.findArea();
	
	// super.secret();
	
	System.out.println("넓이는 4*(PI*반지름*반지름)이다.");
	
	}
	
}
