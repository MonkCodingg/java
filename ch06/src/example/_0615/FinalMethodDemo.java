package example._0615;
class Chess {
	// enum �� ������. ���� ������ ������� ����
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
