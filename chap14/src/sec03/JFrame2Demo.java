package sec03;

import javax.swing.JFrame;

//JFrame의 자식 클래스이며, main() 메서드를 포함하는 애플리케이션 클래스이다.
public class JFrame2Demo extends JFrame {
	JFrame2Demo() {
		setTitle("안녕, 스윙!");
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrame2Demo();
	}
}