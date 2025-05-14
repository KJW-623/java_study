package study.practice.practice54;

/* 1. 부모 클래스 Currency를 만드시오. */
public class Currency {

	protected double amount;
    protected String notation;

    public Currency(double amount, String notation) {
        this.amount = amount;
        this.notation = notation;
    }

    /* 4. toString() 메소드를 오버라이딩 하시오. */
    @Override
    public String toString() {
        return String.format("%s: %.2f %s", getClass().getSimpleName(), this.amount, this.notation);
    }
    
}
