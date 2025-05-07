package study.practice.practice36;

//Base코드
public class ChineseRestaurant {
	public static void main(String[] args) {
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		Order order = new Order(123, menuArr);
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
	}
}