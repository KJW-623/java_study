package study.practice.practice58;

public class Professor {
	
	//참조테이블 : professor

	//DB 의 professor 테이블에서 profno, name, id, position, pay, deptno 정보를
	//조회하는 메소드를 생성하시오.
	//main 에서 호출하며 조회 결과를 출력하는 기능을 제공한다.
	//단 쿼리는 WHERE 조건을 deptno = 를 비교하여 조회하는 형태로 작성하시오.
	//필요한 deptno 는 해당 메소드의 파라미터로 전달 받아서 쿼리에 활용하시오.

	//ex) findProfessorListByDeptno(int deptno)
	
	int Profno;
	String Name;
	String Id;
	String Position;
	int Pay;
	int Deptno;
	
	public Professor() {}

	public Professor(int profno, String name, String id, String position, int pay, int deptno) {
		super();
		Profno = profno;
		Name = name;
		Id = id;
		Position = position;
		Pay = pay;
		Deptno = deptno;
	}

	public int getProfno() {
		return Profno;
	}

	public void setProfno(int profno) {
		Profno = profno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public int getPay() {
		return Pay;
	}

	public void setPay(int pay) {
		Pay = pay;
	}

	public int getDeptno() {
		return Deptno;
	}

	public void setDeptno(int deptno) {
		Deptno = deptno;
	}

	@Override
	public String toString() {
		return "Professor [Profno=" + Profno + ", Name=" + Name + ", Id=" + Id + ", Position=" + Position + ", Pay="
				+ Pay + ", Deptno=" + Deptno + "]";
	}
	
	
	
	

}
