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
	// 입력받은 숫자 임시 저장
	int tempNum;
	// 연산 하기 위한 변수
	int oldNum;
	// 연산자 임시 저장
	String tempOper;
	
	CalculatorTest_me() {
		setTitle("계산기");
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
		//문자열 입력창 만들기
		tField = new JTextField(15);
		//패널에 붙이기
		p1.add(tField);
		
		add(p1, BorderLayout.NORTH);
	}
	
	void showSouth() {
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0, 4));
		
		ActionListener listener1 = e -> {
		 	t.setText(t.getText()+e.getActionCommand());
		};
		// 더하기, 나누기
		// 버튼 만들기
		String[] strArr = {"7","8","9","4","5","6","1","2","3","0","+","-","*","C","=","/"};
		JButton[] jbArr = new JButton[16];
		for(int i= 0; i<strArr.length; i++) {
			jbArr[i] = new JButton(strArr[i]);
			jbArr[i].addActionListener(listener1);
			p2.add(jbArr[i]);
		}
		
		/*JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		//plus
		JButton b10 = new JButton("+");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		//minus
		JButton b11 = new JButton("-");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		//multi
		JButton b12 = new JButton("*");
		JButton b0 = new JButton("0");
		//clear
		JButton b13 = new JButton("C");
		//equal
		JButton b14 = new JButton("=");
		//divde
		JButton b15 = new JButton("/");
			
		b7.addActionListener(listener1);
		b8.addActionListener(listener1);
		
		p2.add(b7);
		p2.add(b8);*/
	
		add(p2, BorderLayout.CENTER);
	}
	

	public static void main(String[] args) {
		new CalculatorTest_me();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}