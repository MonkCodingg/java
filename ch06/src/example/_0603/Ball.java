package example._0603;

public class Ball extends Circle {
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + "���̴�.");
	}
	
	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(PI*������*������*������)�̴�.");
	}
	// ���� 6-4
	public void findArea() {
		System.out.println("���̴� 4*(PI*������*������)�̴�.");
	}
}
