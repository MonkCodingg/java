package challenge;

public class PrinterTest {

	public static void main(String[] args) {
		// Printer Ŭ������ �׽�Ʈ�ϴ� �ڵ�
		Printer printerC = new Printer();
		printerC.numOfPapers =printerC.numOfPapers + 100;
		printerC.print(70);
		System.out.println(printerC.numOfPapers);
	}

}

class Printer{
	int numOfPapers = 0;
	
	void print(int amount) {
		//�ڵ� �߰�
		numOfPapers = numOfPapers - amount;
		
	}
		
		
}
	
