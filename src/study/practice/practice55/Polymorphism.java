package study.practice.practice55;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 성기사 객체 생성
		HolyKnight uther = new HolyKnight("우서", 180);

		// 탱커로서의 역할 수행
		Tanker t = uther;
		t.increaseHp();

		// 힐러로서의 역할 수행
		Healer h = uther;
		h.heal();
		
	}

}
