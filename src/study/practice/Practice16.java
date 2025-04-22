package study.practice;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		1.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		몇번째 수인가요? : 그에 해당하는 수를 출력
		ex) 10 20 30 50 90
		몇번째 수인가요? 5
		결과 : 90
		*/
		
		//배열
		int [] arr = {10, 20, 30, 50, 90};
		
		//index: 0 1 2 3 4
		//사용자 : 1 2 3 4 5
		
		//사용자가 선택한 번째 수 -1 인덱스 위치
		
		Scanner scanner = new Scanner(System.in);
		int[] numArr = new int[5];
		System.out.println("5개 수 입력:");
		
		for(int i=0; i<numArr.length; i++) {	//반복문 사용
			numArr[i] = scanner.nextInt();
		}
		
//		numArr[0] = scanner.nextInt();		//반복문 없이
//		numArr[1] = scanner.nextInt();
//		numArr[2] = scanner.nextInt();
//		numArr[3] = scanner.nextInt();
//		numArr[4] = scanner.nextInt();

		System.out.print("몇 번째? 입력:");
		int index = scanner.nextInt();

		System.out.println("결과 : " + numArr[index - 1]);
		
		
//		System.out.println("5개 수 입력:");		//배열 안 쓰는 거
//		int n1 = scanner.nextInt();
//		int n2 = scanner.nextInt();
//		int n3 = scanner.nextInt();
//		int n4 = scanner.nextInt();
//		int n5 = scanner.nextInt();
//		
//		System.out.println("몇 번째? 입력:");
//		int index = scanner.nextInt();
//		
//		if(index==1)
//			System.out.println(n1);
//		else if(index==1)
//			System.out.println(n1);
//		// ...

		
		
		
		
		
		/*
		2.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		받은후에 순서를 거꾸로 출력하세요.
		ex) 1 2 3 4 5
		결과 : 5 4 3 2 1
		*/
		
		// 0 1 2 3 4
		// 4 3 2 1 0 
		
		// 4 3 2 1 0
		// 0 1 2 3 4
		
		// n5 n4 n3 n2 n1
		
		int[] numArr1 = new int[5];

		System.out.println("5개 수 입력:");
		
//		for(int i=0; i<numArr1.length; i++) {	//0 1 2 3 4 입력
//			numArr1[i] = scanner.nextInt();
//		}
//		
//		for(int i=numArr1.length-1; i>=0; i--) { // 4 3 2 1 0
//			System.out.print(numArr1[i] + " ");
//		}
        
		
		for(int i=numArr1.length-1; i>=0; i--) {	//4 3 2 1 0 입력
			numArr1[i] = scanner.nextInt();
		}
		
		for(int i=0; i<numArr1.length; i++) { // 0 1 2 3 4
			System.out.print(numArr1[i] + " ");
		}
		
        System.out.println();
		
		
		
		/*
		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1   2   3   4
		5   6   7   8
		9  10 11 12
		13 14 15 16
		*/
        
        //int[][] arr1 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        
        int[][] arr1 = new int [4][4];
        
        int num = 1;
        for(int i=0; i<arr1.length; i++) {
        	for(int j=0; j<arr1[i].length; j++) {
//        		arr1[i][j] = num;   // 1 2
//        		num++;
        		arr1[i][j] = (4*1) + (j+1);
        	}
        }
        
        
        for(int i=0; i<arr1.length; i++) {	//i: 0 1 2 3 행 인덱스
        	for(int j=0; j<arr1[i].length; j++) {
        		System.out.printf("%3d", arr1[i][j]);
        	}
        	System.out.println();
        }
		
        
        
        
		
	}

}
