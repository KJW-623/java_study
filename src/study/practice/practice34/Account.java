package study.practice.practice34;

public class Account {

	//	다음을 만족하는 클래스 Account를 작성하시오.
	//	· 다음의 2 개의 필드를 선언
	//	private String owner;
	//	private long balance;
	//	· 위 모든 필드에 대한 getter와 setter의 구현
	//	· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
	//	다음 기능을 추가하여 작성하시오.
	//	· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
	//	public long deposit(long amount)
	//	· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
	//	public long withdraw(long amount)
	//	· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력
	//	메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
	//	· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
	//	· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력

	 private String owner;
	    private long balance;

	    // 기본 생성자
	    public Account() {
	    }

	    // owner 필드만 초기화하는 생성자
	    public Account(String owner) {
	        this.owner = owner;
	        this.balance = 0;
	    }

	    // 모든 필드를 초기화하는 생성자
	    public Account(String owner, long balance) {
	        this.owner = owner;
	        this.balance = balance;
	    }

	    // getter 메소드
	    public String getOwner() {
	        return owner;
	    }

	    public long getBalance() {
	        return balance;
	    }

	    // setter 메소드
	    public void setOwner(String owner) {
	        this.owner = owner;
	    }

	    public void setBalance(long balance) {
	        this.balance = balance;
	    }

	    // 저축 메소드
	    public long deposit(long amount) {
	        this.balance += amount;
	        return this.balance;
	    }

	    // 인출 메소드 (수정됨)
	    public long withdraw(long amount) {
	        if (amount > this.balance) {
	            System.out.println("인출 상한 금액을 초과했습니다. 현재 잔액: " + this.balance + "원");
	            return 0; // 인출 실패 시 0 반환
	        }
	        this.balance -= amount;
	        return this.balance;
	    }

	    public static void main(String[] args) {
	        // Account 객체 생성 및 초기화
	        Account myAccount = new Account("홍길동", 10000);
	        System.out.println("계좌주: " + myAccount.getOwner());
	        System.out.println("현재 잔액: " + myAccount.getBalance() + "원");

	        // 저축
	        myAccount.deposit(5000);
	        System.out.println("5000원 저축 후 잔액: " + myAccount.getBalance() + "원");

	        // 인출
	        long withdrawnAmount = myAccount.withdraw(3000);
	        System.out.println("3000원 인출 후 잔액: " + myAccount.getBalance() + "원");
	        System.out.println("인출된 금액: " + withdrawnAmount + "원");

	        // 인출 상한 초과 시도
	        myAccount.withdraw(20000);
	    }

}
