package study.practice.Practice31;

public class Academy {

	String name;
	String address;
	int openYear;
	int studentCnt;
	int courseCnt;

	Academy() {
	}

	Academy(String name, int openYear) {
		this.name = name;
		this.openYear = openYear;
	}

	void addStudent(int value) {
		this.studentCnt += value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setOpenYear(int openYear) {
		this.openYear = openYear;
	}

	public void setStudentCnt(int studentCnt) {
		this.studentCnt = studentCnt;
	}

	public void setCourseCnt(int courseCnt) {
		this.courseCnt = courseCnt;
	}

	void printInfo() {
		System.out.println("학원 이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("개원년도 : " + openYear);
		System.out.println("학생수 : " + studentCnt);
		System.out.println("강의수 : " + courseCnt);
	}


}
