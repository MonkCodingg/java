package pf_KIM.homeWork;

import java.util.Scanner;

public class DoPaperScissorsStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� �� ���� ����
//		Player A �Է� (����:0, ����:1, ��:2) => 2
//				Player B �Է� (����:0, ����:1, ��:2) => 0
//
//				Player B�� �̰���ϴ�. 
		
		// �� �÷��̾� �Է� �ޱ�
		int playAinput = 0, playBinput = 0;
		
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("Player A �Է� (����:0, ����:1, ��:2) => ");
		playAinput = myInput.nextInt();
		
		System.out.println("Player B �Է� (����:0, ����:1, ��:2) => ");
		playBinput = myInput.nextInt();
		
		
		
		if (playAinput == playBinput) {
			System.out.println("Player A�� B�� �����ϴ�.");
		
		} else if ( (playAinput == 0 && playBinput ==2) || (playAinput ==2 && playBinput ==0) ) {
			// �÷��̾� ���� �ϳ��� ����(0)�� ��(2)�� �� ���
			// ���ڰ� ���� ����� �̱��.		
				if( playBinput < playAinput){
					
					System.out.println("Player B�� �̰���ϴ�.");
				}else {
					System.out.println("Player A�� �̰���ϴ�.");
				}
				
		} else if ( playAinput > playBinput) {
			// �÷��̾� ���� �ϳ��� ����(0)�� ��(2)�� ���� �ʴ� ���
			//���ڰ� ū ����� �̱��.
			//����(0) ����(1)
			//����(1) ��(2) 
		
			System.out.println("Player A�� �̰���ϴ�.");

		}else
			System.out.println("Player B�� �̰���ϴ�.");

		
	}

}
