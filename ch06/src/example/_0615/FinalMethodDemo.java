package example._0615;
class Chess {
	// enum 은 열거형. 서로 연관된 상수들의 집합
	enum ChessPlayer{
		WHITE, BLACK
	}
	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
	
}

class WorldChess extends Chess{
	// ChessPlayer getFirstPlayer(){}
}


public class FinalMethodDemo {

	public static void main(String[] args) {
		WorldChess w = new WorldChess();
		w.getFirstPlayer();
	
	}

}
