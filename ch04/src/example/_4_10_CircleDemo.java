package example;

public class _4_10_CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4_10_Circle myCircle = new _4_10_Circle(10.0);
		_4_10_Circle yourCircle = new _4_10_Circle(5.0);
		
		System.out.println("���� ���� : " + _4_10_Circle.numOfCircles);
		System.out.println("���� ���� : " + yourCircle.numCircles);
	}
	
	void print() {
		System.out.println("���� ����� ���� �����Դϴ�.");
	}
	
}

class _4_10_Circle {
	double radius;
	static int numOfCircles = 0;
	int numCircles = 0;
	
	public _4_10_Circle(double radius) {
		
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
	
}
