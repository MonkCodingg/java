package example;

public class _3_11 {

	public static void main(String[] args) {
		// 기초 타입 float의 기본값 0.0f
		float f = 0.1f;
	//			%.1f : 소수점 이하 1자리 실수		
		do {
			System.out.printf("%.1f\n", f);
//			f += 0.1f;
			f= f + 0.1f;
//플롯은 정확히 1이 아닌 소수점 추가값을 가져서 while문을 빠져나가지 못하고 무한반복됨.
		} while (f != 1.0f);
	}

}
