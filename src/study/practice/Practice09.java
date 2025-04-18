package study.practice;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		prac1();
		prac2();
		
		
		
}
	
	
	public static void prac1() {
		
		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복
		*/
		
		
		int i = 0;
		
		
		for(i=0; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("==========");

		
		for(i=1; i<=9; i++) {
			System.out.println(i);
		}
		
		System.out.println("==========");

		for(i=10; i<=100; i += 10) {
			System.out.println(i);
		}
		
		System.out.println("==========");

		for(i=25; i<=100; i += 25) {
			System.out.println(i);
		}
		
		System.out.println("====================");

		/*		
		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
        int j = 50;
        while (j <= 55) {
            System.out.println(j);
            j++;
        }
        
        System.out.println("==========");

        j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
      
        System.out.println("==========");

        j = 30;
        while (j >= 0) {
            System.out.println(j);
            j -= 5;
        }
       
        System.out.println("==========");

        j = 30;
        while (j >= 5) {
            System.out.println(j);
            j -= 5;
        }
      
        System.out.println("==========");

        j = 25;
        while (j >= 0) {
            System.out.println(j);
            j -= 5;
        }
		
		
		
		
		
		
		
		
		

		
		
		
	}
	
	
	//if while 서로 반대로
	public static void prac2() {
		
		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복
		*/
		
		
		int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("==========");
        
        i = 1;
        while (i <= 9) {
            System.out.println(i);
            i++;
        }

        System.out.println("==========");
    
        i = 10;
        while (i <= 100) {
            System.out.println(i);
            i += 10;
        }
        
        System.out.println("==========");
        
        i = 25;
        while (i <= 100) {
            System.out.println(i);
            i += 25;
        }
		
		System.out.println("====================");

		/*		
		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
        int j = 50;
 
        for(j=50; j<=55; j++) {
			System.out.println(j);
		}
        
        System.out.println("==========");

        for(j=10; j>=1; j--) {
			System.out.println(j);
		}
      
        System.out.println("==========");

        for(j=30; j>=0; j-=5) {
			System.out.println(j);
		}
       
        System.out.println("==========");

        for(j=30; j>=5; j-=5) {
			System.out.println(j);
		}
      
        System.out.println("==========");

        for(j=25; j>=0; j-=5) {
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
