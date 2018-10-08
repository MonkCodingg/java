package programming.ch5;

public class Radio extends Controller{
	public Radio(boolean power) {
		super(power);
	}
	@Override
	public String getName() {
		if (power) {
			return "Radio가 켜졌습니다.";
		}else {
			return "Radio가 꺼졌습니다.";
		}
	}
}
