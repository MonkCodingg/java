package sec01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloEventDemo2 extends JFrame {
	HelloEventDemo2() {
		setTitle("�̺�Ʈ ������");
		
		ActionListener l1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư1�� Ŭ���߽��ϴ�.");
			}
		};
		
		JButton b1 = new JButton("Ŭ��1");
		b1.addActionListener(l1);
		
		
		
		ActionListener l2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư2�� Ŭ���߽��ϴ�.");
			}
		};
		
		JButton b2 = new JButton("Ŭ��2");
		b2.addActionListener(l1);
		add(b1);
		add(b2);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(260, 100);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new HelloEventDemo2();
	}
}