package study.practice.practice57;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class findProductObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		자바에서 DB 연결 
//		단순 select 해서 데이터 읽어오기
//		대상 테이블 : product
//		1. 단일 행을 읽어서 리턴해서 출력하기		
		Product product = findDeptByP_CODE(100);
		if (product != null) {
			System.out.println(product.getP_CODE() + " " + product.getP_NAME() + " " + product.getP_PRICE());
		}
		
//		2. 객체 리스트 단위로 리턴해서 출력하기
		System.out.println("========findDeptList========");
		List<Product> productList = findProductList();
		if (productList == null)
			System.out.println("리스트가 없다 = 데이터가 없다");
		if (productList.size() == 0)
			System.out.println("리스트가 비어있다");
		if (productList != null) {
			for (Product p : productList) {
				System.out.println(p.getP_CODE() + " " + p.getP_NAME() + " " + p.getP_PRICE());
			}
		}
	}

	public static Product findDeptByP_CODE(int P_CODE) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String query = "select * from product where P_CODE = ?";
		Product product = null;

		try {

			psmt = conn.prepareStatement(query);
			psmt.setInt(1, P_CODE);
			rs = psmt.executeQuery();

			if (rs.next()) {

				product = new Product();

				product.setP_CODE(rs.getInt("P_CODE"));
				product.setP_NAME(rs.getString("P_NAME"));
				product.setP_PRICE(rs.getInt("P_PRICE"));

				return product;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static List<Product> findProductList() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String query = "select * from product";
		List<Product> productList = new ArrayList<Product>();
		try {
			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();

			while (rs.next()) {
				Product product = new Product(rs.getInt("P_CODE"), rs.getString("P_NAME"), rs.getInt("P_PRICE"));
				productList.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {

			if (rs != null)
				rs.close();

			if (psmt != null)
				psmt.close();

			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return productList;
	}

}
