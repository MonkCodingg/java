package jdbcTest;

import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTest {
	public static void main(String args[]){
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.26.72:1521/DCSWCDB";
        String user = "c##scott";
        String password = "tiger";
        try {
        	Class.forName(driver);
        	System.out.println("jdbc driver �ε� ����");
        	DriverManager.getConnection(url, user, password);
        	System.out.println("����Ŭ ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver �ε� ����");
		} catch (SQLException e) {
			System.out.println("����Ŭ ���� ����");
		}
    }
}
