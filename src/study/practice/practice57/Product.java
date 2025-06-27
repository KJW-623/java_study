package study.practice.practice57;

public class Product {

	int P_CODE;
	String P_NAME;
	int P_PRICE;
	
	public Product() {}
	
	public Product(int p_CODE, String p_NAME, int p_PRICE) {
		super();
		P_CODE = p_CODE;
		P_NAME = p_NAME;
		P_PRICE = p_PRICE;
	}

	public int getP_CODE() {
		return P_CODE;
	}

	public void setP_CODE(int p_CODE) {
		P_CODE = p_CODE;
	}

	public String getP_NAME() {
		return P_NAME;
	}

	public void setP_NAME(String p_NAME) {
		P_NAME = p_NAME;
	}

	public int getP_PRICE() {
		return P_PRICE;
	}

	public void setP_PRICE(int p_PRICE) {
		P_PRICE = p_PRICE;
	}
	
	
	
	
	
	
}
