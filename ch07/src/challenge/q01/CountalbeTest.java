package challenge.q01;

public class CountalbeTest {

	public static void main(String[] args) {
		Countable[] m = {
				new Bird("뻐꾸기"),
				new Bird("독수리"),
				new Tree("사과나무"),
				new Tree("밤나무")
		};
	
		for (Countable e : m){
			e.count();
		}		
		for (int i = 0; i < m.length; i++) {
			Countable c = m[i];
			
			if (c instanceof Bird) {
				((Bird) c).fly();
			}else if(c instanceof Tree) {
				((Tree) c).ripen();
			}
		}
	}
}
