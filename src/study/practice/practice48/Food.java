package study.practice.practice48;

public class Food {
	String name; //이름
	int price; //가격
	int stock; //재고
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		stock = 5; //음식 재고 초기화  (초기에 5개 재고가 있다고 가정)
	}
	
	// new Food("김밥", 3000);
	// new Food();
	// f.setName("김밥");
	// f.setPrice(3000);
	
	public String toString() {
		return String.format("이름:%s 가격:%d원 재고:%d개", name, price, stock);
	}
	
	public String getFoodInfo() {
		return String.format("%s 가격:%d원 재고:%d개", name, price, stock);
	}
	
	//재고 조절(설정)하는 메소드
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	// addStock(int count) -> stock + count
	// subStock(int count) -> stock - count
	
	//재고 갯수 조정			//modifyStock(5)  modifyStock(-3)
	public void modifyStock(int count) {
		
		//재고3개 5개주문 상황
		//1) 주문 불가
		//2) 최대갯수까지만 처리
		if(stock + count < 0) {
			stock = 0;
		} else {
			this.stock += count;
		}
	}
}










