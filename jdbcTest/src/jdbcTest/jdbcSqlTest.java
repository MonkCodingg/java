package jdbcTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcSqlTest {

	public static void main(String args[]) {
		Connection conn = null; // DB����� ����(����)�� ���� ��ü
		PreparedStatement pstm = null; // SQL ���� ��Ÿ���� ��ü
		ResultSet rs = null; // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü

		try {
			// SQL ������ ����� ���� ������ ���Ǿ�(SELECT��)���
			// �� ����� ���� ResulSet ��ü�� �غ��� �� �����Ų��.
			String quary = "SELECT * FROM"
					+ "(SELECT SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'��',5)-3) AS \"��������\", "
							+ "COUNT( CASE WHEN ADDRESS1 LIKE SUBSTR(ADDRESS1,1,INSTR(ADDRESS1,'��',5))||'%' THEN 1 END) AS \"2030������\" "
					+ "FROM CUSTOMER " 
					+ "WHERE ADDRESS1 LIKE '���� %' " 
					+ "AND GENDER='F' "
					+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)<40 "
					+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)>=20 "
					+ "GROUP BY SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'��',5)-3)) " + "ORDER BY \"2030������\"";

			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(quary);
			rs = pstm.executeQuery();

			System.out.println("============================================");

			while (rs.next()) {

				String location = rs.getString("��������");
				int female2030Num = rs.getInt("2030������");
				String result = location + " " + female2030Num;
				System.out.println(result);
			}

		} catch (SQLException sqle) {
			System.out.println("SELECT������ ���� �߻�");
			sqle.printStackTrace();

		} finally {
			// DB ������ �����Ѵ�.
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
