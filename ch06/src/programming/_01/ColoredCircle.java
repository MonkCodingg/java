package programming._01;

public class ColoredCircle extends Circle {
	String color;
	ColoredCircle(int radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	void show(){
		System.out.println("�������� "+ this.radius +"�� "+ this.color+" ���̴�.");

	}
	
}
