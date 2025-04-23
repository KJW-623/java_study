package study.practice;

import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*****
//		****
//		***
//		**
//		*
		
		//for(초기화; 조건; 증감)
		//	 i=1; i<=10; i++
		//	 i=num; i<=10; i++
		//	 i=1; i>num; i--
		// 	 i=1; i<=10; i=i+num
		
		for (int i=5; i>0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
//		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*
//		**
//		***
//		****

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		int num = scanner.nextInt();

		for (int i=1; i<=num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		

//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
//
//		입력 : 3
//
//		*
//		**
//		***
//		**
//		*

		

		System.out.print("숫자를 입력하세요: ");
		int n = scanner.nextInt();

		for (int i=1; i<=n; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=n-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		
		int total = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				total = total +  j;
			}
		}
		System.out.println("결과: " + total);
		
		int sum1=0;
		for(int i=1; i<=10; i++) {
				sum1 = sum1 + (i * (11-i));
			}
		
		
		

//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		
		int sum = 0;
		int i = 1;
		
		
		while (true) {
			if (i % 2 == 0) { // 짝수
				sum -= i;
			} else { // 홀수
				sum += i;
			}
			
			//i:199
			
			if(sum>=100)
				break;
			
			i++;	//i:200
			
		}
		
		System.out.println("100 이상이 된 시점의 누적합:" + sum);
		System.out.println("얼마까지 더해서 100이 넘었는지:" + i);

		
		
		
		
	
	}
}
