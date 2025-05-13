package study.practice.practice49;

public class Dropship extends Unit {

	int x, y; // 현재 위치
	//	void move(int x, int y) { /* */ } 지정된 위치로 이동
	//	void stop() { /* */ } 현재 위치에 정지
	//	void load() { /* .*/ } 선택된 대상을 태운다
	//	void unload() { /* .*/ } 선택된 대상을 내린다

	public Dropship(int x, int y) {
		super(x, y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("수송선 " + x + ", " + y + "로 이동");
		this.x = x;
		this.y = y;
	}

	public void load() {
		System.out.println("선택 대상을 태움");
	}

	public void unload() {
		System.out.println("선택 대상을 내림");
	}


}
