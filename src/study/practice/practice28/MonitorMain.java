package study.practice.practice28;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		
		m1.inch = 65;
		m1.company = "삼성";
		m1.model = "더프레임";
		m2.inch = 80;
		m2.company = "LG";
		m2.model = "올레드";
		
		System.out.print("제조사: " + m1.company);
		System.out.print(", 모델: " + m1.model);
		System.out.print(", 인치: " + m1.inch);
		System.out.println();
		System.out.print("제조사: " + m2.company);
		System.out.print(", 모델: " + m2.model);
		System.out.print(", 인치: " + m2.inch);
		System.out.println();
		
		System.out.println();
		m1.printMonitorInfo();
		m2.printMonitorInfo();
		
	}

}
