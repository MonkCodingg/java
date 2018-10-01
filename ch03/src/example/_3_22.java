package example;

public class _3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		System.out.println("increment() 메서드를 호출하기 전의 x는" + x);
		increment(x);
		System.out.println("increment() 메서드를 호출하기 전의 x는" + x);
	}
	
	public static void increment(int n) {
		System.out.println("increment() 메서드를 시작할 때의 n은" + n);
		n++;
		System.out.println("increment() 메서드를 끝날 때의 때의 n은" + n);	
	}
}
