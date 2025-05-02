package study.practice.practice34;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		
//		s1.lesson="police";
//		s1.studentNumber=20256100;
//		
//		System.out.println(s1.lesson);
//		System.out.println(s1.studentNumber);
		
		
		Student s2 = new Student();
		s2.setLesson("police");
		s2.setStudentNumber(20256100);
		
		System.out.println(s2.getLesson());
		System.out.println(s2.getStudentNumber());
	}

}
