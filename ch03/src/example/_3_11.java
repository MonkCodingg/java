package example;

public class _3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Ÿ�� float�� �⺻�� 0.0f
		float f = 0.1f;
	//			%.1f : �Ҽ��� ���� 1�ڸ� �Ǽ�		
		do {
			System.out.printf("%.1f\n", f);
//			f += 0.1f;
			f= f + 0.1f;
//�÷��� ��Ȯ�� 1�� �ƴ� �Ҽ��� �߰����� ������ while���� ���������� ���ϰ� ���ѹݺ���.
		} while (f != 1.0f);
	}

}
