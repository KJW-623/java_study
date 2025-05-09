package study.inherit.inherit06;

public class Driver {
	
//	public void drive(Bus bus) {
//		bus.run();
//	}
//	
//	public void drive(Taxi taxi) {
//		taxi.run();
//	}
	
	public void drive(Vehicle vehicle) { //매개변수의 다양성
		System.out.println("Driver 운전 시작");
		vehicle.run();
	}
	
}
