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
			System.out.println(amount + "�� ����߽��ϴ�. ���� " + numOfPapers + "�� ���� �ֽ��ϴ�.");
		} else if (numOfPapers <= amount) {
			int firstPaperN = numOfPapers;
			numOfPapers = 0;
			System.out.println("��� ����Ϸ��� ������ " + (amount - firstPaperN) + "�� �����մϴ�. " 
							+ firstPaperN + "�常 ����մϴ�.");
			System.out.println("������ �����ϴ�.");
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
