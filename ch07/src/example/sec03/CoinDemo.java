package example.sec03;

interface Coin {
	int Penny =1,NICKEL = 5, DIME = 10, QUATER = 25;
}


public class CoinDemo {

	public static void main(String[] args) {
		
		System.out.println("Dime은 "+Coin.DIME +"센트입니다.");
	}

}
