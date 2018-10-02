package pf_KIM.homeWork;

import java.util.Scanner;

public class DoPaperScissorsStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위 바위 보 게임 수행
//		Player A 입력 (가위:0, 바위:1, 보:2) => 2
//				Player B 입력 (가위:0, 바위:1, 보:2) => 0
//
//				Player B가 이겼습니다. 
		
		// 두 플레이어 입력 받기
		int playAinput = 0, playBinput = 0;
		
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("Player A 입력 (가위:0, 바위:1, 보:2) => ");
		playAinput = myInput.nextInt();
		
		System.out.println("Player B 입력 (가위:0, 바위:1, 보:2) => ");
		playBinput = myInput.nextInt();
		
		
		
		if (playAinput == playBinput) {
			System.out.println("Player A와 B가 비겼습니다.");
		
		} else if ( (playAinput == 0 && playBinput ==2) || (playAinput ==2 && playBinput ==0) ) {
			// 플레이어 둘중 하나가 가위(0)나 보(2)를 낼 경우
			// 숫자가 적은 사람이 이긴다.		
				if( playBinput < playAinput){
					
					System.out.println("Player B가 이겼습니다.");
				}else {
					System.out.println("Player A가 이겼습니다.");
				}
				
		} else if ( playAinput > playBinput) {
			// 플레이어 둘중 하나가 가위(0)나 보(2)를 내지 않는 경우
			//숫자가 큰 사람이 이긴다.
			//가위(0) 바위(1)
			//바위(1) 보(2) 
		
			System.out.println("Player A가 이겼습니다.");

		}else
			System.out.println("Player B가 이겼습니다.");

		
	}

}
