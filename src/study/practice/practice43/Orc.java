package study.practice.practice43;

public class Orc {
	
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
	this.name = name;
	this.hp = hp;
	}

	public String toString() {
	return "Orc { name: " + name + ", hp: " + hp + " }";
	}
	
}
