package example;

public class _3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1, 10);
		sum(10, 100);
		sum(100, 1000);
	}
	public static void sum(int i1, int i2) {
		int sum = 0;
		for (int i = i1; i <= i2; i++)
			sum += i;
		System.out.printf("гу(%d~%d) : %d \n", i1,i2,sum);
	}
}
