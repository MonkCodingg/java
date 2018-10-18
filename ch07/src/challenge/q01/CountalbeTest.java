package challenge.q01;

public class CountalbeTest {

	public static void main(String[] args) {
		Countable[] m = {
				new Bird("���ٱ�"),
				new Bird("������"),
				new Tree("�������"),
				new Tree("�㳪��")
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
