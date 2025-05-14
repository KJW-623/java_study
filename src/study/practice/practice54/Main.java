package study.practice.practice54;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성
		KRW krw = new KRW(1500);
		USD usd = new USD(100.50);
		EUR eur = new EUR(260.87);
		JPY jpy = new JPY(1400);

		// 부모 클래스를 통한 그룹화
		Currency[] currencies = { krw, usd, eur, jpy };

		// 모든 화폐정보를 출력
		for (Currency c : currencies) {
			System.out.println(c.toString());
		}
	}
}


/* 2. 상속을 통해 중복 코드를 제거 후, */
/* 3. 생성자를 올바르게 수정하시오. */