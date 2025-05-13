package study.practice.practice49;

public class Marine extends Unit {

	int x, y; // 현재 위치
	//	void move(int x, int y) { /* */ } 지정된 위치로 이동
	//	void stop() { /* */ } 현재 위치에 정지
	//	void stimPack() { /* .*/} 스팀팩을 사용한다

	public Marine(int x, int y) {
		super(x, y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("보병이 " + x + ", " + y + "로 이동");
		this.x = x;
		this.y = y;
	}

	public void stimPack() {
	}


}
