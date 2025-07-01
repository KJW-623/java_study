package study.practice.practice60;

import java.util.List;

public class Practice60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		자바에서 DB를 연동하여
//		DB에 있는 student 테이블에 있는 데이터 값을 조회 할 예정입니다.
//
//		StudentDAO 객체를 생성한 후, 관련 데이터 처리 메소드를 생성하며 진행합니다.
//		(*호출 부분 main 에서 DAO 객체 생성하여 활용)
//		아래 메소드를 생성해서 데이터를 획득하고, 콘솔창에 출력해보세요.
//
//		1. 기본 student 전체 조회 메소드
//
//		2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
//
//		- 리턴은 둘다 모두 List<> 타입으로 반환
//		- StudentDTO 객체 생성 필요
//		- 출력시 날짜는 1975-10-23 형식으로 출력할 것
//
//		아래 데이터를 저장하는 메소드를 만들어서 임의의 값을 세팅하고 저장해보세요.
//
//		3. StudentDTO 객체를 전달받아서 데이터를 저장(Insert)하는 메소드
//		- 데이터는 임의로 사이즈에 맞게 넣어주세요.
//		- 단, 저장시 birthday 날짜는 2000-05-31 로 저장해주세요.

		StudentDAO studentDAO = new StudentDAO();

		// 1. 기본 student 전체 조회 메소드
		List<StudentDTO> list = studentDAO.findStudentList();
		for (StudentDTO s : list) {
			System.out.println(s);
		}

		System.out.println("--------------------------------");

		// 2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
		List<StudentDTO> list2 = studentDAO.findStudentListByGrade(3);
		for (StudentDTO s : list2) {
			System.out.println(s);
		}

		System.out.println("--------------------------------");

		// 3. StudentDTO 객체를 전달받아서 데이터를 저장(Insert)하는 메소드
		StudentDTO newStudent = new StudentDTO();

		newStudent.setStudno(2025);
		newStudent.setName("김철수");
		newStudent.setId("철수");
		newStudent.setGrade(2);
		newStudent.setJumin(2147483647);
		newStudent.setBirthday("2000-05-31");
		newStudent.setTel("055)333-6328");
		newStudent.setHeight(164);
		newStudent.setWeight(50);
		newStudent.setDeptno1(101);
		newStudent.setDeptno2(201);
		newStudent.setProfno(1001);

		int rs1 = studentDAO.saveStudent(newStudent);
		if (rs1 > 0) {
			System.out.println("저장이 성공했다~");
		}

		// --------------------------
		/*
		 * mport java.util.List;
		 * 
		 * public class Practice51 {
		 * 
		 * public static void main(String[] args) {
		 * 
		 * StudentDAO studentDAO = new StudentDAO();
		 * 
		 * 
		 * StudentDTO studentDTO = new StudentDTO();
		 * 
		 * studentDTO.setStudno(9988); studentDTO.setName("name");
		 * studentDTO.setId("Id"); studentDTO.setGrade(5);
		 * studentDTO.setJumin("0011111234567"); studentDTO.setBirthday("2000-05-31");
		 * studentDTO.setTel("031)123-1234"); studentDTO.setHeight(190);
		 * studentDTO.setWeight(90); studentDTO.setDeptno1(401);
		 * studentDTO.setDeptno2(501); studentDTO.setProfno(9999);
		 * 
		 * StudentDTO studentDTO2 = new StudentDTO();
		 * 
		 * studentDTO2.setStudno(9999); studentDTO2.setName("name3");
		 * studentDTO2.setId("Id3"); studentDTO2.setGrade(5);
		 * studentDTO2.setJumin("0011111234567"); studentDTO2.setBirthday("2000-05-31");
		 * //studentDTO2.setTel("031)123-1234"); studentDTO2.setTel(null);
		 * studentDTO2.setHeight(190); studentDTO2.setWeight(90);
		 * studentDTO2.setDeptno1(401); studentDTO2.setDeptno2(null);
		 * studentDTO2.setProfno(9999);
		 * 
		 * int result = studentDAO.saveStudent(studentDTO2);
		 * 
		 * List<StudentDTO> list; //List<int> list2; List<Integer> list2;
		 * 
		 * if(result > 0) System.out.println("저장 성공~"); }
		 */

	}

}
