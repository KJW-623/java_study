package study.practice.practice58;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import study.db.v2.DBConnectionManager;
import study.practice.practice58.Professor;

public class FindProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 참조테이블 : professor

		// DB 의 professor 테이블에서 profno, name, id, position, pay, deptno 정보를
		// 조회하는 메소드를 생성하시오.
		// main 에서 호출하며 조회 결과를 출력하는 기능을 제공한다.
		// 단 쿼리는 WHERE 조건을 deptno = 를 비교하여 조회하는 형태로 작성하시오.
		// 필요한 deptno 는 해당 메소드의 파라미터로 전달 받아서 쿼리에 활용하시오.

		// ex) findProfessorListByDeptno(int deptno)

//		Professor professor = findProfessorByDeptno(101);
//		if (professor == null) {
//			System.out.println("조회된 데이터가 없다!");
//		}
//		if (professor != null) {
//			System.out.println(professor.getProfno() + " " + professor.getName() + " " + professor.getId() + 
//								professor.getPosition() + " " + professor.getPay() + " " + professor.getDeptno());
//		}
//		
//		System.out.println("*********** findProfessorList() ***************");
//		List<Professor> professorList = findProfessorList();
//		if (professorList == null)
//			System.out.println("리스트가 없다 = 데이터가 없다");
//
//		if (professorList.size() == 0)
//			System.out.println("리스트가 비어있다");
//
//		if (professorList != null) {
//
//			for (Professor p : professorList) {
//				System.out.println(p.getProfno() + " " + p.getName() + " " + p.getId() +
//										p.getPosition() + " " + p.getPay() + " " + p.getDeptno());
//			}
//
//		}

		// ------------------------------------------------------

		List<Professor> pList = findProfessorListByDeptno(201);

		for (Professor p : pList) {
			System.out.println(p);
		}

	}

	public static Professor findProfessorByDeptno(int deptno) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		conn = DBConnectionManager.connectDB();

		String query = "select * from professor where deptno = ? ";

		Professor professor = null;

		try {
			psmt = conn.prepareStatement(query);
			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			if (rs.next()) {

				professor = new Professor();

				professor.setProfno(rs.getInt("PROFNO"));
				professor.setName(rs.getString("NAME"));
				professor.setId(rs.getString("ID"));
				professor.setPosition(rs.getString("POSITION"));
				professor.setPay(rs.getInt("PAY"));
				professor.setDeptno(rs.getInt("DEPTNO"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return professor;

	}

	public static List<Professor> findProfessorList() {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		conn = DBConnectionManager.connectDB();

		String query = "select * from professor";

		List<Professor> professorList = new ArrayList<Professor>();

		try {

			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();

			while (rs.next()) {

				Professor professor = new Professor(rs.getInt("PROFNO"), rs.getString("NAME"), rs.getString("ID"),
						rs.getString("POSITION"), rs.getInt("PAY"), rs.getInt("DEPTNO"));
				professorList.add(professor);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return professorList;
	}

	// ------------------------------------------------

	public static List<Professor> findProfessorListByDeptno(int deptno) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		conn = DBConnectionManager.connectDB();
		String query = "select profno, name, id, position, pay, deptno " + " from professor where deptno = ?";

		List<Professor> professorList = new ArrayList<Professor>();

		try {
			psmt = conn.prepareStatement(query);

			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();

			while (rs.next()) {
				Professor p = new Professor(rs.getInt("profno"), rs.getString("name"), rs.getString("id"),
						rs.getString("position"), rs.getInt("pay"), rs.getInt("deptno"));
				professorList.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return professorList;

	}

}
