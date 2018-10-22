package caculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculatorTest_me extends JFrame implements ActionListener {
	JTextField tField;
	JButton[] jbArr;
	// �Է¹��� ���� �ӽ� ����
	int tempNum;
	// ���� �ϱ� ���� ����
	int oldNum;
	// ������ �ӽ� ����
	String tempOper;

	CalculatorTest_me() {
		setTitle("����");
		setLayout(new BorderLayout());

		showNorth();
		showSouth();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(260, 280);
		setVisible(true);
	}

	void showNorth() {
		JPanel p1 = new JPanel();
		
//		add("North", p1);
		// ���ڿ� �Է�â �����
		tField = new JTextField(15);
		
		// �ʵ� �� 0���� �ʱ�ȭ.
		tField.setText("0");
		// �гο� ���̱�
		p1.add(tField);

		add(p1, BorderLayout.NORTH);
	}

	void showSouth() {
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0, 4));

//		ActionListener listener1 = e -> {
//			tField.setText(tField.getText() + e.getActionCommand());
//		};
		// ���ϱ�, ������
		// ��ư �����
		String[] strArr = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+", "-", "*", "C", "=", "/" };
		JButton[] jbArr = new JButton[16];
		for (int i = 0; i < strArr.length; i++) {
			jbArr[i] = new JButton(strArr[i]);
			jbArr[i].addActionListener(this);
			p2.add(jbArr[i]);
		}

		/*
		 * JButton b7 = new JButton("7"); JButton b8 = new JButton("8"); JButton b9 =
		 * new JButton("9"); //plus JButton b10 = new JButton("+"); JButton b4 = new
		 * JButton("4"); JButton b5 = new JButton("5"); JButton b6 = new JButton("6");
		 * //minus JButton b11 = new JButton("-"); JButton b1 = new JButton("1");
		 * JButton b2 = new JButton("2"); JButton b3 = new JButton("3"); //multi JButton
		 * b12 = new JButton("*"); JButton b0 = new JButton("0"); //clear JButton b13 =
		 * new JButton("C"); //equal JButton b14 = new JButton("="); //divde JButton b15
		 * = new JButton("/");
		 * 
		 * b7.addActionListener(listener1); b8.addActionListener(listener1);
		 * 
		 * p2.add(b7); p2.add(b8);
		 */

		add(p2, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new CalculatorTest_me();
	}
	public static boolean isNumeric(String str)  
    { 
        try 
        { 
            double d = Double.parseDouble(str);  
        } 
        catch(NumberFormatException nfe) 
        { 
            return false; 
        } 
        return true; 
    }
	

	private String tempName;
	private String tempString;
	private int tempNum1 = 0;
	private String tempNum2 = "";
	private boolean readyTF = false;
	private String who = "";

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			// ���� ��ư �̸�
			tempName = e.getActionCommand();
			if (tempName.equals("C")) { // (C ��ư�� ������ ���)

				tField.setText(""); // tField�� �ԷµǾ� �ִ� ���� ���ְ�
				// �޼ҵ带 �״�� ����
				// void�� ������ return ��� ����
				//(��, ���� �־ �ȵȴ�. �޼ҵ� ���������� ���)
				
				return; 

			}
			//���� ���� textField�� �Է¹��� �ؽ�Ʈ �����´�.
			tempString = tField.getText();
			// 0�� ��� ���� ������ ���� ���ڿ� ����
			// �̺�Ʈ �߻��� ��ư�� ���� ������ �̸鼭 readyTF�� ������ ��
			//
			if (tempString.equals("0"))
				tempString = "";
			// �̺�Ʈ �߻��� ��ư�� ���� ����ϴ� ������ �̸鼭 readyTF�� ������ ��
			if ((tempName.equals("+") || tempName.equals("-") || tempName.equals("*") || tempName.equals("/"))
					&& !readyTF) {

				//���� ���� testfield�� �Է¹��� �ؽ�Ʈ(����)�� �������� ���ڷ� ������ temlNum1�� ����
				tempNum1 = Integer.parseInt(tempString);
				// ���� �Է��� ���� ���߿� �Է��� �� ������
				// true��� ���� �����ȣ �Է� �ް� �� ��.
				readyTF = true;
				//��ư ���� �����ڸ� who�� ����
				who = tempName;
				// ���ڿ� �����ڸ� �̾� �ٿ� �ؽ�Ʈ �ʵ忡 ���
				tField.setText(tempString + tempName);

			} else if (tempName.equals("=") && readyTF && !tempNum2.equals("")) { //���� ��ư�� ��ȣ�̰�, readyTF�� ��(�����ȣ �Է¹ް� ���� ����)�̸�, tempNum2 �� ������ �ƴѰ��
				int temp = Integer.parseInt(tempNum2);
				
				tField.setText(Integer.toString(Calculate(tempNum1, temp, who)));
				cleanIt();
			} else if (tempName.equals("=") && (!readyTF || tempNum2.equals(""))) {

			} else {
                tField.setText(tempString + tempName); 

			} 

            if(readyTF && isNumeric(tempName)) { 
            	tempNum2 += tempName;
            }

			
		} catch (Exception e2) {
			// ���� �� �ʱ�ȭ
			tField.setText("");
			cleanIt();

		}
	}
	
	
	public int Calculate(int a, int b, String s) {
		switch (s) {

		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		default:
			return -1;
		}
	}
		
//action performed���� ����ϴ� ���� �ѹ��� �ʱ�ȭ
	public void cleanIt() {
		tempName = "";
		tempString = "";
		tempNum1 = 0;
		tempNum2 = "";
		readyTF = false;
		who = "";
	}

}