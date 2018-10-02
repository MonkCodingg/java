package example;

//¸É¹ö º¯¼ö, Áö¿ª º¯¼ö Â÷ÀÌ
public class _4_8_CircleDemo {
	public static void main(String[] args) {
		_4_8_Circle c1 = new _4_8_Circle("»¡°­");
		_4_8_Circle c2 = new _4_8_Circle(5.0);
		_4_8_Circle c3 = new _4_8_Circle("³ë¶û");
		_4_8_Circle c4 = new _4_8_Circle();
	}
}

class _4_8_Circle {
	double radius;
	String color;
	
	public _4_8_Circle (double radius, String color) {
		this.radius = radius;
		this.color = color;
	
	}
	
	public _4_8_Circle (double radius) {
		this(radius, "ÆÄ¶û");
		
	}
	
	public _4_8_Circle (String color) {
		this(10.0, color);
	}
	
	public _4_8_Circle () {
		this(10.0, "»¡°­");
	}
}

