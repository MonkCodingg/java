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
		// 문자열 입력창 만들기
		tField = new JTextField(15);
		
		// 필드 값 0으로 초기화.
		tField.setText("0");
		// 패널에 붙이기
		p1.add(tField);

		add(p1, BorderLayout.NORTH);
	}

	void showSouth() {
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0, 4));

//		ActionListener listener1 = e -> {
//			tField.setText(tField.getText() + e.getActionCommand());
//		};
		// 더하기, 나누기
		// 버튼 만들기
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
			// 리턴 버튼 이름
			tempName = e.getActionCommand();
			if (tempName.equals("C")) { // (C 버튼을 눌렀을 경우)

				tField.setText(""); // tField에 입력되어 있는 값을 없애고
				// 메소드를 그대로 종료
				// void형 일지라도 return 사용 가능
				//(단, 값이 있어선 안된다. 메소드 종료형으로 사용)
				
				return; 

			}
			//현재 시점 textField에 입력받은 텍스트 가져온다.
			tempString = tField.getText();
			// 0일 경우 없는 것으로 보고 빈문자열 저장
			// 이벤트 발생한 버튼의 값이 연산자 이면서 readyTF가 거짓일 때
			//
			if (tempString.equals("0"))
				tempString = "";
			// 이벤트 발생한 버튼의 값이 계산하는 연산자 이면서 readyTF가 거짓일 때
			if ((tempName.equals("+") || tempName.equals("-") || tempName.equals("*") || tempName.equals("/"))
					&& !readyTF) {

				//현재 시점 testfield에 입력받은 텍스트(숫자)를 가져온후 숫자로 변경해 temlNum1에 저장
				tempNum1 = Integer.parseInt(tempString);
				// 먼저 입력한 수와 나중에 입력한 수 구분자
				// true라는 것은 연산기호 입력 받고 그 후.
				readyTF = true;
				//버튼 누른 연산자를 who에 저장
				who = tempName;
				// 숫자와 연산자를 이어 붙여 텍스트 필드에 출력
				tField.setText(tempString + tempName);

			} else if (tempName.equals("=") && readyTF && !tempNum2.equals("")) { //누른 버튼이 등호이고, readyTF가 참(연산기호 입력받고 다음 순서)이며, tempNum2 가 공백이 아닌경우
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
			// 오류 시 초기화
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
		
//action performed에서 사용하는 변수 한번에 초기화
	public void cleanIt() {
		tempName = "";
		tempString = "";
		tempNum1 = 0;
		tempNum2 = "";
		readyTF = false;
		who = "";
	}

}