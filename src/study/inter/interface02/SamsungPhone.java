package study.inter.interface02;

public class SamsungPhone implements Callable, Connectable {

	//필드변수
	int callStatus; //전화상태
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 전화 통화");
		callStatus = Callable.CALL_ON;
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 블루투스 연결");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 블루투스 연결종료");
	}

}
