package study.practice.practice55;

public class HolyKnight implements Tanker, Healer {
	private String name;
	private int hp;

	public HolyKnight(String name, int hp) {
	this.name = name;
	this.hp = hp;
	}
	
	@Override
	public void increaseHp() {
		this.hp += 50;
		System.out.println("전체 체력 +50 증가시킵니다.");
	}
	
	@Override
	public void heal() {
		System.out.println("체력을 +30 회복합니다.");
	}
	
}
