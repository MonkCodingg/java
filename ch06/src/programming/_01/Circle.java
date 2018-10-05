package programming._01;

public class Circle {
	int radius;
	void show() {
		System.out.println("반지름이 "+ this.radius +"인 원이다.");
	}
	Circle() {
		
	}
	
	Circle (int radius){
		this.radius= radius;
	}
}
