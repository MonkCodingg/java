package example;

public class AbstaractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n", c.findArea());
		
		Rectangle r = new Rectangle(3, 4);
		r.draw();
		System.out.println("");
	}

}