package study.inherit.abst01;

public class Coke extends Beverage {

	@Override
	public void checkSafety() {
		// TODO Auto-generated method stub
		System.out.println("찬산 당 정상범위 체크");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("뚜껑 딸깍");
	}

}
