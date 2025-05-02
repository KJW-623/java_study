package study.practice.Practice33;

import java.util.Scanner;

public class WeightAfterFiveMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("현재 몸무게와 경과 개월 수를 입력하세요(W N): ");
		double start = scan.nextDouble();
		int after = scan.nextInt();

		// 계산
		double result = weight(start, after);

		// 결과 출력
		System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
		}

		// 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
		public static double weight(double currentWeight, int months) {
		double expectedWeight = currentWeight;
		for (int i=0; i<months; i++) {
			expectedWeight += 0.231;
		}
		return expectedWeight;
	}

}