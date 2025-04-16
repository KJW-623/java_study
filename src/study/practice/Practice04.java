package study.practice;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		1. 아래 코드에서 예상되는 출력 결과를 작성하세요
		
//		int x = 2;
//		int y = 3;
//		int z;

//		System.out.println("x="+x + "y="+y); >> 문자열 x에 x값을 대입(y도 동일) :: x=2 y=3
//		System.out.println(x + y);			 >> 2 + 3 = 5
//		System.out.println(x++ + y++);		 >> 2 먼저 쓰고 증가, 3 먼저 쓰고 증가 :: 5
//		System.out.println("x="+x + " y="+y);>>	위에 증가한 값 x=3, y=4
//		z = ++x + ++y;						 >> z 값(증가 후 대입), x=4, y=5 :: 4+5=9
//		System.out.println("x="+x + " y="+y);>> x=4, y=5
//		z--;								 >> 9에서 1감소 :: z=8
//		x += --y;							 >> x 값에 y 1 감소한 것을 더함 :: 4+4 = 8
//		System.out.println("x="+x + " y="+y + " z="+z);		>> x=8 y=4 z=8
//		x = 10;
//		z = x/y++;							 >> z= x가 10, y가 1증가한 값으로 나눔 :: 10/5=2
//		System.out.println("x="+x + " y="+y + " z="+z);			>> x=10(위에서 값 변경) y=5 z=2
//		System.out.println("x="+(x*2) + " y="+ ++y + " z="+z);	>> x에 2 곱하기, y에 1 증가한 후 사용, z 대입 :: x=20 y=6 z=2
//		System.out.println("x="+x + " y="+y + " z="+z);			>> x값 대입, y값 대입, z값 대입 :: x=10 y=6 z=2

		
		
//		==============
		
		
		
//		2. 아래 조건에 대한 출력 결과를 예상해서 작성하세요
		
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		System.out.println( (a<b) && (c>=a) ); 		>> && - and로 모두 true가 나와야 함 :: 1<2(T) && 3>=1(T) = true
//		System.out.println( (a == b ) || ( a >= b) || (c > 10) );	
//								>> || - or로 하나만 true가 나와도 됨 :: 1=2(F) || 1>=2(F) || 3>10(F)
//		boolean result = !(c == 3); 	>> c=3 true로 들어가나 !로 인해 false 출력
//		System.out.println( result );
		
		
		
//		==============
		


//		3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.

//		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
//		6000원 이하 -> "훌륭"
//		6000원 초과 ~ 8000원 -> "선방"
//		8000원 초과 ~ 12000원 -> "눈물"
//		12000원 초과 -> "물로배채우기"
		

		int menuPrice = 11000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result = (menuPrice > 6000) ? (menuPrice > 8000) ? (menuPrice > 12000) ? "물로배채우기" : "눈물" : "선방" : "훌륭";
		System.out.println(result);
		
		int menuPrice1 = 4000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result3 = (menuPrice1 > 8000) ?		//조건식
				(menuPrice1 > 12000 ? "물로배채우기" : "눈물")	//참
				: (menuPrice1 > 6000 ? "선방" : "훌륭");		//거짓
		
		System.out.println(result3);

		
		
		
	}

}
