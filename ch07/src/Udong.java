abstract class Food {
	abstract void isExpensive();
}



public class Udong extends Food{
	void isExpensive() {}
	void isDelicious() {}
	public static void main(String[] args) {
		Food f;
		Udong u;
		
//		f = new Food();
		u = new Udong();
		
		u.isExpensive();
		u.isDelicious();
		
		f = u;
		f.isExpensive();
//		f.isDelicious();
	}
	
}
