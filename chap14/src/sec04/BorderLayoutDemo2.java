package sec04;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo2 extends JFrame {
	BorderLayoutDemo2() {
		setTitle("���� ���̾ƿ�!");
		//GridLayout���� ��ġ �����ڸ� �����Ѵ�.
		setLayout(new BorderLayout());
		//setLayout(null); ��ġ�����ڸ� �����Ѵ�.
		
		add("East", new JButton("��"));
		add("West", new JButton("��"));
		add("South", new JButton("��"));
		add(new JButton("��"), BorderLayout.NORTH);
		add(new JButton("�߾�"), BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 110);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo2();
	}
}