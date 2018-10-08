package programming.ch6;

public class Call implements Printable{
	public void invoke(Printable p) {
		if (p instanceof A4) {
			((A4) p).a();
		} else if (p instanceof B4) {
			((B4) p).b();
		}
		
	}
}
