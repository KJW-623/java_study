package study.practice.practice43;

public class OrcWarrior extends Orc {

	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
	super(name, hp);
	this.amor = amor;
	}

	// 메소드 오버라이딩!
	@Override
    public String toString() {
        return "OrcWarrior { name: " + name + ", hp: " + hp + ", amor: " + amor + " }";
    }	
}
