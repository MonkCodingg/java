package programming.ch5;

public class TV extends Controller{
	public TV(boolean power) {
		super(power);
	}
	@Override
	public String getName() {
		if (power) {
			return "Tv�� �������ϴ�.";
		}else {
			return "Tv�� �������ϴ�.";
		}
	}
}
