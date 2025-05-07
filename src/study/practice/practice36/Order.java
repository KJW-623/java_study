package study.practice.practice36;

class Order {
	int orderNum;
	Menu[] menus;
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}  
	public int totalPrice() {
		int total=0;
		for(int i=0; i<menus.length; i++) {
			Menu menu = menus[i];
	        total += menu.price;
		}
		return total;
	}
}
