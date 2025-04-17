package study.practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		//출생년도와 주민등록번호 뒷자리 첫번째 숫자를 입력받아서, 나이와 성별을 출력하세요.
		//기준은 2025년으로 함.
		//나이는 단순하게 2025년과의 차이로 함 (만 나이, 월 따지지 않음)
		//2000년생 = 26살
		//1996년생 = 30살
	
		//2000년생 이후로는 뒷자리 남자 : 3, 여자 : 4
		//2000년생 이전은 뒷자리 남자 : 1, 여자 : 2
		//그 외에 케이스가 들어오면 잘못된 입력이라고 출력하도록 처리.
		//어떤 경우가 잘못된 경우일지 한번 생각해보세요~

		//주민번호 뒷자리 첫번째 수 구분.
		//남자 : 1 이거나 3
		//여자 : 2 이거나 4

		//예시 1)
		//출생년도를 입력하세요 : 2000
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 4
		//결과 : 26살 여자입니다.

		//예시 2)
		//출생년도를 입력하세요 : 1998
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 1
		//결과 : 28살 남자입니다.
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		
		
		//비교 연산 로직
		
		//2000년생 26살
		// 2025-2000 = 25+1 = 26
		//나이계산 기준년도(2025) - 입력한 년도(2000) + 1 >> 나이
		//		2026 - 입력한 년도 >> 나이
		
        //int age = 2026 - Year; //2025년도 기준 나이계산
		int age = 2025 - year + 1; //2025년도 기준 한국나이계산(+1)

		
		//년도 + 뒷자리가 잘못된 케이스는 구별하지 못하는 상태
        if ( number == 1 ) {
        	System.out.println(age + "살 남자");
        } else if ( number == 2 ) {
        	System.out.println(age +"살 여자");
        } else if ( number == 3 ) {
        	System.out.println(age +"살 남자");
        } else if ( number == 4 ) {
        	System.out.println(age +"살 여자");
        } else {
            System.out.println("잘못된 입력");
        }
        
        
        
        
        if ( number == 1 && year < 2000) {
        	System.out.println(age + "살 남자");
        } else if ( number == 2 && year < 2000 ) {
        	System.out.println(age +"살 여자");
        } else if ( number == 3 && year >= 2000 ) {
        	System.out.println(age +"살 남자");
        } else if ( number == 4 && year >= 200 ) {
        	System.out.println(age +"살 여자");
        } else {
            System.out.println("잘못된 입력");
        }
        
        
        if( ( number == 1 && year < 2000 ) || ( number == 2 && year < 2000 )
        		|| ( number == 3 && year >= 2000 ) || ( number == 4 && year >= 200 ) ) {
        } else {
        	System.out.println("잘못된 입력");
        }
        
        
        
        if( ( 	(number == 1 || number == 2 ) && year < 2000 )
        		||
        	( 	(number == 3 || number == 4 ) && year >= 2000 )	) {
        	
        	//입력은 정상이다! 확정! 
        	
        	if (number == 1 || number == 3) {
        		System.out.println(age +"살 남자");
        	}
        	if (number == 2 || number == 4) {
        		System.out.println(age +"살 여자");
        	}
        	
        	if (number == 1 || number == 3) {
        		System.out.println(age +"살 남자");
        	} else {
        		System.out.println(age +"살 여자");
        	}
        	
        } else {
        	System.out.println("잘못된 입력");
        }

        

	}

}
