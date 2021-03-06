package sec05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentDemo2 extends JFrame {
	ComponentDemo2() {
		setTitle("원 넓이 구하기");
		
		setLayout(new BorderLayout(10, 10));
		showNorth();
		showCenter();
		showSouth();
		
		
	}

	void showNorth() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(2, 0));
		
		JLabel l1 = new JLabel("원의 반지름");
		JLabel l2 = new JLabel("원의 넓이");
		
//		JTextField t1 = new 
		
	}

	void showCenter() {
		JPanel panel = new JPanel();

		JTextArea area = new JTextArea(30, 20);
		area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
		area.setEditable(false);
		area.setForeground(Color.RED);

		panel.add(area);

		add(panel, BorderLayout.CENTER);
	}

	void showSouth() {
		String[] color = { "red", "blue" };

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

		JButton cal = new JButton("계산");
		JComboBox<String> cb = new JComboBox<>(color);
		JButton reset = new JButton("리셋");

		panel.add(cal);
		panel.add(cb);
		panel.add(reset);

		add(panel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new ComponentDemo2();
	}
}