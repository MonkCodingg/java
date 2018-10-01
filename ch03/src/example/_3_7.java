package example;

public class _3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 3;
		int year = 2017;
		int numDays = 0;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			if ( ((year % 4 ==0) && !(year % 100 == 0)) || (year % 400 == 0) ) // 윤년
				numDays = 29;
			else				//평년
				numDays = 28;
			break;
		default:
			System.out.println("잘못된 달입니다.");
			break;	
		}
		System.out.println("2월 달은 " + numDays + "일입니다.");
	}

}
