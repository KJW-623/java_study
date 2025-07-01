package study.practice.practice61;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;

public class StudentScoreDAO {

//	특정 학과번호 조회 조건으로 전달하여,
//	학과번호를 기준으로
//	student, score, hakjum 테이블을 활용하여 다음 정보를 출력하세요.
//	각 학생 별로 점수가 몇점이고 그 점수가 어떤 학점인지를 확인하고 싶습니다.
//	학번 이름 점수 학점 순으로 조회하세요.
//
//	위 문제의 기준과 동일한 형태로 쿼리를 작성하고,
//	작성된 쿼리를 자바에서 DB 연동을 통해 데이터를 조회한후,
//	화면에 출력하세요.
//
//	(필요시, DAO, DTO 등 자유롭게 추가하셔도 됩니다.)

		Connection conn;
		PreparedStatement psmt;
		ResultSet rs;

		public List<StudentScoreDTO> findStudentScoreListByDeptno(int deptno) {

			conn = DBConnectionManager.connectDB();
			String query = " select st.studno, st.name, sc.total, hj.grade "
					+ " from student st, score sc, hakjum hj "
					+ " where st.studno = sc.studno "
					+ " AND sc.total BETWEEN hj.min_point AND hj.max_point "
					+ " AND st.deptno1 = ? " ;

			List<StudentScoreDTO> sList = new ArrayList<StudentScoreDTO>();

			try {
				psmt = conn.prepareStatement(query);

				psmt.setInt(1, deptno);
				rs = psmt.executeQuery(); 

				while(rs.next()) {
					StudentScoreDTO s = new StudentScoreDTO();

					s.setStudno(rs.getInt("studno"));
					s.setName(rs.getString("name"));
					s.setTotal(rs.getInt("total"));
					s.setGrade(rs.getString("grade"));
					
					sList.add(s);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBConnectionManager.disconnectDB(conn, psmt, rs);

			return sList;
		}
}
