package study.practice.practice60;

public class StudentDTO {
//	자바에서 DB를 연동하여
//	DB에 있는 student 테이블에 있는 데이터 값을 조회 할 예정입니다.
//
//	StudentDAO 객체를 생성한 후, 관련 데이터 처리 메소드를 생성하며 진행합니다.
//	(*호출 부분 main 에서 DAO 객체 생성하여 활용)
//	아래 메소드를 생성해서 데이터를 획득하고, 콘솔창에 출력해보세요.
//
//	1. 기본 student 전체 조회 메소드
//
//	2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
//
//	- 리턴은 둘다 모두 List<> 타입으로 반환
//	- StudentDTO 객체 생성 필요
//	- 출력시 날짜는 1975-10-23 형식으로 출력할 것
//
//	아래 데이터를 저장하는 메소드를 만들어서 임의의 값을 세팅하고 저장해보세요.
//
//	3. StudentDTO 객체를 전달받아서 데이터를 저장(Insert)하는 메소드
//	- 데이터는 임의로 사이즈에 맞게 넣어주세요.
//	- 단, 저장시 birthday 날짜는 2000-05-31 로 저장해주세요

	int studno;
	String name;
	String id;
	int grade;
	int jumin;
	String birthday;
	String tel;
	int height;
	int weight;
	int deptno1;
	int deptno2;
	int profno;

	public StudentDTO() {
	}

	public StudentDTO(int studno, String name, String id, int grade, int jumin, String birthday, String tel, int height,
			int weight, int deptno1, int deptno2, int profno) {
		super();
		this.studno = studno;
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.jumin = jumin;
		this.birthday = birthday;
		this.tel = tel;
		this.height = height;
		this.weight = weight;
		this.deptno1 = deptno1;
		this.deptno2 = deptno2;
		this.profno = profno;
	}

	public int getStudno() {
		return studno;
	}

	public void setStudno(int studno) {
		this.studno = studno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getJumin() {
		return jumin;
	}

	public void setJumin(int jumin) {
		this.jumin = jumin;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDeptno1() {
		return deptno1;
	}

	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}

	public int getDeptno2() {
		return deptno2;
	}

	public void setDeptno2(int deptno2) {
		this.deptno2 = deptno2;
	}

	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
	}

	@Override
	public String toString() {
		return "StudentDTO [studno=" + studno + ", name=" + name + ", id=" + id + ", grade=" + grade + ", jumin="
				+ jumin + ", birthday=" + birthday + ", tel=" + tel + ", height=" + height + ", weight=" + weight
				+ ", deptno1=" + deptno1 + ", deptno2=" + deptno2 + ", profno=" + profno + "]";
	}

	// ------------------------------------------------------
	/*
	 * 
	 * import java.time.LocalDateTime;
	 * 
	 * import study.db.v3.ConvertDateUtil;
	 * 
	 * public class StudentDTO { int studno; String name; String id; int grade;
	 * String jumin;
	 * 
	 * //LocalDateTime birthday; String birthday; String tel; int height; int
	 * weight; int deptno1; int deptno2; int deptno1; // 기본값 : 0 무조건 숫자다. 무조건 값을
	 * 가져야한다. //int deptno2; // 기본값:null, Nullable 값이 Null일수도 있다! Integer deptno2;
	 * //Integer -> int 타입의 Wrapper 클래스 int profno;
	 * 
	 * 
	 * public int getStudno() { return studno; } public void setStudno(int studno) {
	 * this.studno = studno; } public String getName() { return name; } public void
	 * setName(String name) { this.name = name; } public String getId() { return id;
	 * } public void setId(String id) { this.id = id; } public int getGrade() {
	 * return grade; } public void setGrade(int grade) { this.grade = grade; }
	 * public String getJumin() { return jumin; } public void setJumin(String jumin)
	 * { this.jumin = jumin; } public String getBirthday() { return birthday; }
	 * public void setBirthday(String birthday) { this.birthday = birthday; } public
	 * String getTel() { return tel; } public void setTel(String tel) { this.tel =
	 * tel; } public int getHeight() { return height; } public void setHeight(int
	 * height) { this.height = height; } public int getWeight() { return weight; }
	 * public void setWeight(int weight) { this.weight = weight; } public int
	 * getDeptno1() { return deptno1; } public void setDeptno1(int deptno1) {
	 * this.deptno1 = deptno1; } public int getDeptno2() { public Integer
	 * getDeptno2() { return deptno2; } public void setDeptno2(int deptno2) { public
	 * void setDeptno2(Integer deptno2) { this.deptno2 = deptno2; } public int
	 * getProfno() { return profno; } public void setProfno(int profno) {
	 * this.profno = profno; }
	 * 
	 * @Override public String toString() { //birthday를 LocalDateTime 타입으로 한 경우
	 * //ConvertDateUtil.convertLocalDateTimeToString(birthday); return
	 * "StudentDTO [studno=" + studno + ", name=" + name + ", id=" + id + ", grade="
	 * + grade + ", jumin=" + jumin + ", birthday=" + birthday + ", tel=" + tel +
	 * ", height=" + height + ", weight=" + weight + ", deptno1=" + deptno1 +
	 * ", deptno2=" + deptno2 + ", profno=" + profno + "]"; }
	 * 
	 * 
	 * }
	 */

}
