package study.refer;

public class Reference06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int[] arr = {10, 20, 30, 40, 50};

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			//sum += i; // 0 1 2 3 4
			sum += arr[i]; // 10 20 30 40 50
		}
		System.out.println(sum);

		sum = 0;
		int index = 0;
		for (int num : arr) { // num 변수에 배열의 값이 매핑
			sum += num;
			
			index++;
			if (index >= 3) {
				break;

			//arr 의 길이만큼 처음부터 끝까지 반복
			//값만 받아옴, 인덱스는 모름(필요하면 따로 처리)
			}
		}
		System.out.println(sum);


		int[] scores = {90,95,100,80,70};
		
		for(int score : scores) {
			System.out.println(score + " ");
		}
		System.out.println();
		for(int score : scores) {
			score = score-5;
		}
		System.out.println();
		
		
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i]-5;
		}
		System.out.println();
		for(int score : scores) {
			System.out.println(score + " ");
		}
		System.out.println();
		
		










	}

}
