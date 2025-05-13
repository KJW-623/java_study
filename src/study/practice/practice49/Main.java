package study.practice.practice49;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marine marine = new Marine(0, 0);
		Tank tank = new Tank(0, 0);
		Dropship dropship = new Dropship(0, 0);

		marine.move(0, 0);
		marine.stop();

		tank.move(0, 0);
		tank.changeMode();
		tank.stop();

		dropship.move(0, 0);
		dropship.load();
		dropship.stop();
		dropship.unload();
		
	}

}
