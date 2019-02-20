package jFreeChart;

import java.awt.Font;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;

import org.jfree.chart.JFreeChart;

import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class JDBC_PieChart extends JFrame {

	private static final long serialVersionUID = 1L;

	public JDBC_PieChart(String title) throws ClassNotFoundException, SQLException, IOException {
		super(title);

		// Create dataset
		PieDataset dataset = createDataset();

		// Create chart
		JFreeChart chart = ChartFactory.createPieChart("서울시 행정구역별 \n 2030여성고객 백분율", dataset, true, true, false);
		chart.getTitle().setFont(new Font("굴림", Font.BOLD, 16));
		chart.getLegend().setItemFont(new Font("굴림", Font.PLAIN, 13));

		// Format Label
		PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} : ({2})",
				new DecimalFormat("0"), new DecimalFormat("0%"));

		PiePlot pPlot = (PiePlot) chart.getPlot();
		pPlot.setLabelFont(new Font("굴림", Font.PLAIN, 13));
		pPlot.setLabelGenerator(labelGenerator);

		// Create Panel
		ChartPanel panel = new ChartPanel(chart);
		setContentPane(panel);
	}

	public PieDataset createDataset() throws ClassNotFoundException, SQLException, IOException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("연결 성공");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		String url = "jdbc:oracle:thin:@192.168.26.72:1521/DCSWCDB";
		// 프로토콜:oracle:드라이버타입:@호스트:포트번호:SID
		// url은 DBMS사마다 다르다.
		String user = "DCSW15";
		String password = "CD15";
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("DB연결됨");
		Statement stmt = conn.createStatement();

		// 4. SQL문 작성
		String sql = "SELECT * FROM"
				+ "(SELECT SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'구',5)-3) AS \"행정구역\", "
				+ "COUNT( CASE WHEN ADDRESS1 LIKE SUBSTR(ADDRESS1,1,INSTR(ADDRESS1,'구',5))||'%' THEN 1 END) AS \"2030여성수\" "
				+ "FROM CUSTOMER " 
				+ "WHERE ADDRESS1 LIKE '서울 %' " 
				+ "AND GENDER='F' "
				+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)<40 "
				+ "AND FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE(BIRTH_DT))/12)>=20 "
				+ "GROUP BY SUBSTR( ADDRESS1, 4, INSTR(ADDRESS1,'구',5)-3)) " 
				+ "ORDER BY \"2030여성수\"";

		// 5. sql문을 DB에 전송(실행)
		ResultSet rset = stmt.executeQuery(sql); // 결과 테이블 반환

		DefaultPieDataset dataset = new DefaultPieDataset();
		while (rset.next()) {
			dataset.setValue(rset.getString("행정구역"), rset.getInt("2030여성수"));
		}
		rset.close();
		stmt.close();
		conn.close();

		return dataset;

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JDBC_PieChart example;
			try {
				example = new JDBC_PieChart("JDBC 시각화 2");
				example.setSize(800, 400);
				example.setLocationRelativeTo(null);
				example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				example.setVisible(true);
			} catch (ClassNotFoundException | SQLException | IOException e) {

				e.printStackTrace();
			}

		});
	}

}
