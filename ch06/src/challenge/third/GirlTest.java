package challenge.third;
public class GirlTest {
	public static void main(String[] args) {
//		Girl g1 = new Girl();
//		Girl g2 = new GoodGirl();
//		GoodGirl gg = new BestGirl();
// 		�ּ��� ������ �� ���� -> ���� �߻�
//		���� = "Girl" Ŭ�������� show() �޼ҵ尡 ���ǵǾ� ���� �ʴ�.
//		g2.show();
//		gg.show();
		
		Girl[] girls = {new Girl("������"), new GoodGirl("����"), new BestGirl("Ȳ����")};
		
		for(Girl g : girls)
			g.show();
	}

}
