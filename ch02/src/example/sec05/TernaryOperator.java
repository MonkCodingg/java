package example.sec05;

public class TernaryOperator {
	public static void main(String[] args) {
		int x = 1;
		int y;
		//x==1�� true�̹Ƿ� y�� 10�� �����Ѵ�.
		y = (x == 1) ? 10 : 20;
		System.out.println(y);
		//x>1�� �����̹Ƿ� y�� x++�� �������� �ʴ´�.
		y = (x > 1) ? x++ : x + 20;
		System.out.println(x);
		System.out.println(y);
	}
}