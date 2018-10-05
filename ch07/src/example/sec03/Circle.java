package example.sec03;

class Circle implements Comparable {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
// Object 모든 java 클래스 조상 클래스
	public int compareTo (Object o) {
		Circle c = (Circle) o;
		if (this.radius > c.radius) {
			return 1;
		} else if(this.radius == c.radius) {
			return 0;
		} else
			return -1;
	}
}
