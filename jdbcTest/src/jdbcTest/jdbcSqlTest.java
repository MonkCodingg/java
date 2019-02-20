package jdbcTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcSqlTest {

	public static void main(String args[]) {
		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		PreparedStatement pstm = null; // SQL 문을 나타내는 객체
		ResultSet rs = null; // 쿼리문을 날린것에 대한 반환값을 담을 객체

		try {
			// SQL 문장을 만들고 만약 문장이 질의어(SELECT문)라면
			// 그 결과를 담을 ResulSet 객체를 준비한 후 실행시킨다.
			String quary = "SELECT * FROM"
					+ "(SELECT SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'구',5)-3) AS \"행정구역\", "
							+ "COUNT( CASE WHEN ADDRESS1 LIKE SUBSTR(ADDRESS1,1,INSTR(ADDRESS1,'구',5))||'%' THEN 1 END) AS \"2030여성수\" "
					+ "FROM CUSTOMER " 
					+ "WHERE ADDRESS1 LIKE '서울 %' " 
					+ "AND GENDER='F' "
					+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)<40 "
					+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)>=20 "
					+ "GROUP BY SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'구',5)-3)) " + "ORDER BY \"2030여성수\"";

			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(quary);
			rs = pstm.executeQuery();

			System.out.println("============================================");

			while (rs.next()) {

				String location = rs.getString("행정구역");
				int female2030Num = rs.getInt("2030여성수");
				String result = location + " " + female2030Num;
				System.out.println(result);
			}

		} catch (SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();

		} finally {
			// DB 연결을 종료한다.
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
