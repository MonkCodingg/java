package programming;

import java.util.Scanner;


public class _02_CommentRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("��� �Է� : ");
		rank = in.nextInt();
		
switch (rank) {
		
		case 1:
			System.out.println("�������߽��ϴ�.");
			break;
		case 2:
		case 3:
			System.out.println("���߽��ϴ�.");
			break;
		
		case 4:
		case 5:
		case 6:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("����ؾ߰ڽ��ϴ�.");
			
		}
		in.close();
	}

}
