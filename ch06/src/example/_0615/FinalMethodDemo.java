package example._0615;

class Chess {
	enum ChessPlayer {
		WHITE, BLACK
	}

	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess {
	// ChessPlayer getFirstPlayer(){}
	// final 클래스는 클래스 내부의 모든 메서드를
	// 오버라이딩할 수 없다. 특히 특정 메서드만
	// 오버라이딩하지 않도록 하려면 final 메서드로 선언
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		WorldChess w = new WorldChess();
		w.getFirstPlayer();
	}
}
