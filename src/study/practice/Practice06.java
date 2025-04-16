package study.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변 : ");
		int tri1 = scanner.nextInt();
		
		System.out.print("높이 : ");
		int tri2 = scanner.nextInt();
		
		double tri = (double)((tri1*tri2)/2);
		
		System.out.printf("넓이 : %d*%d/2=%.2f\n", tri1, tri2, tri);
		
		
		
		
//		==========
		
		
		
		

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		
		System.out.print("윗변 : ");
		int squ1 = scanner.nextInt();
		
		System.out.print("밑변 : ");
		int squ2 = scanner.nextInt();
		
		System.out.print("높이 : ");
		int squ3 = scanner.nextInt();
		
		double squ = (squ1+squ2) * squ3 / 2.0;
		
		System.out.printf("넓이 : (%d+%d)*%d/2=%.2f\n", squ1, squ2, squ3, squ);
		
		
		
		
//		==========
		
		
		
		

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		
		int student = 24;
		int cookie = 100;

		int one = 100 / 24;
		int other = 100 % 24;

		System.out.println("한 명당 받을 수 있는 과자 수: " + one + "개");
		System.out.println("나누어 주고 남은 과자 수: " + other + "개");
		
		
		
//		==========
		
		
		
		

		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		
		System.out.print("세자리의 정수 : ");
		int three = scanner.nextInt();

		int first = three/100;
		int second = (three%100)/10;
		int third = three%10;

		System.out.println("백의자리 : " + first);
		System.out.println("십의자리 : " + second);
		System.out.println("일의자리 : " + third);
		

		
		
		
//		==========
		
		
		
		
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x + "y="+y);
		
		//x와 y를 바꾼 작업
		int any = x;
		x=y;
		y=any;

		System.out.println("x="+x + "y="+y);
		
		
	}

}
