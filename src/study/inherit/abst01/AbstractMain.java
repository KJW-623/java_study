package study.inherit.abst01;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coke c1 = new Coke();
		Tera t1 = new Tera();
		
		c1.name = "코카콜라";
		c1.ml = 310;
		
		t1.name = "테라";
		t1.ml = 500;
		
		c1.intro();
		t1.intro();
		
		Beverage[] arr = {c1, t1};
		
		arr[0].checkSafety();
		arr[0].open();
		
		arr[1].checkSafety();
		arr[1].open();
		
	}

}
