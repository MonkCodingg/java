package example;

public class _3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		System.out.println("increment() �޼��带 ȣ���ϱ� ���� x��" + x);
		increment(x);
		System.out.println("increment() �޼��带 ȣ���ϱ� ���� x��" + x);
	}
	
	public static void increment(int n) {
		System.out.println("increment() �޼��带 ������ ���� n��" + n);
		n++;
		System.out.println("increment() �޼��带 ���� ���� ���� n��" + n);	
	}
}
