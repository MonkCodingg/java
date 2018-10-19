package sec04;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo2 extends JFrame {
	BorderLayoutDemo2() {
		setTitle("보더 레이아웃!");
		//GridLayout으로 배치 관리자를 변경한다.
		setLayout(new BorderLayout());
		//setLayout(null); 배치관리자를 제거한다.
		
		add("East", new JButton("동"));
		add("West", new JButton("서"));
		add("South", new JButton("남"));
		add(new JButton("북"), BorderLayout.NORTH);
		add(new JButton("중앙"), BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 110);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo2();
	}
}