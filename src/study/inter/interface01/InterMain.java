package study.inter.interface01;

import java.util.ArrayList;
import java.util.List;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Interface01.code);
		
		int topp = Interface01.FISHBREAD_TOPPING_PIZZA;
		//Interface01.FISHBREAD_TOPPING_KIMCHI
		//FishBreadCode
		//CommonCode
		
		ImpleClass c = new ImpleClass();
		c.method1();
		c.method2();
		
		//Interface01 il = new Interface01(); 인터페이스 생성 불가(추상클래스와 유사)
		
		Interface01 i1 = new ImpleClass();
		i1.method1();
		i1.method2();
		
		Interface01 i11 = new ImpleClass02();
		i11.method1();
		i11.method2();
		
		Interface02 i22 = new ImpleClass02();
		i22.method3();
		
		Interface01[] arr = {new ImpleClass(), new ImpleClass02()};
		
		List<Interface01> list = new ArrayList<Interface01>();
		list.add(new ImpleClass());
		list.add(new ImpleClass02());
		
		test1(c);
		test1(i11);
		test1(arr[0]);
		test1(list.get(1));
		
		Interface01 if1 = test2();
		
//		Interface01 i11 = new ImpleClass02();
//		Interface02 i22 = new ImpleClass02();
		
		ImpleClass02 ic02 = (ImpleClass02)i11;
		if(i1 instanceof ImpleClass) {
		ImpleClass ic = (ImpleClass)i1;
		}
		
	}
	
	
	public static void test1(Interface01 inter) {
		
	}
	
	public static Interface01 test2() {
		return new ImpleClass();
	}

}
