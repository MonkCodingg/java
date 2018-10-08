package challenge.q03;

public class CountalbeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countable[] m = {
				new Bird("���ٱ�"),
				new Bird("������"),
				new Tree("�������"),
				new Tree("�㳪��")
				
		};
		
		m[0].num = 5;
		m[1].num = 2;
		m[2].num = 10;
		m[3].num = 7;
		
		
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
