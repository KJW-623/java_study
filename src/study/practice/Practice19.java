package study.practice;

import java.util.Scanner;

public class Practice19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prac2();

	}

	public static void prac2() {


		int[][] arr = new int[5][5]; //  초기화 0
		
		// 1 or 2 or 3
		
		//			5
		for (int i = 0; i <arr.length; i++) {	//i: 0 1 2 3 4
			for (int j = 0; j <arr[i].length; j++) {	//j:0 1 2 3 4
				if (i>j) {
					arr[i][j] = 3;
				} else if (i<j) {
					arr[i][j] = 2;
				} else {
					arr[i][j] = 1;
				}
			}
		}

		
		// 배열 출력
		for (int i = 0; i <arr.length; i++) {//i: 0 1 2 3 4
			for (int j = 0; j <arr[i].length; j++) {//j:0 1 2 3 4
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		//주 대각선 값은 1
		//주 대각선 위쪽 영역 값은 2
		//주 대각선 아래쪽 영역 값은 3



	}
}
