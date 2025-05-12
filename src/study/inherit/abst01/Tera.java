package study.inherit.abst01;

public class Tera extends Beverage {

	@Override
	public void checkSafety() {
		// TODO Auto-generated method stub
		System.out.println("알콜 도수 정상 체크");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("병따개로 펑~");
	}

}
