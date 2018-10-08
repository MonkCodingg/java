package programming.ch5;


public class ControllerTest {

	public static void main(String[] args) {
		Controller[] c = {
				new TV(true),
				new Radio(true)
		};
		
		for(Controller controller : c) {
			controller.show();
		}
	}

}
