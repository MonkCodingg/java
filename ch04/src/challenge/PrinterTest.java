package challenge;

public class PrinterTest {

	public static void main(String[] args) {
		// Printer 클래스를 테스트하는 코드
		Printer printerC = new Printer();
		printerC.numOfPapers =printerC.numOfPapers + 100;
		printerC.print(70);
		System.out.println(printerC.numOfPapers);
	}

}

class Printer{
	int numOfPapers = 0;
	
	void print(int amount) {
		//코드 추가
		numOfPapers = numOfPapers - amount;
		
	}
		
		
}
	
