package example.sec03;

public class CircleDemo {

	public static void main(String[] args) {
		// ������ 5�� Circle ����
		Circle c1 = new Circle(5.0);
		// ������ 6�� Circle ����
		Circle c2 = new Circle(6.0);
		 
		if (c1.compareTo(c2)>0) {
			System.out.println("ù ��° ���� �� ��° ������ ũ��.");
		} else if(c1.compareTo(c2)== 0) {
			System.out.println("�� ���� ũ�Ⱑ ����.");
		}else {
			System.out.println("ù��°�� ���� �� ��° ������ �۴�.");
			
		}
	}

}
