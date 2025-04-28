package study.test;

import java.util.Random;
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//basic();
		//level1();
		//level2();
		level3();
		
	}
	
	public static void basic() {
//		야구 게임 (스크린 야구, 공격만)
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random ();
		
		int bowler;
		int out = 0;
		
		System.out.println("===== 야구 게임 시작 =====");
		System.out.println();
		
		while (true) {
            System.out.print("수를 입력해주세요 (1~10): ");
            int personCount = scanner.nextInt();

            if (personCount >= 1 && personCount <= 10) {
                bowler = random.nextInt(10)+1;
                System.out.printf("투수의 공: %d\n", bowler);

                if (personCount == bowler) {
                    System.out.println("안타");
                } else {
                    out++;
                    System.out.printf("%d아웃 \n", out);
                    if(out==3) {
                    	System.out.print("삼진 아웃입니다. 게임이 종료됩니다.");
                    	break;
                    }
                }
            } else {
                System.out.println("잘못된 입력입니다. 1부터 10 사이의 수를 입력해주세요.");
                System.out.println();
            }
            
		}
		
		
	}
	
	
	public static void level1() {
		//1회부터 3회까지만 진행합니다.
		//각 회는 3아웃마다 회가 넘어가며, 회가 시작할 때마다 0아웃으로 시작합니다.
		
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random ();

		int bowler;
		int out = 0;
		int round = 1;

		System.out.println("===== 야구 게임 시작 =====");
		System.out.println();

		while (round <= 3) {
			out = 0;
			System.out.printf("===== %d회 시작 =====\n", round);

			while (out < 3) {
				System.out.printf("수를 입력해주세요 (1~10): ");
				int personCount = scanner.nextInt();

				if (personCount >= 1 && personCount <= 10) {
					bowler = random.nextInt(10)+1;
					System.out.printf("투수의 공: %d\n", bowler);

					if (personCount == bowler) {
						System.out.println("안타");
					} else {
						out++;
						System.out.printf("%d 아웃\n", out);
						if (out == 3) {
							System.out.println("삼진 아웃입니다. 다음 회차로 넘어갑니다.");
							System.out.println();
							break;
						}
					}
				} else {
					System.out.println("잘못된 입력입니다. 1부터 10 사이의 수를 입력해주세요.");
					System.out.println();
				}
			}
			round++;
			System.out.printf("===== %d회 종료 =====\n", round-1);
			System.out.println();
		}
		System.out.println("===== 게임 종료 =====");

		
		
		
	}

	
	public static void level2() {
//		9명의 타자(선수)를 등록합니다.
//		각 타자가 타격하기 위해 타석에 등장시, 타순 및 타자명이 출력됩니다.
//		9번타자 다음 순서는 1번 타자로 9명이 로테이션 됩니다.
//		1회차가 끝나는 기준이 3아웃입니다.
//		타자 선수는 1아웃이면 다음선수로 넘어갑니다.
//		타자가 안타를 쳐도 출루 했다고 가정하고 다음 선수로 넘어갑니다.
		
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random ();
		
		int bowler;
		int out = 0;
		int round = 1;
		int i = 0;
		
		String[] playerArr = {"선수1", "선수2", "선수3", "선수4", "선수5", "선수6", "선수7", "선수8", "선수9"};
		String[] numberArr = {"1번", "2번", "3번", "4번", "5번", "6번", "7번", "8번", "9번"};

		System.out.println("===== 야구 게임 시작 =====");
		System.out.println();

		while (round <= 3) {
			out = 0;
			System.out.printf("===== %d회 시작 =====\n", round);
			
			while (out < 3) {
				System.out.printf("%s 타자 %s 타석.\n", i+1, numberArr[i], playerArr[i]);
				System.out.printf("수를 입력해주세요 (1~10): ");
				int personCount = scanner.nextInt();

				if (personCount >= 1 && personCount <= 10) {
					bowler = random.nextInt(10)+1;
					System.out.printf("투수의 공: %d\n", bowler);
					
					if (personCount == bowler) {
						System.out.println("안타");
						i = (i+1) % 9;
					} else {
						out++;
						System.out.printf("%d 아웃\n", out);
						i = (i+1) % 9;
						if (out == 3) {
							System.out.println("삼진 아웃입니다. 다음 회차로 넘어갑니다.");
							System.out.println();
							break;
						}
					}
				} else {
					System.out.println("잘못된 입력입니다. 1부터 10 사이의 수를 입력해주세요.");
					System.out.println();
				}
			}
			round++;
			System.out.printf("===== %d회 종료 =====\n", round-1);
			System.out.println();
		}

		System.out.println("===== 게임 종료 =====");
		
	

	}
	
	
	public static void level3() {
//		각 타자의 전체 타석 및 안타수를 기록합니다.
//		타석에 등장시, 타순 및 타자명 뿐만 아니라 타율도 출력됩니다. (타율=안타수/타석수)
//		참고로 첫 타석의 타율은 0입니다.
//		*한번 휘두를 때를 기준으로 타석수가 증가합니다.
//		현재는 안타, 아웃 뿐이지만 이후 스트라이크, 볼 등에 대해서 타석수는 증가합니다.
		
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random ();
		
		int bowler;
		int out = 0;
		int round = 1;
		int i = 0; // 선수 초기화
		int j = 0; // 안타 초기화
		int k = 0; // 타석 초기화

		String[] playerArr = {"선수1", "선수2", "선수3", "선수4", "선수5", "선수6", "선수7", "선수8", "선수9"};
		String[] numberArr = {"1번", "2번", "3번", "4번", "5번", "6번", "7번", "8번", "9번"};

		int[] bat = new int[9]; //타석 수
		int[] hit = new int[9]; //안타 수

		System.out.println("===== 야구 게임 시작 =====");
		System.out.println();

		while (round <= 3) {
			out = 0;
			System.out.printf("===== %d회 시작 =====\n", round);

			while (out < 3) {
				bat[k]++;
				double average = (double)hit[j]/bat[k];

				System.out.printf("%s 타자, %s 타석, 타율: %.2f\n", numberArr[i], playerArr[i], average, i+1);
				System.out.printf("수를 입력해주세요 (1~10): ");
				int personCount = scanner.nextInt();

				if (personCount >= 1 && personCount <= 10) {
					bowler = random.nextInt(10)+1;
					System.out.printf("투수의 공: %d \n", bowler);

					if (personCount == bowler) {
						System.out.println("안타");
						hit[j]++;
						i = (i+1) % 9;
					} else {
						out++;
						System.out.printf("%d 아웃\n", out);
						i = (i+1) % 9;
						if (out == 3) {
							System.out.println("삼진 아웃입니다. 다음 회차로 넘어갑니다.");
							System.out.println();
							break;
						}
					}
				} else {
					System.out.println("잘못된 입력입니다. 1부터 10 사이의 수를 입력해주세요.");
					System.out.println();
				}
			}
			round++;
			System.out.printf("===== %d회 종료 =====\n", round-1);
			System.out.println();
		}

		System.out.println("===== 게임 종료 =====");

		
		
	}
}
