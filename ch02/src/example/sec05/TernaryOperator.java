package example.sec05;

public class TernaryOperator {
	public static void main(String[] args) {
		int x = 1;
		int y;
		//x==1이 true이므로 y에 10을 대입한다.
		y = (x == 1) ? 10 : 20;
		System.out.println(y);
		//x>1이 거짓이므로 y에 x++는 수행하지 않는다.
		y = (x > 1) ? x++ : x + 20;
		System.out.println(x);
		System.out.println(y);
	}
}