package study.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("국어점수를 입력하세요 : ");
		int ko = scanner.nextInt();
		
		System.out.print("영어점수를 입력하세요 : ");
		int en = scanner.nextInt();
		
		System.out.print("수학점수를 입력하세요 : ");
		int ma = scanner.nextInt();
		
		int sum = ko+en+ma;
		double qu = (double) sum/3;
		
		boolean pass = (ko >= 40 && en >= 40 && ma >= 40 && qu >= 60);
		
		if(pass) {
			System.out.println("국어점수 : " + ko);
			System.out.println("영어점수 : " + en);
			System.out.println("수학점수 : " + ma);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.2f\n", qu);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
		
		
		
		//====
		
		if(ko <40 || ma <40 || en <40 || qu<60) {
			//불합격
		} else {
			//합격
		}
		
		
		
		
	}

}
