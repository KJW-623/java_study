package study.practice.practice52;

public class Clothing implements Orderable {

	private String name;
	private int price;
	private static final double DISCOUNT_RATE = 0.3;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;

	}

	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		return (int) (price * (1 - DISCOUNT_RATE));
	}
}