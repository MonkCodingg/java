package test1;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		int cost1, cost2, cost3, cost4, num1, num2, num3 , num4, num5, totalNum, sum1, totalSum;
		
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("���䷹�̷���ĵ240lm ����?");
		cost1 = myInput.nextInt();
		System.out.println("���� ?");
		num1 = myInput.nextInt();
		sum1 = cost1 * num1;
		
		totalNum = num1;
		totalSum = sum1;
		
		
		System.out.println( "***********************************" );
		System.out.println( "******* �ֱٿ����������μ�  *******" );
		System.out.println( "cu ��������" );
		System.out.println( "����ڵ�Ϲ�ȣ" );
		System.out.println( "" );
		System.out.println( "     TEL:(123-4567" );
		System.out.println( "" );
		System.out.println( "���� ��ħ�� ���� 12�� 7�� 1�Ϻ���" );
		System.out.println( "���� ���� ��ҽ�, �������� ������" );
		System.out.println( "��ȯ/ȯ���� �Ұ��մϴ�." );
		System.out.println( "" );
		System.out.println( "22781  2016/09/24(��) POS-01" );
		System.out.println( "" );
		
		
		System.out.println( "���䷹�̷���ĵ240ml   "+num1+"       "+cost1 );
//		System.out.println( "���䷹�̷���ĵ24���    -1      -950" );
		System.out.println( "" );
		System.out.println( "-----------------------------" );
		System.out.println( "�� ��  �� ��          "+totalNum+"       "+totalSum );
		System.out.println( "-----------------------------" );
		System.out.println( "��   ��    ��                 "+totalSum );
		System.out.println( "*ǥ�� ��ǰ�� �ΰ��� �鼼 ǰ�� ��." );
		System.out.println( "ȯ���� 30�ϳ� ������ �����ÿ� ����" );
		System.out.println( "����:15  ���:01 NO:4570  16:59" );
		System.out.println( "" );
		
		
		

	}

}
