package challenge;

public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printerC = new Printer();
		printerC.numOfPapers =printerC.numOfPapers + 100;
		printerC.print(70);
		System.out.println(printerC.numOfPapers);
	}

}

class Printer{
	int numOfPapers;
	
	void print(int amount) {
		
	}
		
		
}
	
