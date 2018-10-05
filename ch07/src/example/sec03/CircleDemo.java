package example.sec03;

public class CircleDemo {

	public static void main(String[] args) {
		// 반지름 5인 Circle 만듦
		Circle c1 = new Circle(5.0);
		// 반지름 6인 Circle 만듦
		Circle c2 = new Circle(6.0);
		 
		if (c1.compareTo(c2)>0) {
			System.out.println("첫 번째 원이 두 번째 원보다 크다.");
		} else if(c1.compareTo(c2)== 0) {
			System.out.println("두 원의 크기가 같다.");
		}else {
			System.out.println("첫번째의 원이 두 번째 원보다 작다.");
			
		}
	}

}
