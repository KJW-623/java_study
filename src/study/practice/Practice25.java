package study.practice;

import java.util.Scanner;
import java.util.Random;

public class Practice25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//		prac1();
		//		prac2();
		//		prac3();
		//		prac3v2();
		//		pracvteacher();
				pracvteacherv2();
		//		prac4();
		
	}

	public static void prac1() {//이건 내가 출력한 예제
		//목표: 떡볶이, 순대, 튀김 메뉴와 가격을 배열로 관리하고, 사용자로부터 메뉴 번호와 수량을 입력받아 주문 내역과 총 결제 금액을 출력하는 프로그램을 작성하세요.

		String[] menuArr = {"떡볶이", "순대", "튀김"};
		int[] priceArr = {4000, 3500, 5000};
		int[] countArr = new int[3];

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("======== 메뉴 ========");
			for(int i=0; i<menuArr.length; i++) {
				System.out.printf("%d.%s	\t%5d원\n", i+1, menuArr[i], priceArr[i]);
			}
			System.out.println("=====================");

			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();

			if(!(menu>=1 && menu<=menuArr.length)) {//정상범위가 아니면!
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue; //이 코드 이후로 현재 턴 실행 생략 >> 다음 턴
			}

			System.out.print("수량 선택 : ");
			int count = scanner.nextInt();

			countArr[menu-1] += count;
			scanner.nextLine();

			String addOrder;
			while(true) {
				System.out.println("추가주문 하시겠습니까? (y/n) : ");
				addOrder = scanner.nextLine();

				//y/n 정상 입력 여부 체크
				if(!(addOrder.equals("n") || addOrder.equals("y"))) {
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				} else {
					break;
				}
			}
			if(addOrder.equals("n")) {
				int total = 0;

				System.out.println("=====================");
				//menuArr
				//priceArr
				//countArr

				for(int i=0; i<menuArr.length; i++) {
					if(countArr[i] > 0) {
						System.out.printf("%-8s %d잔 : %원\n", menuArr[i], countArr[i], countArr[i]*priceArr[i]);
						total = total + (countArr[i] * priceArr[i]);
					}
				}
				System.out.println("=====================");
				System.out.printf("총액 : %원", total);
				break;
			}
		}

	}

	
	public static void prac2() {//이건 내가 출력한 예제
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//사용자로부터 주사위 던지기 횟수를 입력받아, 해당 횟수만큼 두 개의 주사위를 던져 각 눈의 합을 기록하고, 
		//최종적으로 각 합의 빈도수와 가장 많이 나온 합을 출력하는 프로그램을 작성하세요.

		System.out.print("주사위를 몇 번 던질까요? : ");
		int roll = scanner.nextInt();

		if (roll <= 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}

		int[] count = new int[11];
		
		System.out.println("======== 주사위 던지기 과정 ========");
	    for (int i = 0; i < roll; i++) {
	        int dice1 = random.nextInt(1, 7);
	        int dice2 = random.nextInt(1, 7);
	        int sum = dice1 + dice2;
	        System.out.printf("[%d] 주사위1: %d, 주사위2: %d => 합: %d\n", i + 1, dice1, dice2, sum);
	        count[sum - 2]++;
	    }
	    System.out.println("===============================");
	    
	    System.out.println();

		System.out.println("======== 주사위 던지기 결과 ========");
		System.out.printf("총 %d번 던졌습니다.\n", roll);
		
		System.out.println();
		
		for (int i=0; i<count.length; i++) {
			if (count[i] > 0) {
				int sum = i+2;
				System.out.printf("합 %d: %d번\n", sum, count[i]);
			}
		}
		System.out.println("===============================");
		
		int max = 0;
		int most = 0;
		for (int i=0; i<count.length; i++) {
			if (count[i] > max) {
				max = count[i];
				most = i + 2;
			}
		}
		System.out.printf("\n가장 많이 나온 합은 %d(총 %d번)입니다.\n", most, max);
		 
		 
		 

	}

	
	public static void prac3() {//선생님이 준 예제
		
//		엘리베이터
//
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)
//
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("탑승 인원: ");
        int passenger = scanner.nextInt();

        if (passenger <= 0) {
            System.out.println("탑승 인원은 1명 이상이어야 합니다.");
            scanner.close();
            return;
        }

        int[] goal = new int[passenger];
        boolean[] drop = new boolean[passenger];
        System.out.println("내릴 층 :");
        for (int i=0; i<passenger; i++) {
            System.out.printf("탑승객 %d: ", i+1);
            int floor = scanner.nextInt();
            if (floor < 2 || floor > 100) {
                System.out.println("잘못된 입력입니다.");
                i--;
            } else {
            	goal[i] = floor;
                drop[i] = false;
            }
        }

        int current = 1;
        while (current <= 100) {
            System.out.printf("현재 층: %d층\n", current);
            for (int i = 0; i < passenger; i++) {
                if (!drop[i] && goal[i] == current) {
                    System.out.printf("탑승객 %d 하차\n", i+1);
                    drop[i] = true;
                }
            }
            current++;
        }
        current = 100;
        while (current > 1) {
            current--;
            System.out.printf("현재 층: %d층\n", current);
        }
        System.out.println("엘리베이터 1층 도착. 시스템 종료.");
		
		

	}

	
	public static void prac3v2() {


		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원을 입력하세요: ");
		int numPassengers = scanner.nextInt();
		scanner.nextLine();

		int[] destinations = new int[numPassengers];
		for (int i = 0; i < numPassengers; i++) {
			System.out.printf("%d번째 탑승객의 내릴 층: ", i+1);
			destinations[i] = scanner.nextInt();
			scanner.nextLine();
		}

		int currentFloor = 1;
		System.out.printf("엘리베이터 현재 층: %d\n", currentFloor);

		for (int floor = 1; floor <= 100; floor++) {
			boolean shouldStop = false;
			for (int destination : destinations) {
				if (floor == destination) {
					shouldStop = true;
					break;
				}
			}

			if (shouldStop) {
				currentFloor = floor;
				System.out.printf("엘리베이터 현재 층: %d\n", currentFloor);
				System.out.printf("%d층 도착, 하차\n", currentFloor);
				for (int i = 0; i < destinations.length; i++) {
					if (destinations[i] == currentFloor) {
						destinations[i] = -1;
						break;
					}
				}
			}
		}

		System.out.println("100층 도착.");

		for (int floor = 100; floor >= 1; floor--) {
			if (floor < 100) {
				System.out.printf("엘리베이터 현재 층: %d\n", floor);
				currentFloor = floor;
			}
			if (currentFloor == 1) break;
		}

		System.out.println("1층 도착, 시스템 종료.");

        
        
        
		
	}

	
	public static void pracvteacher() {//100층까지 올라가서 내려오기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("탑승 인원: ");
        int personCount = scanner.nextInt();
        
        int[] destFloorArr = new int[personCount];
        
        System.out.println("목적지 층수 입력(2~100) : ");
        for(int i=0; i<destFloorArr.length; i++) {
        	destFloorArr[i] = scanner.nextInt();
        	//입력한 값이 2~100이 아니면? >> 다시 입력해라
        }
        
        //1층~100층 >> 목적지 층수에 멈추기
        for(int i=1; i<=100; i++) {
        	System.out.println(i+"층");
        	
        	//내리는 층인지 확인
        	for(int j=0; j<destFloorArr.length; j++) {
        		if(i == destFloorArr[j]) {
        			System.out.println("도착");
        		}
        	}
        }
        
        //100 >> 1층
        for(int i=100; i>=100; i--) {
        	System.out.println(i+"층");
        }
		
		
	}
	

	public static void pracvteacherv2() { //입력층에서 최대층까지만 가고 내려오기
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원: ");
		int personCount = scanner.nextInt();

		int[] destFloorArr = new int[personCount];

		System.out.println("목적지 층수 입력(2~100) : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			//입력한 값이 2~100이 아니면? >> 다시 입력해라
		}


		//1층~100층 >> 목적지 층수에 멈추기

		int maxFloor = destFloorArr[0];
		for(int i=0; i<destFloorArr.length; i++) {
			if(maxFloor < destFloorArr[i])
				maxFloor = destFloorArr[i];
		}

		System.out.println("===== 올라갑니다 =====");
		for(int i=1; i<=maxFloor; i++) {
			System.out.println(i+"층");

			//내리는 층인지 확인
			for(int j=0; j<destFloorArr.length; j++) {
				if(i == destFloorArr[j]) {
					System.out.println("도착");
				}
			}
		}

		//100 >> 1층
		System.out.println("===== 내려갑니다 =====");
		for(int i=maxFloor; i>=1; i--) {
			System.out.println(i+"층");
		}

		
	}
	
	
	public static void pracvteacherv3() { //입력층에서 최대층까지만 가고 내려오기
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원: ");
		int personCount = scanner.nextInt();

		int[] destFloorArr = new int[personCount];

		System.out.println("목적지 층수 입력(2~100) : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			//입력한 값이 2~100이 아니면? >> 다시 입력해라
		}


		//1층~100층 >> 목적지 층수에 멈추기

		int maxFloor = destFloorArr[0];
		for(int i=0; i<destFloorArr.length; i++) {
			if(maxFloor < destFloorArr[i])
				maxFloor = destFloorArr[i];
		}
		
//		int floor = 1;
//		boolean isUp = true; //올라가는 중 false 내려가는 중
//		//flag
//		while(true) {
//			System.out.println(floor +"층");
//			
//			//100층까지 다 올라갔으면? 내려가는 방향으로 설정
//			if(floor>=100)
//				isUp = false;
//			
//			if(floor<=1 && isUp == false)
//				break;
//			
//			//isUp값에 의에 +1 -1 결정
//			if(isUp)
//				floor++;
//			else
//				floor--;
		
		
		int floor = 1;
		int flow = 1; //flow: 1	-1  층의 진행방향을 의미, 층 값 변화 연산에 참여

		//도착 층 표시
		//1~100층 : 100 >> 1
		//1~최대층 : 최대층 >> 1 

		//flag
		while(true) {
			System.out.println(floor +"층");

			//내리는 층인지 확인

			if(flow==1) {
				for(int j=0; j<destFloorArr.length; j++) {
					if(floor == destFloorArr[j]) {
						System.out.println("도착");
					}
				}
			}

			//100층까지 다 올라갔으면? 내려가는 방향으로 설정
			//if(floor>=100)
			if(floor>=maxFloor)
				flow = -1;

			if(floor<=1 && flow == -1)
				break;

			//isUp값에 의에 +1 -1 결정
			floor+=flow;


			
//			if(floor<=0)
//				break;
			
		}

		
	}
	
	
	public static void prac4() { //이건 내가 출력한 예제
		
		//		10층짜리 빌딩에 스마트 엘리베이터 시스템을 구축하려고 합니다. 
		//		1층에서 탑승한 승객들은 주사위를 두 번 던져 나온 눈의 합만큼의 층수로 이동하려고 합니다. 
		//		엘리베이터는 1층에서 출발하여 올라가면서 승객들을 내려주고, 모든 승객을 내린 후에는 다시 1층으로 돌아옵니다.


		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        final int MAX_FLOOR = 10;
	        final int MAX_PASSENGER = 5;
	        int passenger;

	        while (true) {
	            System.out.print("탑승 인원 (1명 이상 5명 이하): ");
	            passenger = scanner.nextInt();

	            if (passenger > 0 && passenger <= MAX_PASSENGER) {
	                break; // 올바른 범위의 입력이면 루프 종료
	            } else {
	                System.out.println("잘못된 입력입니다. 1명 이상 5명 이하로 입력해주세요.");
	            }
	        }
	        System.out.println();

	        int[] goalFloor = new int[passenger];
	        boolean droppedOff1 = false;
	        boolean droppedOff2 = false;
	        boolean droppedOff3 = false;
	        boolean droppedOff4 = false;
	        boolean droppedOff5 = false;
	        boolean[] droppedOff = new boolean[]{droppedOff1, droppedOff2, droppedOff3, droppedOff4, droppedOff5};
	        int[] droppedCountByFloor = new int[MAX_FLOOR + 1]; // 각 층에서 내린 승객 수
	        
	        
	        
	        
//	        System.out.println("======== 탑승객 목표 층 결정 (중복 없이) ========");
//	        for (int i = 0; i < passenger; i++) {
//	            int targetFloor;
//	            boolean isDuplicate;
//	            do {
//	                int dice1 = random.nextInt(1, 7);
//	                int dice2 = random.nextInt(1, 7);
//	                targetFloor = dice1 + dice2;
//	                if (targetFloor > MAX_FLOOR) {
//	                    targetFloor = MAX_FLOOR; // 10층 초과 시 10층으로 조정
//	                }
//	                isDuplicate = false;
//	                for (int j = 0; j < i; j++) {
//	                    if (goalFloor[j] == targetFloor) {
//	                        isDuplicate = true;
//	                        break;
//	                    }
//	                }
//	                if (isDuplicate) {
//	                    System.out.printf("탑승객 %d: 주사위 (%d + %d) => 목표 층: %d층 (중복, 다시 던집니다)\n", i + 1, dice1, dice2, targetFloor);
//	                } else {
//	                    System.out.printf("탑승객 %d: 주사위 (%d + %d) => 목표 층: %d층\n", i + 1, dice1, dice2, targetFloor);
//	                }
//	            } while (isDuplicate);
//	            goalFloor[i] = targetFloor;
//	        }
//	        System.out.println("=====================================================");
//	        System.out.println();
	        
	        
	        

	        System.out.println("======== 탑승객 목표 층 결정 (주사위 던지기) ========");
	        for (int i = 0; i < passenger; i++) {
	            int dice1 = random.nextInt(1, 7);
	            int dice2 = random.nextInt(1, 7);
	            int targetFloor = dice1 + dice2;
	            if (targetFloor > MAX_FLOOR) {
	                targetFloor = MAX_FLOOR; // 10층 초과 시 10층으로 조정
	            }
	            goalFloor[i] = targetFloor;
	            System.out.printf("탑승객 %d: 주사위 (%d + %d) => 목표 층: %d층\n", i + 1, dice1, dice2, targetFloor);
	        }
	        System.out.println("=============================================");
	        System.out.println();

	        int currentFloor = 1;
	        System.out.println("======== 엘리베이터 운행 시작 ========");
	        while (currentFloor <= MAX_FLOOR) {
	            System.out.printf("현재 층: %d층\n", currentFloor);
	            for (int i = 0; i < passenger; i++) {
	                boolean alreadyDropped = false;
	                if (i == 0) alreadyDropped = droppedOff[0];
	                else if (i == 1) alreadyDropped = droppedOff[1];
	                else if (i == 2) alreadyDropped = droppedOff[2];
	                else if (i == 3) alreadyDropped = droppedOff[3];
	                else if (i == 4) alreadyDropped = droppedOff[4];

	                if (!alreadyDropped && goalFloor[i] == currentFloor) {
	                    System.out.printf("탑승객 %d, %d층 하차\n", i + 1, currentFloor);
	                    if (i == 0) droppedOff[0] = true;
	                    else if (i == 1) droppedOff[1] = true;
	                    else if (i == 2) droppedOff[2] = true;
	                    else if (i == 3) droppedOff[3] = true;
	                    else if (i == 4) droppedOff[4] = true;
	                    droppedCountByFloor[currentFloor]++;
	                }
	            }
	            currentFloor++;
	        }
	        System.out.println("==================================");
	        System.out.println();

	        int lastDropOffFloor = 1;
	        for (int i = 1; i <= MAX_FLOOR; i++) {
	            if (droppedCountByFloor[i] > 0) {
	                lastDropOffFloor = i;
	            }
	        }

	        currentFloor = lastDropOffFloor;
	        while (currentFloor > 1) {
	            currentFloor--;
	            System.out.printf("현재 층: %d층\n", currentFloor);
	        }
	        System.out.println("엘리베이터 1층 도착");
	        System.out.println("==================================");
	        System.out.println();

	        System.out.println("======== 최종 결과 ========");
	        System.out.printf("총 탑승 인원: %d명\n", passenger);
	        System.out.println("층별 하차 인원:");
	        int maxDropCount = 0;
	        int mostFrequentFloor = 0;
	        int highestFloor = 0;
	        for (int i = 2; i <= MAX_FLOOR; i++) {
	            if (droppedCountByFloor[i] > 0) {
	                System.out.printf("%d층: %d명\n", i, droppedCountByFloor[i]);
	                if (droppedCountByFloor[i] > maxDropCount) {
	                    maxDropCount = droppedCountByFloor[i];
	                    mostFrequentFloor = i;
	                }
	                if (i > highestFloor) {
	                    highestFloor = i;
	                }
	            }
	        }
	        System.out.println("==========================");

	        if (mostFrequentFloor > 0) {
	            System.out.printf("\n가장 많이 내린 층: %d층 (%d명)\n", mostFrequentFloor, maxDropCount);
	        } else {
	            System.out.println("\n내린 승객이 없습니다.");
	        }

	        if (highestFloor > 0) {
	            System.out.printf("제일 높은 하차 층: %d층\n", highestFloor);
	        } else {
	            System.out.println("내린 승객이 없습니다.");
	        }



		
		
		

	}


}
