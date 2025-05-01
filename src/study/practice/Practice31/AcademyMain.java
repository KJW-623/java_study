package study.practice.Practice31;

public class AcademyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Academy aca1 = new Academy();
		Academy aca2 = new Academy("휴먼아카데미", 2015);

		aca1.setName("동물아카데미");
		aca1.setAddress("아산");
		aca1.setCourseCnt(3);
		aca1.setStudentCnt(10);

		aca2.address = "천안";
		aca2.courseCnt = 6;
		aca2.studentCnt = 150;

		aca1.printInfo();
		aca2.printInfo();

		aca2.addStudent(50);
		aca1.courseCnt = 5;
		aca1.studentCnt = aca1.studentCnt + 20;
		aca1.setOpenYear(2021);
		System.out.println();

		aca1.printInfo();
		aca2.printInfo();


	}

}
