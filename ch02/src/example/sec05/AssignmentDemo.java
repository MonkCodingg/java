package example.sec05;

public class AssignmentDemo {
	public static void main(String[] args) {
		int value = 1;
		value += 1;
		System.out.println("�� = " + value);
		value -= 1;
		System.out.println("�� = " + value);
		//value�� ó�� ���� 1�̸�, 
		//<<3 ������ �����ϸ� �� �� ���ϹǷ�
		//��� ���� 8�̴�.
		value <<= 3;
		System.out.println("�� = " + value);
		value %= 3;
		System.out.println("�� = " + value);
	}
}