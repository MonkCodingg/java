package example;

public class _3_20 {

	public static void main(String[] args) {
		printScore(99);
		printScore(120);
		
	}

	private static void printScore(int score) {
		if (score <= 0 || score >= 100) {
			System.out.println("�߸��� ���� : " + score);
			return;
		}	
		System.out.println("���� : " + score);
	}
	
}
