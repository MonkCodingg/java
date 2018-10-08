package programming.ch5;

public class TV extends Controller{
	public TV(boolean power) {
		super(power);
	}
	@Override
	public String getName() {
		if (power) {
			return "Tv가 켜졌습니다.";
		}else {
			return "Tv가 꺼졌습니다.";
		}
	}
}
