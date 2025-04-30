package study.practice.practice29;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Member mem1 = new Member();
	        mem1.memberNumber = 1;
	        mem1.age = 28;
	        mem1.loginId = "memId";
	        mem1.name = "이준호";
	        mem1.signUpDate = "20220815";
	        mem1.printInfo();

	        Member mem2 = new Member(40, "정명석");
	        mem2.memberNumber = 2;
	        mem2.setIdAndSignUpDate("seok", "20220701");
	        mem2.printInfo();

	        Member mem3 = new Member(27, "우영우", "wootothe", "20220816");
	        mem3.setMemberNumber(3);
	        mem3.printInfo();
		
	}

}
