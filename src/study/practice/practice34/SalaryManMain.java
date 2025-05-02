package study.practice.practice34;

public class SalaryManMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SalaryMan sm = new SalaryMan();
//		sm.getAnnualGross();
		
		SalaryMan sm = new SalaryMan();
		
		SalaryMan[] smArr = {sm, new SalaryMan()};
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}
