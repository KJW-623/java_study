package study.practice.practice30;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor m1 = new Monitor("삼성", 27, 150000);
		Monitor m2 = new Monitor("LG", 32, 330000);

		
		m1.setColor("검은색");
		m1.setResolution(1080, 780);

		m2.setColor("흰색");
		m2.setResolution(4096, 2048);

		
		System.out.println(" 모니터 1 정보 ");
		m1.displayInfo();
		System.out.println(" 모니터 2 정보 ");
		m2.displayInfo();

		
		int increasedPrice = m2.increasePrice(70000);
		System.out.println("\n- 모니터2 가격인상 후 총 금액 -");
		System.out.println("LG 모니터 최종 가격: " + increasedPrice + "원");
		System.out.println("-------------------------");

		
		System.out.println("\n 업데이트 모니터 1 정보 ");
		m1.displayInfo();
		System.out.println(" 업데이트 모니터 2 정보 ");
		m2.displayInfo();
	

	}

}
