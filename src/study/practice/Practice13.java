package study.practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		System.out.print("정수를 입력하세요: ");
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		System.out.println((num%2==0) ? "even":"odd"); //case2
		
		
//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		
		System.out.print("정수를 입력하세요: ");
		int seven = scanner.nextInt();

		if (seven % 7 == 0) {
			System.out.println("7의 배수입니다");
		} else {
			System.out.println("아닙니다");
		}


//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		

		int multi = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 == 0) {
				multi += i;
			}
		}
		System.out.println("1~1000까지 5의 배수의 합:" + multi);
		
		multi = 0;
		for (int i = 1; i <= 1000; i++) {
				multi += i;
		}
		System.out.println("1~1000까지 5의 배수의 합:" + multi); //case2


//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********
		
		System.out.print("1부터 50 사이의 정수를 입력하세요: ");
		int star = scanner.nextInt();

		for (int i=1; i<star; i++) {
			System.out.print("*");
		}


		        
//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4 .....
		
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				result += i;
			} else {
				result -= i;
			}
		}
		System.out.println("계산 결과:" + result);
		        

//		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.

		int sum = 0;
		int ber = 1;
		while (sum < 1000) {
			sum += ber;
			ber++;
		}
		System.out.println("1000이 넘는 누적 합:" + sum);
		
		ber=1;		//case2
		sum = 0;
		while(true) {
			sum = sum +1;
			ber++;
			
			if(sum >= 1000) {
				break;
			}
		}

		        
//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		        
		System.out.print("1부터 9까지의 정수를 입력하세요: ");
		int dan = scanner.nextInt();
		
		
		if(num>=1 && num<=9) {
			for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d =%d\n", num, i, dan*i);
			}
		}
		
		
		
		
		
		
	}

}
