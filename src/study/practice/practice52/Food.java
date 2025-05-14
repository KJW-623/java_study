package study.practice.practice52;

public class Food implements Orderable {

	private String name;
	private int price;
	private static final double DISCOUNT_RATE = 0.1;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		return (int) (price * (1 - DISCOUNT_RATE));
	}

}
