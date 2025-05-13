package study.test.test02;

import java.util.Scanner;

public class Recharge {

	public void recharge(PlayGame player, Scanner scanner) {
		if (player.getOpportunityLeft()>0) {
			System.out.println("이미 충전된 횟수가 있어 추가 충전이 불가능합니다.");
			return;
		}

		System.out.println("충전할 금액을 입력하세요(1000원 단위): ");
		int chargeAmount = scanner.nextInt();

		if (chargeAmount % 1000!=0 || chargeAmount<1000) {
			System.out.println("1000원 단위로만 충전 가능합니다.");
			return;
		}

		int chargeAttempts = chargeAmount/500;
		player.setOpportunityLeft(chargeAttempts);
		player.addRevenue(chargeAmount);
		System.out.printf("%d원 충전되어 %d회의 시도 횟수가 충전되었습니다. 현재 잔여 시도 횟수: %d\n",
				chargeAmount, chargeAttempts, player.getOpportunityLeft());
	}


}