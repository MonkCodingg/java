package programming;

public class Complex {
	private double r;
	private double i;
	
	public Complex(double r) {
		this(r, 0);
	}
	
	public Complex(double r, double i) {
		this.r = r;
		this.i = i;
	}
	
	
	public String print() {
		return r +" + "+ i +"i";
	}
	
}
