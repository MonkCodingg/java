package test20181015.theRateOfExchange;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testTheRateOfExchange {
	static double transRate;
	static String nationCode;
	static double input;
	static double trans;
	public static List<TheRateOfExchangeItem> theRateOfExchangeItems = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		Scanner myInput = new Scanner(System.in);

		// 환율을 파일에서 입력받아(input.txt)
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//		FileInputStream fIn = new FileInputStream("input.txt");
//		BufferedReader br = new BufferedReader(new InputStreamReader(fIn));

		System.out.print("환율 계산을 위한 원화 금액을 입력하세요: ");
//		input = 11200;
		input = myInput.nextInt();

//		inputNationCode ="JPA";

		// 없는 코드라는 것은 input.txt 파일의 전체 국가 코드를
		// 조회하여 비교 해야 한다.
		// 입력코드와 arr[0] 값 비교. 같은 것이 있으면 참 같은 것이 없으면 거짓
		System.out.println("변환할 국가 코드를 입력하세요 : ");
		String inputNationCode = myInput.next();

		while (true) {
			// nationCode 초기화
			nationCode = "";
			String line = br.readLine();
			// 파일의 끝이 아닌경우
			if (line != null) {
				String[] arr = line.split(",");
				// arr[0]이 nation 코드이다

				// 입력 받은 국가 코드와 비교 후
				// 일치 하면 arr[1]의 값을 환율(static 변수)에 저장.
				if (arr[0].equals(inputNationCode)) {
					transRate = Double.parseDouble(arr[1]);
					nationCode = inputNationCode;
					// 계산
					trans = input * transRate;
					create();
					System.out.println("추가하시겠습니까? (1:Yes, 2:No) : ");
					int inN = myInput.nextInt();
					// yes 면 환률아이템객체 만들고 속성 세팅하는 메서드 실행.
					// 버퍼리더 초기화로 input.txt 첫행으로 이동.
					// 다시 비교할 국가코드 입력받기
					if (1 == inN) {
						// 버퍼리더 초기화 필요
						// 다시 처음 첫행부터 input.txt 파일에서 불러와 비교 해야함.
						// 안하면 line은 끝에 도달 null값에서 변하지 않음.
						br.close();
						br = new BufferedReader(new FileReader("input.txt"));

						System.out.println("변환할 국가 코드를 입력하세요 : ");

						inputNationCode = myInput.next();

					} else if (2 == inN) {
						// 추가하시겠습니다. 2.No 인 경우.
						// 오직 이 경우에만 while 문을 나가고
						// 그 후 save()를 통해 그동안 저장되었던 내용을 파일에 출력한다.
						break;
					} else {
						System.out.println("입력을 잘못하셨습니다.");
					}
				}
				// 반복되던 br.readLine() 끝에 도달 null 값 반환
				// if (line == null)
			} else {
				
				// 반복 스트링 배열 끝에 와 있음.
				// 버퍼리더 행 처음으로 가는 것 필요
				// 버퍼리더 초기화 진행

				System.out.println("없는 코드입니다. (" + inputNationCode + ")");
				
				System.out.println("추가하시겠습니까? (1:Yes, 2:No) : ");
				int inN = myInput.nextInt();

				if (1 == inN) {
					// 버퍼리더 초기화 필요
					// 다시 처음 첫행부터 input.txt 파일에서 불러와 비교 해야함.
					// 안하면 line은 끝에 도달 null값에서 변하지 않음.
					br.close();
					br = new BufferedReader(new FileReader("input.txt"));
//						fIn.getChannel().position(0);
//						br = new BufferedReader(new InputStreamReader(fIn));
					System.out.println("변환할 국가 코드를 입력하세요 : ");
					inputNationCode = myInput.next();

					// 추가하시겠습니다. 2.No 인 경우.
					// 오직 이 경우에만 while 문을 나가고 그 후 save()를 통해
					// 그동안 저장되었던 내용을 파일에 출력한다.
				} else if (2 == inN) {
					break;
				} else {
					System.out.println("입력을 잘못하셨습니다.");
				}

			}
		}
		// while문 벗어난 경우에만 save() 실행
		// 반복문 안에서 반복하는 동안 TheRateOfExchangeItem 객체가 여러개 생김.
		save();
	}

	public static void create() {
		// 객체 만들기
		// 객체 속성 세팅
		TheRateOfExchangeItem theRateOfExchangeItem = new TheRateOfExchangeItem();
		theRateOfExchangeItem.nationCode = nationCode;
		theRateOfExchangeItem.input = input;
		theRateOfExchangeItem.trans = trans;

		theRateOfExchangeItems.add(theRateOfExchangeItem);
	}


	public static void save() throws Exception {

		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		pw.println("입력," + (int) input);
		pw.println("국가,환산");
		for (TheRateOfExchangeItem item : theRateOfExchangeItems) {
			pw.println(item.toString());
		}
		pw.close();
		System.out.println("파일이 저장되었습니다.");
	}

}

class TheRateOfExchangeItem {
	String nationCode;
	double input;
	double trans;

	public String toString() {
		String result = this.nationCode + "," + (int) this.trans;
		return result;
	}
}
