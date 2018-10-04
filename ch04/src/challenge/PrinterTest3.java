package challenge;

public class PrinterTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer3 p = new Printer3(20, true);

		p.print(25);
//		p.print(10);
		System.out.println(p.getNumOfPapers());
		
//		p.setDuplex(false);
//		p.print(10);
//		System.out.println(p.getNumOfPapers());
	
	}

}

class Printer3{
	private int numOfPapers;
	private boolean duplex;
	
	void print(int amount) {
		int dupleCount = amount;
		//�ܸ�
		if (duplex == false) {
			if (this.numOfPapers > amount ) {
				this.numOfPapers = this.numOfPapers - amount;
				System.out.println( "�ܸ�����"+ amount +"�� ����߽��ϴ�. ���� " + this.numOfPapers +"�� ���� �ֽ��ϴ�.");
			}else if (this.numOfPapers <= amount) {
				int firstPaperN = this.numOfPapers;
				this.numOfPapers = 0;
				System.out.println("�ܸ����� ��� ����Ϸ��� ������ "+ (amount-firstPaperN) +"�� �����մϴ�. "+ firstPaperN +"�常 ����մϴ�." );
				System.out.println("������ �����ϴ�.");
			}
			
		}
		
		if (duplex == true) {
			if (amount % 2 ==0) {
				amount = amount/2;
			}else {
				amount = (amount/2) +1;
			}
			
			if (numOfPapers > amount ) {
				numOfPapers = numOfPapers - amount;
				System.out.println( "������� " + amount +"�� ����߽��ϴ�. ���� " + numOfPapers +"�� ���� �ֽ��ϴ�.");
			}else if (numOfPapers <= amount) {
				int firstPaperN = numOfPapers;
				numOfPapers = 0;
				System.out.println("������� ��� ����Ϸ��� ������ "+ (amount-firstPaperN) +"�� �����մϴ�. "+ firstPaperN +"�常 ����մϴ�." );
				System.out.println("������ �����ϴ�.");
			}
			
		}
				
	}
	
	public Printer3(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}


	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
	public int getNumOfPapers() {
		return numOfPapers;
	}
	
	
	
	
	
	
		
}
	
