package sec03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrame4Demo extends JFrame {
	// 패널을 생성한다.
	JFrame4Demo() {
		setTitle("안녕, 스윙!");
		//레이블과 버튼을 생성
		JPanel p = new JPanel();
		JLabel l = new JLabel("안녕, 스윙!");
		JButton b = new JButton("버튼");
		//레이블과 버튼을 패널에 부착한다.
		p.add(l);
		p.add(b);
		//패널을 프레임에 부착한다.
		add(p);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize()는 창크기를 정하고, pack()은 내용에 알맞게 창 크기를 조절한다.
		setSize(300, 100);
		// pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrame4Demo();
	}
}