package programing;

import java.util.Scanner;


public class AlwaysWinPaperScissorsStone_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		System.out.println("Player A  ����, ����, �� �� �ϳ� �Է� => ");
			
		String playInput = myInput.next();
		String playWinOutput ="";
		int inputN;
		int outputN;
		
		if(playInput.equals("����")) {
			inputN = 0;
			playWinOutput ="����";
			System.out.println("����");
			
		}else if(playInput.equals("����")) {
			inputN = 1;
			playWinOutput ="��";
			System.out.println("��");

		}else {
			inputN = 2;
			playWinOutput="����";
			System.out.println("����");

		}
		myInput.close();
		
	}

}
