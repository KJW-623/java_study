package study.practice;

import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}
	
	public static void prac1() {
		
		Scanner scanner = new Scanner(System.in);

//		String addOrder = "y";
//		while(!addOrder.equals("n")) {
//		}
		
		int menu1Count = 0; //각 메뉴 몇잔 시켰는지 개수
		int menu2Count = 0;
		int menu3Count = 0;
		
		while(true) {
			
			System.out.println("======== 메뉴 ========");
			System.out.printf("1.%-8s      %5d원\n", "아메리카노", 3500);
			System.out.printf("2.%-8s      %5d원\n", "카페라떼", 4100);
			System.out.printf("3.%-8s      %5d원\n", "바닐라라떼", 4300);
			System.out.println("=====================");
			
			//메뉴 입력
			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();
			
			if(!(menu>=1 && menu<=3)) {//정상범위가 아니면!
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue; //이 코드 이후로 현재 턴 실행 생략 >> 다음 턴
			}
			
			//수량 입력
			System.out.print("수량 선택 : ");
			int count = scanner.nextInt();
			
			//기록!! 무슨 메뉴를 몇 잔 시켰냐?
			//무슨 메뉴? >> menu
			//몇 잔? >> count
			
			if(menu == 1)
				menu1Count += count;
			else if (menu == 2)
				menu2Count += count;
			else
				menu3Count += count;
			
			scanner.nextLine(); //clear
			
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
				if(menu1Count>0) {
					System.out.printf("아메리카노 %d잔 : %원\n", menu1Count, menu1Count*3500);
					total = total + menu1Count*3500;
				}
				if(menu2Count>0) {
					System.out.printf("카페라떼 %d잔 : %원\n", menu2Count, menu2Count*4100);
					total = total + menu2Count*4100;
				}
				if(menu3Count>0) {
					System.out.printf("바닐라라떼 %d잔 : %원\n", menu3Count, menu3Count*4300);
					total = total + menu3Count*4300;
				}
				System.out.println("=====================");
				System.out.printf("총액 : %원", menu1Count*3500, menu2Count*4100, menu3Count*4300);
				break;
			}
		}
		
	}
	
	
	public static void prac2() {
		
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] priceArr = {3500, 4100, 4300};
		
		int[] countArr = new int[3]; //0초기화
		
		
		// menuArr[2] priceArr[2] countArr[2]
		
		
	}
	
	
	
	
	
	public static void my() {
		
		Scanner scanner = new Scanner(System.in);
		boolean Order = true;
		String list = "";
		int total = 0;

		while (Order) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1.아메리카노      3500원");
			System.out.println("2.카페라떼        4100원");
			System.out.println("3.바닐라라떼      4300원");
			System.out.println("=====================");

			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();

			String item = "";
			int price = 0;
			switch (menu) {
			case 1:
				item = "아메리카노";
				price = 3500;
				break;
			case 2:
				item = "카페라떼";
				price = 4100;
				break;
			case 3:
				item = "바닐라라떼";
				price = 4300;
				break;
			default:
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}

			System.out.print("수량 선택 : ");
			int count = scanner.nextInt();
			if (count>0) {
				list += item + " " + count + "잔 : " + price * count + "원\n";
				total += price * count;

				System.out.print("추가 주문하시겠습니까?(y/n): ");
				scanner.nextLine();
				String extra = scanner.nextLine();
				if (extra.equals("y")) {

				} else if (extra.equals("n")) {
					System.out.println("======== 주문 내역 ========");
					System.out.println(list);
					System.out.println("=========================");
					System.out.println("총액: " + total + "원");
					Order = false;
				} else {
					System.out.println("잘못 선택하셨습니다. 'y' 또는 'n'을 입력해주세요.");
				}
			} else {
				System.out.println("잘못된 수량 입력입니다. 숫자를 입력해주세요.");
				scanner.next();
			}

		}
		System.out.println();
	}

}
