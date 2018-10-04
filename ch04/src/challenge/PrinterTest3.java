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
		//단면
		if (duplex == false) {
			if (this.numOfPapers > amount ) {
				this.numOfPapers = this.numOfPapers - amount;
				System.out.println( "단면으로"+ amount +"장 출력했습니다. 현재 " + this.numOfPapers +"장 남아 있습니다.");
			}else if (this.numOfPapers <= amount) {
				int firstPaperN = this.numOfPapers;
				this.numOfPapers = 0;
				System.out.println("단면으로 모두 출력하려면 용지가 "+ (amount-firstPaperN) +"매 부족합니다. "+ firstPaperN +"장만 출력합니다." );
				System.out.println("용지가 없습니다.");
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
				System.out.println( "양면으로 " + amount +"장 출력했습니다. 현재 " + numOfPapers +"장 남아 있습니다.");
			}else if (numOfPapers <= amount) {
				int firstPaperN = numOfPapers;
				numOfPapers = 0;
				System.out.println("양면으로 모두 출력하려면 용지가 "+ (amount-firstPaperN) +"매 부족합니다. "+ firstPaperN +"장만 출력합니다." );
				System.out.println("용지가 없습니다.");
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
	
