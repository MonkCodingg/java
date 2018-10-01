package programming;

import java.util.Scanner;


public class _02_CommentRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("등수 입력 : ");
		rank = in.nextInt();
		
switch (rank) {
		
		case 1:
			System.out.println("아주잘했습니다.");
			break;
		case 2:
		case 3:
			System.out.println("잘했습니다.");
			break;
		
		case 4:
		case 5:
		case 6:
			System.out.println("보통입니다.");
			break;
		default:
			System.out.println("노력해야겠습니다.");
			
		}
		in.close();
	}

}
