package challenge;

public class PrinterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer2 p = new Printer2(10);

		p.print(20);

//		p.print(10);

		System.out.println(p.getNumOfPapers());
	}

}

class Printer2 {
	private int numOfPapers;

	void print(int amount) {
		if (numOfPapers > amount) {
			numOfPapers = numOfPapers - amount;
			System.out.println(amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
		} else if (numOfPapers <= amount) {
			int firstPaperN = numOfPapers;
			numOfPapers = 0;
			System.out.println("모두 출력하려면 용지가 " + (amount - firstPaperN) + "매 부족합니다. " 
							+ firstPaperN + "장만 출력합니다.");
			System.out.println("용지가 없습니다.");
		}

	}

	public int getNumOfPapers() {
		return numOfPapers;
	}

	public Printer2() {
		numOfPapers = 0;
	}

	public Printer2(int x) {
		numOfPapers = x;
	}

}
