package example._0614;

class Good {
}

class Better extends Good {
}

final class Best extends Better {
}
// class NumberOne extends Best {}
// final 클래스는
// 더 이상 상속될 수 없는 클래스

public class FinalClassDemo {
	public static void main(String[] args) {
		// new NumberOne();
		new Best();
	}
}
