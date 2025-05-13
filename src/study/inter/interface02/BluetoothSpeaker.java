package study.inter.interface02;

public class BluetoothSpeaker implements Connectable {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("스피커 블루투스 연결");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("스피커 블루투스 연결종료");
	}

	//블루투스 스피커
	
	//소리가 나는
	//블루투스로 연결할 수 있어야 한다!!
}
