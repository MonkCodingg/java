package example.sec05;

public class CompLogicDemo {
	public static void main(String[] args) {
		int x = 0, y = 1;
		//(x < 1) => true�� �ȴ�.
		//(y-- < 1)�������� �����Ƿ� y���� ��ȭ�� ����.
		System.out.println((x < 1) || (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);

		x = 0;
		y = 1;
		//(x < 1)true�� �ȴ�.
		//(y-- < 1)�����ؾ� �ϹǷ� y���� 1�����Ѵ�.
		System.out.println((x < 1) | (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);
	}
}