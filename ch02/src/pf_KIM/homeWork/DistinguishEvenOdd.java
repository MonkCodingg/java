package pf_KIM.homeWork;
import java.util.Scanner;

public class DistinguishEvenOdd {

	public static void main(String[] args) {
		// Ȧ�� ¦�� �Ǻ�
		int inputN =0;
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		inputN = myInput.nextInt();
		
		if (inputN%2 == 1) {
			System.out.println("Ȧ�� �Դϴ�.");
			
		} else
			System.out.println("¦�� �Դϴ�.");
		
		
	}

}
