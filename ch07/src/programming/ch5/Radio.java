package programming.ch5;

public class Radio extends Controller{
	public Radio(boolean power) {
		super(power);
	}
	@Override
	public String getName() {
		if (power) {
			return "Radio�� �������ϴ�.";
		}else {
			return "Radio�� �������ϴ�.";
		}
	}
}
