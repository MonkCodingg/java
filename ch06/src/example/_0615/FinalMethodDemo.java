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
	// final Ŭ������ Ŭ���� ������ ��� �޼��带
	// �������̵��� �� ����. Ư�� Ư�� �޼��常
	// �������̵����� �ʵ��� �Ϸ��� final �޼���� ����
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		WorldChess w = new WorldChess();
		w.getFirstPlayer();
	}
}
