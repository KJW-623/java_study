package study.test.test02;

import java.util.Scanner;

public class GameSystem {
	private final String deviceId;
	private final String storeName;
	private final PlayGame playGame;
	private final RouletteGame rouletteGame;
	private final Recharge recharge;
	private boolean isPlaying;

	public GameSystem(String deviceId, String storeName) {
		this.deviceId = deviceId;
		this.storeName = storeName;
		this.playGame = new PlayGame();
		this.rouletteGame = new RouletteGame();
		this.recharge = new Recharge();
		this.isPlaying = false;
	}

	public void runGame() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("[룰렛 게임 메뉴]");
			System.out.println("1. 충전");
			System.out.println("2. 게임 시작");
			System.out.println("3. 마감");
			System.out.println("4. 종료");
			System.out.print("원하는 메뉴를 선택하세요: ");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				recharge.recharge(playGame, scanner);
				break;
			case 2:
				startGame();
				break;
			case 3:
				closeGame();
				break;
			case 4:
				System.out.println("게임 종료");
				scanner.close();
				return;
			default:
				System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
			}
		}
	}

	private void startGame() {
		if (playGame.getOpportunityLeft()<=0) {
			System.out.println("충전된 횟수가 없어 게임을 시작할 수 없습니다. 먼저 충전해주세요.");
			return;
		}
		if (isPlaying) {
			System.out.println("이미 게임이 진행 중입니다. 마감 후 다시 시작해주세요.");
			return;
		}
		isPlaying = true;
		System.out.println("룰렛 게임을 시작합니다.");

		while (playGame.getOpportunityLeft()>0) {
			int result = rouletteGame.spinRoulette();
			int points = rouletteGame.calculatePoints(result);
			System.out.printf("룰렛 결과: %d ", result);

			if (points>0) {
				playGame.addPoints(points);
				playGame.incrementSuccessCount();
				System.out.printf("(성공, %d점 획득). 잔여 시도 횟수: %d\n", points, playGame.getOpportunityLeft()-1);
			} else {
				playGame.incrementFailCount();
				System.out.printf("(실패). 잔여 시도 횟수: %d\n", playGame.getOpportunityLeft()-1);
			}
			playGame.decrementOpportunity();
		}
		System.out.println("\n--- 게임 종료 ---");
		System.out.printf("총 획득 점수: %d 점\n", playGame.getTotalPoints());
		System.out.printf("성공 횟수: %d 회\n", playGame.getSuccessCount());
		System.out.printf("실패 횟수: %d 회\n", playGame.getFailCount());
		playGame.resetGameData();
		isPlaying = false;
	}

	private void closeGame() {
		if (playGame.getOpportunityLeft()>0) {
			System.out.println("아직 잔여 시도 횟수가 있어 마감이 불가능합니다. 게임을 모두 진행해주세요.");
			return;
		}
		System.out.println("\n--- 게임 마감 ---");
		System.out.printf("오늘의 총 매출액: %d 원\n", playGame.getTotalRevenue());
	}

}
