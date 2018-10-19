package sec02;

// GUI 프로그래밍에 필요한 패키지를 임포트한다.
import javax.swing.JFrame;

public class HelloSwingDemo {
	public static void main(String[] args) {
		//프레임을 생성한다.
		JFrame f = new JFrame();
		
		//프레임의 타이틀과 크기를 설정한다.
		f.setTitle("안녕, 스윙!");
		f.setSize(300, 100);
		//프레임을 화면에 보이도록 한다.
		f.setVisible(true);
	}
}