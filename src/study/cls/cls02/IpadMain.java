package study.cls.cls02;

import java.util.Scanner;

public class IpadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ipad pad1 = new Ipad();
		pad1.owner = "오이영";
		
		pad1.powerOn();
		
		Ipad pad2 = new Ipad();
		pad2.owner = "구도원";
		
		pad2.powerOn();
		
		Scanner scanner = new Scanner(System.in);
		
		String ss = "123";
		int ii = Integer.parseInt(ss);
		
		int num = (int)(Math.random()*6)+1;
		
		System.out.println(Math.PI);
		
		Ipad.check();

	}

}
