package example._0614;

class Good {
}

class Better extends Good {
}

final class Best extends Better {
}
// class NumberOne extends Best {}
// final Ŭ������
// �� �̻� ��ӵ� �� ���� Ŭ����

public class FinalClassDemo {
	public static void main(String[] args) {
		// new NumberOne();
		new Best();
	}
}
