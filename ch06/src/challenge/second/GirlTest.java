package challenge.second;
public class GirlTest {
	public static void main(String[] args) {
		Girl g1 = new Girl();
		Girl g2 = new GoodGirl();
		GoodGirl gg = new BestGirl();
// 		주석을 제거한 후 실행 -> 오류 발생
//		원인 = "Girl" 클래스에는 show() 메소드가 정의되어 있지 않다.
		g2.show();
		gg.show();
	}

}
