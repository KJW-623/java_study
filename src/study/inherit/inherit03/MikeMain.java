package study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mike m1 = new Mike();
		m1.volumeUp();
		m1.check();
		
		WirelessMike wm1 = new WirelessMike();
		wm1.volumeUp();
		
		BluetoothMike bm1 = new BluetoothMike();
		bm1.volumeUp();
		bm1.volumeUp(5);
		
		Mike m2 = new WirelessMike();
		Mike m3 = new BluetoothMike();
		m3.volumeUp();
		
		m2.volumeUp();
		m3.volumeUp();
		m3.check();
		
		bm1.check();
		
//		bm1.model();
//		bm1.getModel();
//		bm1.printInfo();
		
		//BluetoothMike bm2 = new WirelessMike();
		//BluetoothMike bm2 = new Mike();
		
		BluetoothMike bm2 = new BluetoothMike();
		bm2.isConnect = true;
		bm2.model = "성능 굿 마이크";
		bm2.price = 5000;
		bm2.type = "핀마이크";
		
		String str2 = bm2.toString();
		System.out.println(str2 + "이런 정보 있는 마이크 샀음");
		
		//Mike m3 = new BluetoothMike();
		m3.check();
		System.out.println(m3.toString());
		
		//Mike m1 = new Mike();
		m1.model = "일반마이크";
		System.out.println(m1.model);
		System.out.println(m1);
		
		
		
	}

}
