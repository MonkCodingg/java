package example;

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

