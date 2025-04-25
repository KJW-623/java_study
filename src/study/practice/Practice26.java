package study.practice;

public class Practice26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		학생 10명의 시험 점수가 다음과 같이 주어졌다고 가정합니다.
		//		이 점수들을 배열에 저장한 뒤, 다음 조건에 따라 통계를 계산하는 프로그램을 작성하세요.
		//
		//		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		//
		//		최고 점수와 최저 점수를 출력하세요.
		//		평균 점수를 출력하세요.
		//		80점 이상인 학생의 수를 출력하세요.
		//
		//		출력 예)
		//
		//		최고 점수: 100
		//		최저 점수: 63
		//		평균 점수: 82.5
		//		80점 이상 학생 수: 6명
		
		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};


		//각각 나눈 거
//		int max = scores[0];
//		for (int i=0; i<scores.length; i++) {
//			if (scores[i]>max) { 
//				//지금까지의 최대값인 max보다 배열에 있는 값이 더 크다
//				//더 큰 값을 찾음
//				max = scores[i];
//			}
//		}
//		System.out.printf("최고점수: %d \n", max);
//		
//		
//		int min = scores[0];
//		for (int i=0; i<scores.length; i++) {
//		    if (scores[i]<min) {
//		        min = scores[i]; 
//		    }
//		}
//		System.out.printf("최저점수: %d \n", min);
//		
//		
//		int sum = 0;
//		for (int i=0; i<scores.length; i++) {
//		    sum += scores[i];
//		}
//		double average = (double) sum / scores.length;
//		System.out.printf("평균 점수: %.1f \n", average);
//		
//		
//		int count = 0;
//		for (int i=0; i<scores.length; i++) {
//		    if (scores[i]>=80) {
//		        count++;
//		    }
//		}
//		System.out.printf("80점 이상 학생 수: %d \n", count);
		
		
		
		
		
		//모두 합친 거
		int max = scores[0];
		int min = scores[0];
		int sum = 0;
		int count = 0;
		for (int i=0; i<scores.length; i++) {
			if (scores[i]>max) { 
				//지금까지의 최대값인 max보다 배열에 있는 값이 더 크다
				//더 큰 값을 찾음
				max = scores[i];
			}

			if (scores[i]<min) {
				min = scores[i]; 
			}

			sum += scores[i];

			if (scores[i]>=80) {
				count++;
			}

		}
		
		double average = (double) sum / scores.length;
		
		System.out.printf("최고점수: %d \n", max);
		System.out.printf("최저점수: %d \n", min);
		System.out.printf("평균 점수: %.1f \n", average);
		System.out.printf("80점 이상 학생 수: %d \n", count);
	
		
		
		
	}

}
