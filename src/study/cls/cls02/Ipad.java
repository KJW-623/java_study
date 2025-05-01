package study.cls.cls02;

public class Ipad {
	
	String owner;//주인 소유자
	static String brand = "Apple";
	
	void powerOn() {
		System.out.println("아이패드 전원 켜짐");
		System.out.println(owner + "의 아이패드");
	}
	
	static void check() {
		System.out.println(Ipad.brand + "에서 만든 아이패드");
	}
}


//전자기기
//어디회사
//모델명
//종류