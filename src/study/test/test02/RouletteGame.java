package study.test.test02;

import java.util.Random;

public class RouletteGame {
	private final Random random = new Random();

	public int spinRoulette() {
		return random.nextInt(6)+1;
	}

	public int calculatePoints(int result) {
		if (result>=1 && result<=4) {
			return result;
		}
		return 0;
	}
}