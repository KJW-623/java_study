package study.practice.practice49;

public class Unit {

	//	아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit 이라는 클래스를 만들고 
	//  이 클래스를 상속받도록 코드를 변경하시오.
	//	*조건
	//	1) 멈추는 동작은 모두 동일하게 제자리에 정지한다.
	//	2) 움직이는 동작은 걷는거, 날기, 바퀴구르기 다르기 때문에 각각 다르게 정의한다.

	private int x;
	private int y;

	public Unit(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void stop() {
		System.out.println( x + ", " + y + "에 정지");
	}

	public void move(int x, int y) {
		
	}

	
}
