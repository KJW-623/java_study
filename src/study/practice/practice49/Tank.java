package study.practice.practice49;

public class Tank extends Unit {

	int x, y; // 현재 위치
	//	void move(int x, int y) { /* */ } 지정된 위치로 이동
	//	void stop() { /* */ } 현재 위치에 정지
	//	void changeMode() { /* . */} 공격모드를 변환한다

	public Tank(int x, int y) {
		super(x, y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("탱크가 " + x + ", " + y + "로 이동");
		this.x = x;
		this.y = y;
	}

	public void changeMode() {
		System.out.println("공격 모드 변환");
	}

}
