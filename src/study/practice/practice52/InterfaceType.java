package study.practice.practice52;

public class InterfaceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성
		Food jokbal = new Food("족발", 19800);
		Electronics airpod = new Electronics("에어팟", 199000);
		Clothing shirts = new Clothing("셔츠", 49900);

		// 총합 계산
		Orderable[] items = {jokbal, airpod, shirts};
		int totalPrice = 0;
		for (Orderable item : items) {
			totalPrice += item.discountedPrice();
		}

		// 결과 출력
		System.out.println("총합: " + totalPrice + "원");

	}

}
