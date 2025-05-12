package study.inherit.abst01;

public abstract class Beverage {
	String name;
	int ml;
	
	public void intro() {
		System.out.println("저는 음료입니다");
	}
	
	public abstract void checkSafety();
	
	public abstract void open(); 
	
	
	
}
