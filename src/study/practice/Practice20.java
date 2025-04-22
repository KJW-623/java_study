package study.practice;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prac3();
	}
	
	public static void prac3() {

		Scanner scanner = new Scanner(System.in);


		//1번

		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				if (2*x + 4*y == 10) {
					System.out.printf("x:%d y:%d", x, y);
				}
			}
		}
		
		//for (int x=1; 2*x<10; x++) {
		//	for (int y=1; 4*y<10; y++) {


		
		//2번

		System.out.print("두 개의 정수 입력: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1 > num2) { //num1이 더 큼
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		} else {//num2이 더 큼 (num1==num2) 
			System.out.printf("%d - %d = %d\n", num2, num1, num2-num1);
		}




		//3번   

		int[] yutArr = new int[4];
		
		System.out.println("윷 값 입력(1:뒤집어짐, 0:안 뒤집어짐):");
		for (int i = 0; i <yutArr.length; i++) {
			yutArr[i] = scanner.nextInt();
		}
		
		int sum= 0;
		for (int i = 0; i < 4; i++) {
			sum = sum + yutArr[i];
		}
		
		//int sum= 0;
		//for (int i = 0; i <yutArr.length; i++) {
		//		yutArr[i] = scanner.nextInt();
		//		sum = sum + yutArr[i];
		//}
		
		switch(sum) {
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		case 0: //default
			System.out.println("모");
			break;
		}

		
		
		//4번

		System.out.print("정수입력: ");
		int star = scanner.nextInt();

		for (int i=1; i<star; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		int i=1;
		while(i<=star) {
			System.out.print("*");
			i++;
		}
		
	}
}
