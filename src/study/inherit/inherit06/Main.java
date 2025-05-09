package study.inherit.inherit06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Driver d= new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(b);
		d.drive(t);
		
		Bus b2 = takeBus();
		Taxi t2 = takeTaxi();
		
//		Bus b3 = takeTaxi();
//		int b3 = "abc";
		
		Vehicle v = takeTaxi();
		Vehicle v2 = new Taxi();
		
	}
	
	public static Bus takeBus() {
		//Bus b = new Bus();
		return new Bus();
	}
	
	public static Taxi takeTaxi() {
		//Taxi t = new Taxi();
		return new Taxi();
	}
	
	public static Vehicle takeVehicle() {
		//return new Vehicle();
		return new Bus();
		//return new Taxi();
	}

}
