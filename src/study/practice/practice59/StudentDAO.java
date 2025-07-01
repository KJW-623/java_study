package study.practice.practice59;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v2.Dept;
import study.practice.practice58.Professor;

public class StudentDAO {
	
	/*
	자바에서 DB를 연동하여
	DB에 있는 student 테이블에 있는 데이터 값을 조회 할 예정입니다.

	StudentDAO 객체를 생성한 후, 관련 데이터 처리 메소드를 생성하며 진행합니다.
	(*호출 부분 main 에서 DAO 객체 생성하여 활용)
	아래 메소드를 생성해서 데이터를 획득하고, 콘솔창에 출력해보세요.

	1. 기본 student 전체 조회 메소드

	2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드

	- 리턴은 둘다 모두 List<> 타입으로 반환
	- StudentDTO 객체 생성 필요
	- 출력시 날짜는 1975-10-23 형식으로 출력할 것
	*/

	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	//1. 기본 student 전체 조회 메소드
	public List<StudentDTO> findStudentDTOList() {
		
		conn = DBConnectionManager.connectDB();
		
		String query = "select studno, name, id, grade, jumin, "
				+ " TO_CHAR(birthday, 'YYYY-MM-DD') birthday, tel, height, weight, deptno1, deptno2, profno "
				+ " from student ";
		
		List<StudentDTO> studentDTOList = new ArrayList<StudentDTO>();

		try {
			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();
			while (rs.next()) {
				StudentDTO studentDTO = new StudentDTO(rs.getInt("studno"), 
													   rs.getString("name"), 
													   rs.getString("id"),
													   rs.getInt("grade"), 
													   rs.getInt("jumin"), 
													   rs.getString("birthday"), 
													   rs.getString("tel"), 
													   rs.getInt("height"),
													   rs.getInt("weight"),
													   rs.getInt("deptno1"),
													   rs.getInt("deptno2"),
													   rs.getInt("profno"));
				studentDTOList.add(studentDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		return studentDTOList;
	}
	
	//2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
	public List<StudentDTO> findStudentDTOListByGrade(int grade) {

		conn = DBConnectionManager.connectDB();
		String query = "select studno, name, id, grade, jumin, "
				+ " TO_CHAR(birthday, 'YYYY-MM-DD') birthday, tel, height, weight, deptno1, deptno2, profno "
				+ " from student where grade = ? ";

		List<StudentDTO> studentDTOList = new ArrayList<StudentDTO>();

		try {
			psmt = conn.prepareStatement(query);
			psmt.setInt(1, grade);
			rs = psmt.executeQuery();

			while (rs.next()) {
				StudentDTO s = new StudentDTO(rs.getInt("studno"), 
											   rs.getString("name"), 
											   rs.getString("id"),
											   rs.getInt("grade"), 
											   rs.getInt("jumin"), 
											   rs.getString("birthday"), 
											   rs.getString("tel"), 
											   rs.getInt("height"),
											   rs.getInt("weight"),
											   rs.getInt("deptno1"),
											   rs.getInt("deptno2"),
											   rs.getInt("profno"));
				studentDTOList.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		return studentDTOList;
	}
	
	
	//------------------------------------------------------
	/*
	 import java.sql.Connection;Add commentMore actions
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v3.ConvertDateUtil;
import study.db.v3.Professor;

public class StudentDAO {

	// DB연결 및 사용시 필요한 객체
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	
	//전체 조회
	public List<StudentDTO> findStudentList(){
		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		//String query = "select * from student ";
		String query = "select studno, name, id, grade, jumin, "
					+ " TO_CHAR(birthday, 'YYYY-MM-DD') birthday , tel, height, "
					+ " weight, deptno1, deptno2, profno "
				    + " from student ";

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// 해당 행에 컬럼 단위로 데이터 접근
				StudentDTO s = new StudentDTO();
				
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));
				
				//s.setBirthday( ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				s.setBirthday( rs.getString("birthday"));
				
				s.setTel(rs.getString("tel"));
				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));
				
				studentList.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return studentList;
	}

	//학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
	public List<StudentDTO> findStudentListByGrade(int grade){
		
		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		//String query = "select * from student ";
		String query = "select studno, name, id, grade, jumin, "
					+ " TO_CHAR(birthday, 'YYYY-MM-DD') birthday , tel, height, "
					+ " weight, deptno1, deptno2, profno "
				    + " from student "
					+ " where grade = ? ";

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, grade);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// 해당 행에 컬럼 단위로 데이터 접근
				StudentDTO s = new StudentDTO();
				
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));
				
				//s.setBirthday( ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				s.setBirthday( rs.getString("birthday"));
				
				s.setTel(rs.getString("tel"));
				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));
				
				studentList.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return studentList;
		
	}
}
	 
	 */
	
	

}
