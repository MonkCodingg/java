package sec03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrame4Demo extends JFrame {
	// �г��� �����Ѵ�.
	JFrame4Demo() {
		setTitle("�ȳ�, ����!");
		//���̺�� ��ư�� ����
		JPanel p = new JPanel();
		JLabel l = new JLabel("�ȳ�, ����!");
		JButton b = new JButton("��ư");
		//���̺�� ��ư�� �гο� �����Ѵ�.
		p.add(l);
		p.add(b);
		//�г��� �����ӿ� �����Ѵ�.
		add(p);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize()�� âũ�⸦ ���ϰ�, pack()�� ���뿡 �˸°� â ũ�⸦ �����Ѵ�.
		setSize(300, 100);
		// pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrame4Demo();
	}
}