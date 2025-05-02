package study.practice.practice34;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Account testAccount = new Account("김철수", 20000);
        System.out.println("\n[AccountTest 실행]");
        System.out.println("계좌주: " + testAccount.getOwner());
        System.out.println("현재 잔액: " + testAccount.getBalance() + "원");

        // 인출 상한 이상의 금액을 인출 시도
        long attemptWithdrawal = 25000;
        System.out.println(attemptWithdrawal + "원 인출 시도:");
        testAccount.withdraw(attemptWithdrawal);
        System.out.println("현재 잔액: " + testAccount.getBalance() + "원");
	}

}
