package test1;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		int cost1, cost2, cost3, cost4, num1, num2, num3 , num4, num5, totalNum, sum1, totalSum;
		
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("케토레이레몬캔240lm 가격?");
		cost1 = myInput.nextInt();
		System.out.println("갯수 ?");
		num1 = myInput.nextInt();
		sum1 = cost1 * num1;
		
		totalNum = num1;
		totalSum = sum1;
		
		
		System.out.println( "***********************************" );
		System.out.println( "******* 최근영수증발행인쇄  *******" );
		System.out.println( "cu 서현역점" );
		System.out.println( "사업자등록번호" );
		System.out.println( "" );
		System.out.println( "     TEL:(123-4567" );
		System.out.println( "" );
		System.out.println( "정부 방침에 의해 12년 7월 1일부터" );
		System.out.println( "현금 결제 취소시, 영수증이 없으면" );
		System.out.println( "교환/환불이 불가합니다." );
		System.out.println( "" );
		System.out.println( "22781  2016/09/24(토) POS-01" );
		System.out.println( "" );
		
		
		System.out.println( "게토레이레몬캔240ml   "+num1+"       "+cost1 );
//		System.out.println( "게토레이레몬캔24취소    -1      -950" );
		System.out.println( "" );
		System.out.println( "-----------------------------" );
		System.out.println( "총 구  매 액          "+totalNum+"       "+totalSum );
		System.out.println( "-----------------------------" );
		System.out.println( "내   실    돈                 "+totalSum );
		System.out.println( "*표시 상품은 부가세 면세 품목 임." );
		System.out.println( "환불은 30일내 영수증 지참시에 가능" );
		System.out.println( "객층:15  담당:01 NO:4570  16:59" );
		System.out.println( "" );
		
		
		

	}

}
