package sec03;

import javax.swing.JFrame;

//JFrame�� �ڽ� Ŭ�����̸�, main() �޼��带 �����ϴ� ���ø����̼� Ŭ�����̴�.
public class JFrame2Demo extends JFrame {
	JFrame2Demo() {
		setTitle("�ȳ�, ����!");
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrame2Demo();
	}
}