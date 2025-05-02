package study.practice.Practice33;

public class Elevator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
	}
	
	
	public static String guide(int floor) {
		/* 메소드를 완성하시오. */
		if (floor >= 1 && floor <= 10) {
			return "저층";
		} else if (floor >= 11 && floor <= 20) {
			return "고층";
		} else {
			return "확인불가";
		}

	}

}
